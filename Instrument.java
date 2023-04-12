/**
 * This project is based on Java Programming.
 * Instrument class is the super class of this project.
 * In this project, Instrument class is the super class of two subclasses InstrumentToRent and InstrumentToSell.
 * 
 * @author (Ripesh Khadka)
 * @date (March 9,2022)
 */
public class Instrument
{
    //instance variable
    private static int instrumentID;
    private String instrumentName;
    private String customerName;
    private String customerMobileNumber;
    private int customerPAN;
    /**
     * Constructor for object of Instrument class
     * @params instrumentName
     */
    public Instrument(String instrumentName)
    {
        instrumentID +=1;
        this.instrumentName=instrumentName;
        this.customerName="";
        this.customerMobileNumber="";
        this.customerPAN=0;
    }
     /**
     * creating setter method setInstrumentID.
     * @params instrumentID
     * set values in instance varibales from parameter
     */ 
        public void setInstrumentID(int instrumentID){
            this.instrumentID=instrumentID;
        }
     /**
     * creating setter method setInstrumentName.
     * @params instrumentName
     * set values in instance varibales from parameter
     */ 
        public void setInstrumentName(String instrumentName)
        {
            this.instrumentName=instrumentName;
        }
        /**
     * creating setter method setCustomerName.
     * @params customerName
     * set values in instance varibales from parameter
     */ 
        public void setCustomerName(String customerName)
        {
            this.customerName=customerName;
        }
        /**
     * creating setter method setMobileNumber.
     * @params mobileNumber
     * set values in instance varibales from parameter
     */ 
        public void setCustomerMobileNumber(String customerMobileNumber)
        {
            this.customerMobileNumber=customerMobileNumber;
        }
        /**
     * creating setter method setCustomerPAN.
     * @params customerPAN
     * set values in instance varibales from parameter
     */ 
        public void setCustomerPAN(int customerPAN)
        {
            this.customerPAN=customerPAN;
        }
     /**
     * creating getter method getInstrumentID.
     * returns instrumentID from instance variables
     */
        public int getInstrumentID()
        {
            return this.instrumentID;
        }
     /**
     * creating getter method getInstrumentName.
     * returns instrumentName from instance variables
     */
        public String getInstrumentName()
        {
            return this.instrumentName;
        }
     /**
     * creating getter method getCustomerName.
     * returns customerName from instance variables
     */
        public String getCustomerName()
        {
            return this.customerName;
        }
     /**
     * creating getter method getCustomerMobileNumber.
     * returns customerMobileNumber from instance variables
     */
        public String getCustomerMobileNumber()
        {
            return this.customerMobileNumber;
        }
     /**
     * creating getter method getCustomerPAN.
     * returns customerPAN from instance variables
     */
        public int getCustomerPAN()
        {
            return this.customerPAN;
        }
     /**
         * creating display method.
         */
        public void display()
        {
            System.out.println("The instrument Id is "+instrumentID+" and the name of Instrument is "+this.instrumentName);
                if(!customerName.equals("") && !customerMobileNumber.equals("") && customerPAN!=(0)) {
                System.out.println("Customer name: "+this.customerName);
                System.out.println("Mobile no.:"+this.customerMobileNumber);
                System.out.println("Customer PAN no.:"+this.customerPAN);
                }
        }
    }
