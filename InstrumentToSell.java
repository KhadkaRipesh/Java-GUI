/**
 * This project is based on Java Programming.
 * InstrumentToSell class is the subclass of this project.
 * In this project, Instrument class is the super class of two subclasses InstrumentToRent and InstrumentToSell.
 * 
 * @author (Ripesh Khadka)
 * @date (March 9,2022)
 */
public class InstrumentToSell extends Instrument 
{
    //instance variables.
    private int price;
    private String sellDate;
    private int discountPercent;
    private boolean isSold;
    /**
     * construtor for object of InstrumentToSell class.
     * @params instrumentName, price
     */
    public InstrumentToSell(String instrumentName,int price)
    {
        super(instrumentName);//passing the instrumentName in super class.
        this.price=price;
        this.sellDate="";
        this.discountPercent=0;
        this.isSold=false;
    }
    /**
     * creating setter method setPrice.
     * @params price
     * set values in instance varibales from parameter
     */
    public void setPrice(int price)
    {
    if(isSold==false) {
            this.price=price;
        }
        else {
            System.out.println("The instrument is already sold.");
        }
    }
    /**
     * creating setter method setSellDate.
     * @params sellDate
     * set values in instance varibales from parameter
     */
    public void setSellDate(String sellDate)
    {
        this.sellDate=sellDate;
    }
    /**
     * creating setter method setDiscountPercent.
     * @params discountPercent
     * set values in instance varibales from parameter
     */
    public void setDiscountPercent(int discountPercent)
    {
        this.discountPercent=discountPercent;
    }
    /**
     * creating setter method setisSold.
     * @params isSold
     * set values in instance varibales from parameter
     */
    public void setIsSold(boolean isSold)
    {
        this.isSold=isSold;
    }
    /**
     * creating getter method getPrice.
     * returns price from instance variables
     */
    public int getPrice()
    {
        return this.price;
    }
    /**
     * creating getter method getSellDate.
     * returns sellDate from instance variables
     */
    public String getSellDate()
    {
        return this.sellDate;
    }
    /**
     * creating getter method getDiscountPercent.
     * returns discountPercent from instance variables
     */
    public int getDiscountPercent()
    {
        return this.discountPercent;
    }
    /**
     * creating getter method getIsSold.
     * returns isSold from instance variables
     */
    public boolean getIsSold()
    {
        return this.isSold;
    }
    /**
     * creating sellInstrument method.
     * @params customerName, customerMobileNumber, customerPAN, sellDate, discountPercent
     */
    public void sellInstrument(String customerName, String customerMobileNumber, int customerPAN, String sellDate,int discountPercent)
    {
        if(isSold==true) {
            System.out.println("The Instrument is sold to "+super.getCustomerName());
            System.out.println("Contact number: "+super.getCustomerMobileNumber());
            System.out.println("Customer PAN number: "+super.getCustomerPAN());

        }
        else {
            super.setCustomerName(customerName);//passing the customerName in super class
            super.setCustomerMobileNumber(customerMobileNumber);//passing the customerMobileNumber in super class
            super.setCustomerPAN(customerPAN);//passing the customerPAN in super class
            this.sellDate=sellDate;
            this.discountPercent=discountPercent;
            this.isSold=true;
            this.price=price-(price*discountPercent/100);
        }
    }
    /**
     * creating display method.
     */
    public void display()
    {
        super.display();//calling the display method of super class
        System.out.println("The price of the instrument is "+this.price);
        if(isSold==true) {
            System.out.println("The instrument is sold to "+super.getCustomerName()+" on "+this.sellDate );
        }
    }
}