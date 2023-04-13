package pckg_telephony;

public class PhoneCall {
    private Telephone caller;
    private String caller_name;

    private Telephone called;
    private String called_name;

    boolean MakeCall(Telephone caller, Telephone called)
    {
        boolean result = false;

        if((!caller.getOccupied())&&(!called.getOccupied())){
            this.caller = caller;
            this.caller_name = caller.getOwner();
            caller.setOccupied(true);

            this.called = called;
            this.called_name = called.getOwner();
            called.setOccupied(true);
            result = true;
        }
        return result;
    }
}
