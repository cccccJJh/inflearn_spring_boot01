package phone;

public class PhoneAssembler {
    Phone phone ;
    Message sms;
    Message mms;

    public PhoneAssembler(){
        this.sms = new Sms();
        this.mms = new Mms();
    }

    public PhoneAssembler(Message sms, Message mms){
        this.sms = sms;
        this.mms = mms;
    }

    public void sendSms(){
        phone = new Phone(sms);
        phone.pushMessageButton();
    }

    public void sendMms(){
        phone = new Phone(mms);
        phone.pushMessageButton();
    }
}
