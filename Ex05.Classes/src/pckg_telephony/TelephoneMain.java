package pckg_telephony;

public class TelephoneMain {
    public static void main(String[] args)
    {
        Telephone caller = new Telephone("123456","Almo");
        Telephone called = new Telephone("8888888","Ogi");

        PhoneCall phone_call = new PhoneCall();

        if(phone_call.MakeCall(caller,called)){
            System.out.println(caller.getOwner() + " Called " + called.getOwner());
        }
        else{
            System.out.println(caller.getOwner() + " Call failed!");
        }
    }
}
