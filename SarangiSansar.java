/**
 * This is a GUI class of InstrumentToRent, InstrumentToSell classes.
 *
 * @author (Ripesh Khadka)
 * @date (July 30,2022)
 */


//  importing packages of toolkits
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// creating class
public class SarangiSansar
{
    // creating instance variables
    ArrayList<Instrument> addedInstrument= new ArrayList<>();
    private JFrame frame1;
    private JLabel heading;
    private JButton button1;
    private JButton button2;
    private JFrame frameRent;
    private JFrame frameSell;
    private JLabel titleRent;
    private JPanel rentPanel;
    private JPanel sellPanel;
    private JLabel titleSell;
    private JButton back1;
    private JButton back2;
    private JPanel btnPanelForRentAdd,btnPanelForSellAdd;
    private JButton addBtn,addSell,sellBtn;
    private JButton rentBtn;
    private JButton returnBtn;
    private JPanel addPanel,rentPanel1,returnPanel,sellAddPanel;
    private JPanel addContent,rentContent,returnContent,addSellContent;
    private JPanel content,content1,sellContent;
    private JLabel insName,insName1,insName2;
    private JTextField insNameTF,insNameTF2,insTextField, insNameSellTF;
    private JLabel chrgPerDay,insNameSell,price;
    private JTextField chrgPerDayTF,priceTF;
    private JPanel btnPanelforAddInRent,btnPanelforRentInRent,iname,btnPanelforReturnInRent,btnPanelforAddInSell,sellDate1,btnPanelforSellInSell;
    private JButton mainAdd,mainRent,mainReturn,clearforReturn,displayforReturn,mainAddSell,clearforAddSell,displayforAddSell,mainSell,clearforSell,displayforSell;
    private JButton clearforAdd,clearforRent;
    private JButton displayforAdd,displayforRent;
    private JLabel customerName,customerName2;
    private JTextField customerNameTF,customerNameTF2;
    private JLabel customerPhone,customerPhone2;
    private JTextField customerPhoneTF,customerPhoneTF2;
    private JLabel customerPAN,customerPAN2;
    private JTextField customerPANTF,customerPANTF2;
    private JLabel returnedDate;
    private JLabel rentedDate;
    private JLabel insName3;
    private JTextField insNameTF3;
    private JLabel sellDate,discountPer;
    private JLabel days;
    private JTextField daysTF,discountPerTF;

    private JPanel rentDate,mainSellContent,mainSellPanel;
    private JPanel returnDate;
    private JPanel left,leftSell,rightSell;
    private JPanel right;

    private JComboBox<String> years,mnth,dy;
    private JComboBox<String> returnYear,returnMnth,returnDy;
    private JComboBox<String> year1,mnth1,dy1;


