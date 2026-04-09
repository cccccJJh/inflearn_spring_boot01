package phone;

public class Sms implements Message{
    @Override
    public void send() {
        System.out.println("SMS 전송을 시작합니다.");
    }
}
