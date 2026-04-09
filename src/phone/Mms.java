package phone;

public class Mms implements Message{
    @Override
    public void send() {
        System.out.println("MMS 전송을 시작합니다.");
    }
}