    //  creating arrays for JCombo box
    private String[] dates= {"2017","2018","2019","2020","2021","2022"};
    private String[] months= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    private String[] day={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
    

    // creating constructor of SarangiSansar class
    public SarangiSansar()
    {
        // calling methods in constructor
        forFrame();
        rentFrame();
        forAddInRent();
        forRentInRent();
        forReturnInRent();
        sellFrame();
        forAddInSell();
        forSellInSell();
        forActionListener();

        frame1.setVisible(true);
    }
    // creating method for creating first frame
    public void forFrame()
    {
        // creating frame
        frame1= new JFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setResizable(false);
        frame1.setBounds(600, 350, 760, 450);

        // giving title
        heading=new JLabel();
        heading.setText("SARANGI SANSAR");
        heading.setBounds(230, 90, 350, 35);
        heading.setFont(new Font("Calibiri",Font.BOLD,35));
        frame1.add(heading);
    
        // Creating Rent Button
        button1=new JButton("Rent");
        button1.setBounds(150, 210, 200, 50);
        button1.setBackground(Color.lightGray);
        frame1.add(button1);
    
        // Creating Sell Button
        button2=new JButton("Sell");
        button2.setBounds(420, 210, 200, 50);
        button2.setBackground(Color.lightGray);
        frame1.add(button2);
    }
    // method for creating frame for Rent
    public void rentFrame()
    {
        frameRent= new JFrame();
        frameRent.setBounds(480, 220, 950, 600);
        frameRent.setLayout(null);
        frameRent.setResizable(false);
        frameRent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rentPanel= new JPanel();
        rentPanel.setBounds(0, 10, 950, 30);
        rentPanel.setBackground(Color.blue);
        frameRent.add(rentPanel);



        titleRent= new JLabel();
        titleRent.setText("RENT INSTRUMENT");
        titleRent.setBackground(Color.BLUE);
        titleRent.setForeground(Color.white);
        rentPanel.add(titleRent);


        // creating button for going back to main frame
        back1= new JButton();
        back1.setText("Back");
        back1.setBounds(20, 50, 100, 25);
        frameRent.add(back1);

        btnPanelForRentAdd= new JPanel();
        btnPanelForRentAdd.setBounds(40, 160, 120, 200);
        btnPanelForRentAdd.setLayout(new GridLayout(4,1,1,20));
        frameRent.add(btnPanelForRentAdd);


        // creating buttons for navigation
        addBtn= new JButton();
        addBtn.setText("Add");
        addBtn.setBackground(Color.GRAY);
        addBtn.setForeground(Color.white);
        btnPanelForRentAdd.add(addBtn);

        rentBtn= new JButton();
        rentBtn.setText("Rent");
        btnPanelForRentAdd.add(rentBtn);

        returnBtn= new JButton();
        returnBtn.setText("Return");
        btnPanelForRentAdd.add(returnBtn);

    }
    // creating method for GUI of adding the instrument for rent
    public void forAddInRent()
    {
        // for bordering pannel
        Border lineBorder= BorderFactory.createLineBorder(Color.black, 5);

        addContent= new JPanel();
        addContent.setBounds(300, 120, 500, 350);
        addContent.setBorder(lineBorder);
        addContent.setLayout(null);
        frameRent.add(addContent);


        addPanel= new JPanel();
        addPanel.setBounds(5, 5, 490, 250);
        addPanel.setLayout(null);
        addContent.add(addPanel);



        content = new JPanel();
        content.setBounds(50, 90, 400, 100);
        content.setLayout(new GridLayout(2,2,1,19));
        addPanel.add(content);

        // creating JLabels
        insName= new JLabel("Instrument Name:");
        insName.setFont(new Font("Calibiti",Font.PLAIN,18));
        content.add(insName);

        insNameTF= new JTextField();
        insNameTF.setFont((new Font("Calibiri",Font.PLAIN,15)));
        content.add(insNameTF);

        chrgPerDay= new JLabel("Charge Per Day:");
        chrgPerDay.setFont(new Font("Calibiri",Font.PLAIN,18));
        content.add(chrgPerDay);

        chrgPerDayTF= new JTextField();
        chrgPerDayTF.setFont((new Font("Calibiri",Font.PLAIN,15)));
        content.add(chrgPerDayTF);


        btnPanelforAddInRent= new JPanel();
        btnPanelforAddInRent.setBounds(80, 260, 340, 35);
        btnPanelforAddInRent.setLayout(new GridLayout(1,3,25,1));
        addContent.add(btnPanelforAddInRent);


        // creating buttons for  function
        mainAdd= new JButton("Add");
        btnPanelforAddInRent.add(mainAdd);

        clearforAdd= new JButton("Clear");
        btnPanelforAddInRent.add(clearforAdd);

        displayforAdd= new JButton("Display");
        btnPanelforAddInRent.add(displayforAdd);
    }
    // creating method for GUI of renting instrument
    public void forRentInRent()
    {
        // creating line border
        Border lineBorder1= BorderFactory.createLineBorder(Color.black, 5);

        rentContent= new JPanel();
        rentContent.setBounds(170, 100, 750, 400);
        rentContent.setBorder(lineBorder1);
        rentContent.setLayout(null);
        frameRent.add(rentContent);
        rentContent.setVisible(false);

        rentPanel1= new JPanel();
        rentPanel1.setBounds(5, 5, 740, 290);
        rentPanel1.setLayout(null);
        rentContent.add(rentPanel1);

        iname= new JPanel();
        iname.setBounds(220, 40, 320, 40);
        iname.setLayout(new GridLayout(1,2,1,1));
        rentPanel1.add(iname);


        insName1= new JLabel("Instrument Name:");
        insName1.setFont(new Font("Calibiri",Font.PLAIN,18));
        iname.add(insName1);


        insNameTF2= new JTextField();
        insNameTF2.setFont(new Font("Calibiri",Font.PLAIN,15));
        iname.add(insNameTF2);

        left = new JPanel();
        left.setBounds(8, 120, 355, 150);
        left.setLayout(new GridLayout(3,2,1,10));
        rentPanel1.add(left);

        customerName= new JLabel("Customer Name:");
        customerName.setFont(new Font("Calibiri",Font.PLAIN,18));
        left.add(customerName);

        customerNameTF = new JTextField();
        customerNameTF.setFont(new Font("Calibiri",Font.PLAIN,15));
        left.add(customerNameTF);

        customerPhone= new JLabel("Customer Phone:");
        customerPhone.setFont(new Font("Calibiri",Font.PLAIN,18));
        left.add(customerPhone);

        customerPhoneTF= new JTextField();
        customerPhoneTF.setFont(new Font("Calibiri",Font.PLAIN,15));
        left.add(customerPhoneTF);

        customerPAN = new JLabel("Customer PAN:");
        customerPAN.setFont(new Font("Calibiri",Font.PLAIN,18));
        left.add(customerPAN);

        customerPANTF = new JTextField();
        customerPANTF.setFont(new Font("Calibiri",Font.PLAIN,15));
        left.add(customerPANTF);


        right = new JPanel();
        right.setBounds(375, 120, 355, 150);
        right.setLayout(new GridLayout(3,2,1,10));
        rentPanel1.add(right);


        rentedDate= new JLabel("Rented Date:");
        rentedDate.setFont(new Font("Calibiri",Font.PLAIN,18));
        right.add(rentedDate);

        // creating line border for combo box
        Border lineBorder3= BorderFactory.createLineBorder(Color.black, 1);

        rentDate= new JPanel();
        rentDate.setLayout(new FlowLayout());
        rentDate.setBorder(lineBorder3);
    
        // creating combo boxes for date entry
        years= new JComboBox<>(dates);
        rentDate.add(years);

        mnth= new JComboBox<>(months);
        rentDate.add(mnth);

        dy= new JComboBox<>(day);
        rentDate.add(dy);

        right.add(rentDate);

        returnedDate= new JLabel("Returned Date:");
        returnedDate.setFont(new Font("Calibiri",Font.PLAIN,18));
        right.add(returnedDate);

        returnDate= new JPanel();
        returnDate.setLayout(new FlowLayout());
        returnDate.setBorder(lineBorder3);

        returnYear= new JComboBox<>(dates);
        returnDate.add(returnYear);

        returnMnth= new JComboBox<>(months);
        returnDate.add(returnMnth);

        returnDy= new JComboBox<>(day);
        returnDate.add(returnDy);

        right.add(returnDate);

        days= new JLabel("No. of Days:");
        days.setFont(new Font("Calibiri",Font.PLAIN,18));
        right.add(days);

        daysTF= new JTextField();
        daysTF.setFont(new Font("Calibiri",Font.PLAIN,15));
        right.add(daysTF);


        // buttons pannel to rent the instrument
        btnPanelforRentInRent= new JPanel();
        btnPanelforRentInRent.setBounds(190, 310, 340, 35);
        btnPanelforRentInRent.setLayout(new GridLayout(1,3,25,1));
        rentContent.add(btnPanelforRentInRent);

        mainRent= new JButton("Rent");
        btnPanelforRentInRent.add(mainRent);

        clearforRent= new JButton("Clear");
        btnPanelforRentInRent.add(clearforRent);

        displayforRent= new JButton("Display");
        btnPanelforRentInRent.add(displayforRent);


    }
    // creating method for GUI of returning instrument
    public void forReturnInRent()
    {
        // for creation of line border
        Border lineBorder= BorderFactory.createLineBorder(Color.black, 5);

        returnContent= new JPanel();
        returnContent.setBounds(300, 120, 500, 350);
        returnContent.setBorder(lineBorder);
        returnContent.setLayout(null);
        frameRent.add(returnContent);
        returnContent.setVisible(false);

        returnPanel= new JPanel();
        returnPanel.setBounds(5, 5, 490, 250);
        returnPanel.setLayout(null);
        returnContent.add(returnPanel);

        content1 = new JPanel();
        content1.setBounds(50, 100, 400, 50);
        content1.setLayout(new GridLayout(1,2,1,19));
        returnPanel.add(content1);

        insName2= new JLabel("Instrument Name:");
        insName2.setFont(new Font("Calibiti",Font.PLAIN,18));
        content1.add(insName2);

        insTextField= new JTextField();
        insTextField.setFont((new Font("Calibiri",Font.PLAIN,15)));
        content1.add(insTextField);


        btnPanelforReturnInRent= new JPanel();
        btnPanelforReturnInRent.setBounds(80, 260, 340, 35);
        btnPanelforReturnInRent.setLayout(new GridLayout(1,3,25,1));
        returnContent.add(btnPanelforReturnInRent);

        // buttons for returning
        mainReturn= new JButton("Return");
        btnPanelforReturnInRent.add(mainReturn);

        clearforReturn= new JButton("Clear");
        btnPanelforReturnInRent.add(clearforReturn);

        displayforReturn= new JButton("Display");
        btnPanelforReturnInRent.add(displayforReturn);

    }
    // creating method for GUI of adding and selling instrument
    public void sellFrame()
    {
        frameSell=new JFrame();
        frameSell.setBounds(480, 220, 950, 600);
        frameSell.setLayout(null);
        frameSell.setResizable(false);
        frameSell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

        sellPanel= new JPanel();
        sellPanel.setBounds(0, 10, 950, 30);
        sellPanel.setBackground(Color.blue);
        frameSell.add(sellPanel);

        titleSell= new JLabel();
        titleSell.setText("SELL INSTRUMENT");
        titleSell.setBackground(Color.BLUE);
        titleSell.setForeground(Color.white);
        sellPanel.add(titleSell);

        back2= new JButton();
        back2.setText("Back");
        back2.setBounds(20, 50, 100, 25);
        frameSell.add(back2);

        btnPanelForSellAdd= new JPanel();
        btnPanelForSellAdd.setBounds(40, 160, 120, 90);
        btnPanelForSellAdd.setLayout(new GridLayout(2,1,1,20));
        frameSell.add(btnPanelForSellAdd);


        // navigations button
        addSell= new JButton();
        addSell.setText("Add");
        addSell.setBackground(Color.GRAY);
        addSell.setForeground(Color.white);
        btnPanelForSellAdd.add(addSell);

        sellBtn= new JButton();
        sellBtn.setText("Sell");
        btnPanelForSellAdd.add(sellBtn);

    }
    // creating method for GUI of adding instrument for sell
    public void forAddInSell()
    {
        Border lineBorder3= BorderFactory.createLineBorder(Color.black, 5);

        addSellContent= new JPanel();
        addSellContent.setBounds(300, 120, 500, 350);
        addSellContent.setBorder(lineBorder3);
        addSellContent.setLayout(null);
        frameSell.add(addSellContent);

        sellAddPanel= new JPanel();
        sellAddPanel.setBounds(5, 5, 490, 250);
        sellAddPanel.setLayout(null);
        addSellContent.add(sellAddPanel);


        sellContent = new JPanel();
        sellContent.setBounds(50, 90, 400, 100);
        sellContent.setLayout(new GridLayout(2,2,1,19));
        sellAddPanel.add(sellContent);

        insNameSell = new JLabel("Instrument Name:");
        insNameSell.setFont(new Font("Calibiri",Font.PLAIN,18));
        sellContent.add(insNameSell);


        insNameSellTF= new JTextField();
        insNameSellTF.setFont(new Font("Calibiri",Font.PLAIN,15));
        sellContent.add(insNameSellTF);


        price= new JLabel("Price:");
        price.setFont(new Font("Calibiri",Font.PLAIN,18));
        sellContent.add(price);

        priceTF= new JTextField();
        priceTF.setFont(new Font("Calibiri",Font.PLAIN,15));
        sellContent.add(priceTF);

        btnPanelforAddInSell= new JPanel();
        btnPanelforAddInSell.setBounds(80, 260, 340, 35);
        btnPanelforAddInSell.setLayout(new GridLayout(1,3,25,1));
        addSellContent.add(btnPanelforAddInSell);


        // creating buttons for its functionality
        mainAddSell= new JButton("Add");
        btnPanelforAddInSell.add(mainAddSell);

        clearforAddSell= new JButton("Clear");
        btnPanelforAddInSell.add(clearforAddSell);

        displayforAddSell= new JButton("Display");
        btnPanelforAddInSell.add(displayforAddSell);

    }
    // creating method for GUI of selling the instrument
    public void forSellInSell()
    {
        Border lineBorder4= BorderFactory.createLineBorder(Color.black, 5);

        mainSellContent= new JPanel();
        mainSellContent.setBounds(170, 100, 750, 400);
        mainSellContent.setBorder(lineBorder4);
        mainSellContent.setLayout(null);
        frameSell.add(mainSellContent);
        mainSellContent.setVisible(false);


        mainSellPanel= new JPanel();
        mainSellPanel.setBounds(5, 5, 740, 290);
        mainSellPanel.setLayout(null);
        mainSellContent.add(mainSellPanel);


        leftSell = new JPanel();
        leftSell.setBounds(8, 90, 355, 150);
        leftSell.setLayout(new GridLayout(3,2,1,10));
        mainSellPanel.add(leftSell);

        customerName2= new JLabel("Customer Name:");
        customerName2.setFont(new Font("Calibiri",Font.PLAIN,18));
        leftSell.add(customerName2);

        customerNameTF2 = new JTextField();
        customerNameTF2.setFont(new Font("Calibiri",Font.PLAIN,15));
        leftSell.add(customerNameTF2);

        customerPhone2= new JLabel("Customer Phone:");
        customerPhone2.setFont(new Font("Calibiri",Font.PLAIN,18));
        leftSell.add(customerPhone2);

        customerPhoneTF2= new JTextField();
        customerPhoneTF2.setFont(new Font("Calibiri",Font.PLAIN,15));
        leftSell.add(customerPhoneTF2);

        customerPAN2 = new JLabel("Customer PAN:");
        customerPAN2.setFont(new Font("Calibiri",Font.PLAIN,18));
        leftSell.add(customerPAN2);

        customerPANTF2 = new JTextField();
        customerPANTF2.setFont(new Font("Calibiri",Font.PLAIN,15));
        leftSell.add(customerPANTF2);

        rightSell = new JPanel();
        rightSell.setBounds(375, 90, 355, 150);
        rightSell.setLayout(new GridLayout(3,2,1,10));
        mainSellPanel.add(rightSell);


        sellDate= new JLabel("Sell Date:");
        sellDate.setFont(new Font("Calibiri",Font.PLAIN,18));
        rightSell.add(sellDate);

        // creating line border for combo box
        Border lineBorder5= BorderFactory.createLineBorder(Color.black, 1);

        sellDate1= new JPanel();
        sellDate1.setLayout(new FlowLayout());
        sellDate1.setBorder(lineBorder5);
    
        // creating combo boxes for date entry
        year1= new JComboBox<>(dates);
        sellDate1.add(year1);

        mnth1= new JComboBox<>(months);
        sellDate1.add(mnth1);

        dy1= new JComboBox<>(day);
        sellDate1.add(dy1);

        rightSell.add(sellDate1);

        insName3= new JLabel("Instrument Name:");
        insName3.setFont(new Font("Calibiri",Font.PLAIN,18));
        rightSell.add(insName3);

        insNameTF3= new JTextField();
        insNameTF3.setFont(new Font("Calibiri",Font.PLAIN,15));
        rightSell.add(insNameTF3);

        discountPer= new JLabel("Discount Percent:");
        discountPer.setFont(new Font("Calibiri",Font.PLAIN,18));
        rightSell.add(discountPer);


        discountPerTF= new JTextField();
        discountPerTF.setFont(new Font("Calibiri",Font.PLAIN,15));
        rightSell.add(discountPerTF);


        btnPanelforSellInSell= new JPanel();
        btnPanelforSellInSell.setBounds(190, 310, 340, 35);
        btnPanelforSellInSell.setLayout(new GridLayout(1,3,25,1));
        mainSellContent.add(btnPanelforSellInSell);

        // creating buttons of Selling 
        mainSell= new JButton("Sell");
        btnPanelforSellInSell.add(mainSell);

        clearforSell= new JButton("Clear");
        btnPanelforSellInSell.add(clearforSell);

        displayforSell= new JButton("Display");
        btnPanelforSellInSell.add(displayforSell);

    }

    // creating method for buttons functionality only
    public void forActionListener()
    {
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // opens rent frame and close main frame
                frameRent.setVisible(true);
                frame1.setVisible(false);
            }
        });

        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // opens sell frame and close main frame
                frameSell.setVisible(true);
                frame1.setVisible(false);
            }
        });

        back1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // go back to main frame
                frame1.setVisible(true);
                frameRent.setVisible(false);
            }
        });

        back2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // go back to main frame
                frame1.setVisible(true);
                frameSell.setVisible(false);
            }
        });
        rentBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // changes navigation button color after clicking button
                rentBtn.setBackground(Color.GRAY);
                rentBtn.setForeground(Color.white);
                addBtn.setBackground(null);
                addBtn.setForeground(null);
                returnBtn.setBackground(null);
                returnBtn.setForeground(null);
                addContent.setVisible(false);
                rentContent.setVisible(true);
                returnContent.setVisible(false);

            }
        });
        returnBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // changes navigation button color after clicking button
                returnBtn.setBackground(Color.GRAY);
                returnBtn.setForeground(Color.white);
                addBtn.setBackground(null);
                addBtn.setForeground(null);
                rentBtn.setBackground(null);
                rentBtn.setForeground(null);
                addContent.setVisible(false);
                rentContent.setVisible(false);
                returnContent.setVisible(true);
            }
        });
        addBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // changes navigation button color after clicking button
                addBtn.setBackground(Color.GRAY);
                addBtn.setForeground(Color.white);
                returnBtn.setBackground(null);
                returnBtn.setForeground(null);
                rentBtn.setBackground(null);
                rentBtn.setForeground(null);
                addContent.setVisible(true);
                rentContent.setVisible(false);
                returnContent.setVisible(false);

            }
        });
        addSell.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // changes navigation button color after clicking button
                addSell.setBackground(Color.GRAY);
                addSell.setForeground(Color.white);
                sellBtn.setBackground(null);
                sellBtn.setForeground(null);
                mainSellContent.setVisible(false);
                addSellContent.setVisible(true);

            }
        });
        sellBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // changes navigation button color after clicking button
                sellBtn.setBackground(Color.GRAY);
                sellBtn.setForeground(Color.white);
                addSell.setBackground(null);
                addSell.setForeground(null);
                mainSellContent.setVisible(true);
                addSellContent.setVisible(false);

            }
        });
        mainAdd.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for adding instrument in rent
               addInRent();
            }
        });
        clearforAdd.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for clearing text fields in add rent
               clearForAddInRent();
            }
        });
        displayforAdd.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for displaying details in add rent
               displayForAddInRent();
            }
        });
        mainRent.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for renting instrument in rent
               rentForRentInRent();
            }
        });
        clearforRent.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for clearing text fields in  rent
               clearForRentInRent();
            }
        });
        displayforRent.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for displaying details in  rent
               displayForRentInRent();
            }
        });
        mainReturn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for returning the instrument
               returnForRentInRent();
            }
        });
        clearforReturn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for clearing return text fields
               clearForReturnInRent();
            }
        });
        displayforReturn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for displaying details of returning instrument
               displayForReturnInRent();
            }
        });
        mainAddSell.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for adding instrument for sell
               addForAddInSell();
            }
        });
        clearforAddSell.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for clearing text fields instrument for sell
               clearforAddInSell();
            }
        });
        displayforAddSell.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for displaying details of instrument for sell
              displayforAddInSell();
            }
        });
        mainSell.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for selling the instrument 
              sellForSellInSell();
            }
        });
        clearforSell.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for clearing text fields 
                clearforSellInSell();
            }
        });
        displayforSell.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // calling method for displaying sell details
                displayforSellInSell();
            }
        });
        
    }
    // getting value from text fields of add in rent
    public String getInstrumentNameForObjInAdd()
    {
        return insNameTF.getText().trim().toLowerCase();
    }
    public String getChargePerDayForObjInAdd()
    {
        return chrgPerDayTF.getText().trim();
    }
    // getting values from textfields of rent pannel
    public String getInstrumentNameForRentInRent()
    {
        return insNameTF2.getText().trim().toLowerCase();
    }
    public String getCustomerNameForRentInRent()
    {
        return customerNameTF.getText().trim().toLowerCase();
    }
    public String getCustomerPhoneForRentInRent()
    {
        return customerPhoneTF.getText().trim().toLowerCase();
    }
    public String getCustomerPANForRentInRent()
    {
         return customerPANTF.getText().trim().toLowerCase();
    }

    // getting values from selected item from JComboBox
    public String getRentedDateForRentInRent()
    {
        String year =(String) years.getSelectedItem();
        String month =(String) mnth.getSelectedItem();
        String day =(String) dy.getSelectedItem();
        return (year+"/"+month+"/"+day);
    }
    public String getReturnedDateForRentInRent()
    {
        String year=(String)  returnYear.getSelectedItem();
        String month=(String) returnMnth.getSelectedItem();
        String day=(String) returnDy.getSelectedItem();
        return (year+"/"+month+"/"+day);
    }
    public String getNoOfDaysForRentInRent()
    {
        return daysTF.getText().trim();
    }
    public String getInstrumentNameForReturnInRent()
    {
        return insTextField.getText().trim().toLowerCase();
    }
    // getting value of Add in Sell
    public String getInstrumentNameForAddInSell()
    {
        return insNameSellTF.getText().trim();
    }
    public String getInstrumentPriceForAddInSell()
    {
        return priceTF.getText().trim();
    }
    public String getCustomerNameForSellInSell()
    {
        return customerNameTF2.getText().trim();
    }
    public String getCustomerPhoneForSellInSell()
    {
        return customerPhoneTF2.getText().trim();
    }
    public String getCustomerPANForSellInSell()
    {
        return customerPANTF2.getText().trim();
    }
    // getting values from selected item from JComboBox
    public String getSellDateForSellInSell()
    {
        String year=(String) year1.getSelectedItem();
        String month=(String) mnth1.getSelectedItem();
        String day=(String) dy1.getSelectedItem();
        return (year+"/"+month+"/"+day);
    }
    public String getInstrumentNameForSellInSell()
    {
        return insNameTF3.getText().trim();
    }
    public String getDiscountPercentForSellInSell()
    {
        return discountPerTF.getText().trim();
    }

    // method for functionality behind GUI of adding rent instrument
    public void addInRent()
    {
        if(getInstrumentNameForObjInAdd().isEmpty() && getChargePerDayForObjInAdd().isEmpty()){
            JOptionPane.showMessageDialog(frame1,"Input Instrument Name & Charge Per Day","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(getInstrumentNameForObjInAdd().isEmpty()){
            JOptionPane.showMessageDialog(frame1,"Input Instrument Name","Error",JOptionPane.ERROR_MESSAGE);
            }
            if(getChargePerDayForObjInAdd().isEmpty()){
            JOptionPane.showMessageDialog(frame1,"Input Charge Per Day ","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                String instrumentName=getInstrumentNameForObjInAdd();
                int chargePerDay;
                boolean isRepeated= false;
                try{
                    // parsing charge per day to int
                    chargePerDay=Integer.parseInt(getChargePerDayForObjInAdd());
                    if(chargePerDay<=0){
                        JOptionPane.showMessageDialog(frame1, "Enter positive number in charge per day","Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(frame1,"Please fill Integer value in Charge Per Day", "Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // adding arraylist values in instrument
                for(Instrument instrument: addedInstrument){
                    if(instrument.getInstrumentName().equals(getInstrumentNameForObjInAdd())){
                        JOptionPane.showMessageDialog(frame1,"Instrument Name cannot be repeated","Error", JOptionPane.ERROR_MESSAGE);

                        isRepeated=true;
                    }
                
                }
                if(isRepeated== false){
                    // adding value in arraylist
                    addedInstrument.add(new InstrumentToRent(instrumentName, chargePerDay));
                    JOptionPane.showMessageDialog(frame1,"Added Succesfully\n Instrument Name: "+instrumentName+"\n Charge Per Day: "+chargePerDay, "Add",JOptionPane.INFORMATION_MESSAGE);
                    clearForAddInRent();
                }
            }
        }   
            
    }
// methods for clearing text fields
    public void clearForAddInRent()
    {
        insNameTF.setText(null);
        chrgPerDayTF.setText(null);
    }
    public void clearForRentInRent()
    {
        customerNameTF.setText(null);
        customerPANTF.setText(null);
        customerPhoneTF.setText(null);
        daysTF.setText(null);
        insNameTF2.setText(null);
        


    }
    public void clearForReturnInRent(){
        insTextField.setText(null);
    }
    public void clearforAddInSell(){
        insNameSellTF.setText(null);
        priceTF.setText(null);
    }
    public void clearforSellInSell(){
        customerNameTF2.setText(null);
        customerPhoneTF2.setText(null);
        customerPANTF2.setText(null);
        insNameTF3.setText(null);
        discountPerTF.setText(null);

    }
    // method for displaying added nstrument details
    public void displayForAddInRent()
    {
        if(addedInstrument.isEmpty()){
                JOptionPane.showMessageDialog(frame1,"No added instrument", "DIsplay",JOptionPane.INFORMATION_MESSAGE);

            }
        else{
            for (Instrument instrument : addedInstrument){
                InstrumentToRent last=(InstrumentToRent) instrument;
               System.out.println("Instrument Name: "+last.getInstrumentName()+"\n Charge Per Day: "+last.getChargePerDay()+"\n ");
            }
        }        
    }
    
    // method for renting the instrument
    public void rentForRentInRent()
    {
        // storing values in variables from getter methods
        String customerName=getCustomerNameForRentInRent();
        String customerMobileNumber=getCustomerPhoneForRentInRent();
        String rentedDate=getRentedDateForRentInRent();
        String returnedDate=getReturnedDateForRentInRent();
        String instrumentName=getInstrumentNameForRentInRent();
        boolean isInvalid=true;
        boolean isNot=false;
        if (instrumentName.isEmpty()|| customerName.isEmpty()|| customerMobileNumber.isEmpty()|| getCustomerPANForRentInRent().isEmpty() || getNoOfDaysForRentInRent().isEmpty()){
            JOptionPane.showMessageDialog(frame1,"Fill all the field","Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int customerPAN;
            try{
                customerPAN=Integer.parseInt(getCustomerPANForRentInRent());
                if(customerPAN<=0){
                    JOptionPane.showMessageDialog(frame1, "Input positive number in PAN","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(frame1, "Input Integer value in customer PAN.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int noOfRentedDays;
            try{
                noOfRentedDays=Integer.parseInt(getNoOfDaysForRentInRent());
                if(customerPAN<=0){
                    JOptionPane.showMessageDialog(frame1, "Input positive number in days","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(frame1, "Input Integer value in no. of days.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            for(Instrument ins: addedInstrument)
            {
                if(ins.getInstrumentName().equals(getInstrumentNameForRentInRent())){
                    if(ins instanceof InstrumentToRent){
                        // checking instance with instumentToRent
                        // down casting
                        InstrumentToRent instrument=(InstrumentToRent) ins;

                        isInvalid=false;
                        if(instrument.getIsRented()){
                        JOptionPane.showMessageDialog(frame1, "The instrument is already rented","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            // renting the instrument
                            instrument.rent(customerName, customerMobileNumber, customerPAN, rentedDate,returnedDate, noOfRentedDays);
                            JOptionPane.showMessageDialog(frame1, "Instrument rented Succesfully\n Instrument Name:"+instrument.getInstrumentName()+"\n Rented to:"+instrument.getCustomerName()+"\n Rented for: "+instrument.getNoOfDays()+"days","Done",JOptionPane.INFORMATION_MESSAGE);
                            clearForRentInRent();
                            break;
                        }

                    }else{
                        isNot=true;
                    }
                }else{
                    isInvalid=true;
                }
            }if(isInvalid==true && isNot==false){
                JOptionPane.showMessageDialog(frame1,"This instrument is not available","Error",JOptionPane.ERROR_MESSAGE);

            }else if(isNot==true && isInvalid==false){
                    JOptionPane.showMessageDialog(frame1, "This instrument is not available here.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // method for displaying the details of rented instrument
    public void displayForRentInRent()
    {
        // checking arraylist size
        if(addedInstrument.size()==0){
            JOptionPane.showMessageDialog(frame1, "No rented Instrument", "Empty", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(Instrument instrument: addedInstrument)
            {
                if(instrument instanceof InstrumentToRent){
                    // calling intrumentToRent's display method
                    ((InstrumentToRent) instrument).display();
                }
            }
        }
    }
    // method for returing the instrument
    public void returnForRentInRent()
    {
        boolean isInvalid=true;
        if(getInstrumentNameForReturnInRent().isEmpty()){
            JOptionPane.showMessageDialog(frame1, "Input Instrument Name","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            // adding arraylist values in instrument
            for(Instrument instrument: addedInstrument)
            {
                if(instrument.getInstrumentName().equals(getInstrumentNameForReturnInRent())){
                    if(instrument instanceof InstrumentToRent){
                        // downcasting instrumentToRent
                        InstrumentToRent ins= (InstrumentToRent) instrument;
                        if(ins.getIsRented()){
                            ins.returnInstrument();
                            JOptionPane.showMessageDialog(frame1, "Instrument returned Succesfully","Returned",JOptionPane.INFORMATION_MESSAGE);
                            clearForReturnInRent();
                            isInvalid=false;
                        }
                        else{
                            JOptionPane.showMessageDialog(frame1, "You must rent instrument to return instrument.","Error",JOptionPane.ERROR_MESSAGE);
                            isInvalid=false;
                        }
                        break;
                    }
                }
            }
            if(isInvalid==true){
                JOptionPane.showMessageDialog(frame1, "Instrument is not avaiblable here.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // method for displaying details of returned instrument 
    public void displayForReturnInRent()
    {
        if(addedInstrument.size()==0){
            JOptionPane.showMessageDialog(frame1, "No instrument to return", "Empty", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(Instrument instrument: addedInstrument)
            {
                if(instrument instanceof InstrumentToRent){
                    ((InstrumentToRent) instrument).display();
                }
            }
        }
    }

    // method for adding instrument for selling
    public void addForAddInSell()
    {
        if(getInstrumentNameForAddInSell().isEmpty() && getInstrumentPriceForAddInSell().isEmpty()){
            JOptionPane.showMessageDialog(frame1,"Input Instrument Name & Price of the instrument","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(getInstrumentNameForAddInSell().isEmpty()){
            JOptionPane.showMessageDialog(frame1,"Input Instrument Name","Error",JOptionPane.ERROR_MESSAGE);
            }
            if(getInstrumentPriceForAddInSell().isEmpty()){
            JOptionPane.showMessageDialog(frame1,"Input price of the instrument","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                String instrumentName=getInstrumentNameForAddInSell();
                int price;
                boolean isRepeated= false;
                try{
                    // parsing String to integer
                    price=Integer.parseInt(getInstrumentPriceForAddInSell());
                    if(price<=0){
                        JOptionPane.showMessageDialog(frame1, "Enter positive number in price","Error",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(frame1,"Please fill Integer value in price", "Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                for(Instrument instrument: addedInstrument)
                {
                    if(instrument.getInstrumentName().equals(getInstrumentNameForAddInSell())){
                        // checking instrument in arraylist
                        JOptionPane.showMessageDialog(frame1,"Instrument Name cannot be repeated","Error", JOptionPane.ERROR_MESSAGE);

                        isRepeated=true;
                    }
                
                }
                if(isRepeated== false){
                    // adding details in arralist
                    addedInstrument.add(new InstrumentToSell(instrumentName, price));
                    JOptionPane.showMessageDialog(frame1,"Added Succesfully\n Instrument Name: "+instrumentName+"\n Price: "+price, "Added",JOptionPane.INFORMATION_MESSAGE);
                    // calling clear method for clearing text fields after adding
                    clearforAddInSell();
                }
            }
        }         
    }
    // calling display method to display the details of sold instrument
    public void displayforAddInSell()
    {
        if(addedInstrument.isEmpty()){
                JOptionPane.showMessageDialog(frame1,"No added instrument", "Display",JOptionPane.INFORMATION_MESSAGE);

            }
        else{
            for (Instrument instrument : addedInstrument)
            {
                instrument.display();
            }
        }        
    }
    // calling sell method to sell the instrument
    public void sellForSellInSell()
    {
        String customerName=getCustomerNameForSellInSell();
        String customerMobileNumber=getCustomerPhoneForSellInSell();
        String sellDate=getSellDateForSellInSell();
        String instrumentName=getInstrumentNameForSellInSell();
        boolean isInvalid=true;
        boolean isNot=false;
        if (instrumentName.isEmpty()|| customerName.isEmpty()|| customerMobileNumber.isEmpty()|| getCustomerPANForSellInSell().isEmpty() || getDiscountPercentForSellInSell().isEmpty()){
            JOptionPane.showMessageDialog(frame1,"Fill all the field","Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int customerPAN;
            try{
                customerPAN=Integer.parseInt(getCustomerPANForSellInSell());
                if(customerPAN<=0){
                    JOptionPane.showMessageDialog(frame1, "Input positive number in PAN","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(frame1, "Input Integer value in customer PAN.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int discountPercent;
            try{
                discountPercent=Integer.parseInt(getDiscountPercentForSellInSell());
                if(customerPAN<=0){
                    JOptionPane.showMessageDialog(frame1, "Input positive number in Discount","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(frame1, "Input Integer value in Discount.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            for(Instrument ins: addedInstrument)
            {
                if(ins.getInstrumentName().equals(getInstrumentNameForSellInSell())){
                    isInvalid=false;
                    if(ins instanceof InstrumentToSell){
                        InstrumentToSell instrument=(InstrumentToSell) ins;
  
                        if(instrument.getIsSold()){
                        JOptionPane.showMessageDialog(frame1, "The instrument is already sold","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            instrument.sellInstrument(customerName, customerMobileNumber, customerPAN, sellDate, discountPercent);
                            JOptionPane.showMessageDialog(frame1, "Instrument Sold Succesfully\n Instrument Name: "+instrument.getInstrumentName()+"\n Price: "+instrument.getPrice(),"Done",JOptionPane.INFORMATION_MESSAGE);
                            clearforSellInSell();
                            break;
                        }

                    }else{
                        isNot=true;
                    }
            }if(isInvalid==true){
                JOptionPane.showMessageDialog(frame1,"This instrument is not available","Error",JOptionPane.ERROR_MESSAGE);

            }else if(isNot==true){
                    JOptionPane.showMessageDialog(frame1, "This instrument is not available here.","Error",JOptionPane.ERROR_MESSAGE);
            }
            }
        }
    }
    public void displayforSellInSell(){
        if(addedInstrument.isEmpty()){
                JOptionPane.showMessageDialog(frame1,"No sold instrument", "Display",JOptionPane.INFORMATION_MESSAGE);

            }
        else{
            for(Instrument instrument: addedInstrument)
            {
                if(instrument instanceof InstrumentToSell){
                    ((InstrumentToSell) instrument).display();
                }
            }
        }       
    }

    public static void main(String[] args)
    {
        new SarangiSansar();
    }
}