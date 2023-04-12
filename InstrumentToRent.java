/**
 * This project is based on Java Programming.
 * InstrumentToRent class is the subclass of this project.
 * In this project, Instrument class is the super class of two subclasses InstrumentToRent and InstrumentToSell.
 * 
 * @author (Ripesh Khadka)
 * @date (March 9,2022)
 */
public class InstrumentToRent extends Instrument    //Instrument class inherited by InstrumentToRent
{
    //instance variables.
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    
    /**
     * constructor for object of InstrumentToRent class.
     * @params instrumentName, chargePerDay
     */
    public InstrumentToRent(String instrumentName, int chargePerDay)
    {
        super(instrumentName);//passing the instrument in super class
        this.chargePerDay=chargePerDay;
        this.dateOfRent="";
        this.dateOfReturn="";
        this.noOfDays=0;
        this.isRented=false;
    }
    /**
     * creating setter method setChargePerDay.
     * @params chargePerDay
     * set values in instance varibales from parameter
     */
    public void setChargePerDay(int chargePerDay)
    {
        this.chargePerDay=chargePerDay;
    }
        /**
     * creating setter method setDateOfRent.
     * @params chargePerDay
     * set values in instance varibales from parameter
     */
    public void setDateOfRent(String dateOfRent)
    {
        this.dateOfRent=dateOfRent;
    }
    /**
     * creating setter method setDateOfReturn.
     * @params dateOfReturn
     * set values in instance varibales from parameter
     */
    public void setDateOfReturn(String dateOfReturn)
    {
        this.dateOfReturn=dateOfReturn;
    }
    /**
     * creating setter method setNoOfDays.
     * @params noOfDays
     * set values in instance varibales from parameter
     */
    public void setNoOfDays(int noOfDays)
    {
        this.noOfDays=noOfDays;
    }
    /**
     * creating setter method setIsRented.
     * @params isRented
     * set values in instance varibales from parameter
     */
    public void setIsRented(boolean isRented)
    {
        this.isRented=isRented;
    }
    /**
     * creating getter method getChargePerDay.
     * returns chargePerDay from instance variables
     */
    public int getChargePerDay()
    {
        return this.chargePerDay;
    }
    /**
     * creating getter method getDateOfRent.
     * returns dateOfReturn from instance variables
     */
    public String getDateOfRent()
    {
         return this.dateOfRent;
    }
    /**
     * creating getter method getDateOfReturn.
     * returns dateOfReturn from instance variables
     */
    public String getDateOfReturn()
    {
        return this.dateOfReturn;
    }
    /**
     * creating getter method getNoOfDays.
     * returns noOfDays from instance variables
     */
    public int getNoOfDays()
    {
         return this.noOfDays;
    }
    /**
     * creating getter method getIsRented.
     * returns isRented from instance variables
     */
    public boolean getIsRented()
    {
         return this.isRented;
    }
    /**
     * creating rent method.
     * @params customerName, customerMobileNumber, customerPAN, rentedDate, returnedDate, noOfRentedDays
     */
    public void rent(String customerName,String customerMobileNumber,int customerPAN,String rentedDate,String returnedDate, int noOfRentedDays)
    {
        if(isRented==true) {
            System.out.println("The Instrument is Already Rented by "+customerName+" and will return it on "+returnedDate);
            System.out.println("Contact: "+customerMobileNumber);
        }
        else {
            super.setCustomerName(customerName);// passing the customerName in super class
            super.setCustomerMobileNumber(customerMobileNumber);// passing the customerMobileNumber in super class
            super.setCustomerPAN(customerPAN);// passing the customerPAN in super class
            this.dateOfRent=rentedDate;
            this.dateOfReturn=returnedDate;
            this.noOfDays=noOfRentedDays;
            this.isRented=true;
            System.out.println("Instrument Rented Successfully..");
            System.out.println("Rented By: "+customerName);
            System.out.println("Mobile Number: "+customerMobileNumber);
            System.out.println("Date Of Renting: "+rentedDate);
            System.out.println("Return Date: "+returnedDate);
            System.out.println("No of Days: "+noOfRentedDays);
            System.out.println("Total Charge: "+chargePerDay*noOfRentedDays);
        }
    }
    /**
     * creating returnInstrument method.
     */
    public void returnInstrument()
    {
        if(isRented==false) {
            System.out.println("The Instrument is not rented.");
        }
        else {
            this.setCustomerName("");
            this.setCustomerMobileNumber("");
            this.setCustomerPAN(0);
            this.setDateOfReturn("");
            this.setDateOfRent("");
            this.setNoOfDays(0);
            this.setIsRented(false);
        }
    }
    /**
     * creating display method.
     */
    public void display()
    {
        super.display();// calling the display method of super class.
        if(isRented==true) {
            System.out.println("Instrument is already rented...");
            System.out.println("Rented By: "+super.getCustomerName());//getting the customerName from super class
            System.out.println("Contact: "+super.getCustomerMobileNumber());//getting the customerMobileNumber from super class
            System.out.println("Rented date: "+getDateOfRent());
            System.out.println("Will return on: "+getDateOfReturn());
        }
    }
}