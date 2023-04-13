package pckg_telephony;

public class Telephone
{
    private String line_number;
    public String getLineNumber(){
        return this.line_number;
    }

    private String line_owner;
    public String getOwner(){
        return this.line_owner;
    }

    private boolean occupied;
    public boolean getOccupied() {
        return  this.occupied;
    }
    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }


    Telephone(String number, String owner)
    {
        this.line_number = number;
        this.line_owner = owner;
        this.occupied = false;
        return;
    }

}