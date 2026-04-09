package phone;

public class MainClass {

    public static void main(String[] args) {
        /*
        문제점 :
        Phone이 Message를 직접 생성해서 강한 결합 발생
        만약,, Message가 변경 되면 Phone 코드도 수정해야 한다.

        Phone phone = new Phone();
        phone.pushMessageButton();
        */


        /*
        Message message = new Sms();
        Phone phone = new Phone(message);
        phone.pushMessageButton();
        */

        PhoneAssembler phone = new PhoneAssembler();
        phone.sendMms();
        phone.sendSms();

        System.out.println();
        System.out.println();
        System.out.println();
        PhoneAssembler phoneAssembler = new PhoneAssembler(new Sms(), new Mms());
        phoneAssembler.sendMms();
        phoneAssembler.sendSms();
    }
}
