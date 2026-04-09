package phone;

public class Phone {

    private Message message;

    public Phone(Message message) {
        this.message = message;
    }

    public void pushMessageButton(){
        message.send();
        System.out.println("메시지를 보냈습니다.");
    }
}
