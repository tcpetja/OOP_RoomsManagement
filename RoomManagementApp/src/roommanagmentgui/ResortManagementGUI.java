/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roommanagmentgui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Menu;

import javax.swing.*;


public class ResortManagementGUI extends JFrame {

    public ResortManagementGUI()  {
        setTitle("Tyson Resort");
        setSize(1500,1200);
        //setResizable(false);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        pack();
        setVisible(true);
        
        hearderPanel.add(title);
        
        menuPanel.add(checkIn);
        menuPanel.add(checkOut);
        menuPanel.add(roomBooking);
        menuPanel.add(cancelBooking);
        menuPanel.add(viewGuests);
        menuPanel.add(viewRooms);
        
        
        
        checkInPersonalInfoPanel.add(fullNameslbl); 
        checkInPersonalInfoPanel.add(fullName );
        checkInPersonalInfoPanel.add(surnamelbl );
        checkInPersonalInfoPanel.add(surname );
        checkInPersonalInfoPanel.add(emaillbl );
        checkInPersonalInfoPanel.add(email);
        checkInPersonalInfoPanel.add(cellNumberlbl);
        checkInPersonalInfoPanel.add(cellNumber);
        checkInPersonalInfoPanel.add(carReglbl );
        checkInPersonalInfoPanel.add(carReg);
        checkInPersonalInfoPanel.add(adultCountlbl);
        checkInPersonalInfoPanel.add(adultCount) ;
        checkInPersonalInfoPanel.add(kidsCountlbl) ;
        checkInPersonalInfoPanel.add(kidsCount );
        checkInRoomPanel.add(suiteTypelbl);
        checkInRoomPanel.add(radiobuttonpanel);
        radiobuttonpanel.add(bachelor);
        radiobuttonpanel.add(chalet);
        checkInRoomPanel.add(checkInDatelbl);
        checkInRoomPanel.add(checkInDate);
        checkInRoomPanel.add(checkOutDatelbl );
        checkInRoomPanel.add(checkOutDate );
        checkInRoomPanel.add(roomNolbl  );
        checkInRoomPanel.add(roomNo);
        
        checkInPersonalInfoPanel.setBorder(BorderFactory.createTitledBorder("Personal Info"));
        checkInRoomPanel.setBorder(BorderFactory.createTitledBorder("Room Info"));
        
        checkInMainPanel.add(checkInFormPanel,BorderLayout.CENTER);
        templateEditsmenu.add(savedraft);
        templateEditsmenu.add(saveTemplate);
        templateEditsmenu.add(deleteTemplate);
        templateEditsmenu.add(separator);
        
        templateEditsmenu.add(viewTemplatesMenu);
        viewTemplatesMenu.add(myTemp);
        viewTemplatesMenu.add(sallysTemp);
        
        //menuBar.add(templateEditsmenu);
        //menuBar.add(subMenu);
        //checkInFormPanel.add(menuBar);
        checkInFormPanel.add(checkInPersonalInfoPanel,BorderLayout.WEST); 
        checkInFormPanel.add(checkInRoomPanel,BorderLayout.CENTER); 
        
        checkInMainPanel.add(checkInButtonPanel,BorderLayout.SOUTH);
        checkInButtonPanel.add(checkInButton);
        checkInButtonPanel.add(clearButton);
        
        
        checkOutMainPanel.add(checkOutPanel, BorderLayout.CENTER);
        checkOutPanel.add(roomNolbl);
        checkOutPanel.add(roomNo);
        
        checkOutMainPanel.add(checkOutButtonPanel,BorderLayout.SOUTH);
        checkOutButtonPanel.add(checkOutButton);
        checkOutButtonPanel.add(clearButton);
        
        bookingPersonalInfoPanel.add(bookingFullNameslbl); 
        bookingPersonalInfoPanel.add(bookingFullName );
        bookingPersonalInfoPanel.add(bookingSurnamelbl );
        bookingPersonalInfoPanel.add(bookingSurname );
        bookingPersonalInfoPanel.add(bookingEmaillbl );
        bookingPersonalInfoPanel.add(bookingEmail);
        bookingPersonalInfoPanel.add(bookingCellNumberlbl);
        bookingPersonalInfoPanel.add(bookingCellNumber);
        bookingPersonalInfoPanel.add(bookingCarReglbl );
        bookingPersonalInfoPanel.add(bookingCarReg);
        bookingPersonalInfoPanel.add(bookingAdultCountlbl);
        bookingPersonalInfoPanel.add(bookingAdultCount) ;
        bookingPersonalInfoPanel.add(bookingKidsCountlbl) ;
        bookingPersonalInfoPanel.add(bookingKidsCount );
        roomBookingFormPanel.add(bookingSuiteTypelbl);
        roomBookingFormPanel.add(bookingRadiobuttonpanel);
        bookingRadiobuttonpanel.add(bookingBachelor);
        bookingRadiobuttonpanel.add(bookingChalet);
        roomBookingFormPanel.add(bookingCheckInDatelbl);
        roomBookingFormPanel.add(bookingCheckInDate);
        roomBookingFormPanel.add(bookingCheckOutDatelbl );
        roomBookingFormPanel.add(bookingCheckOutDate );
        roomBookingFormPanel.add(bookingRoomNolbl  );
        roomBookingFormPanel.add(bookingRoomNo);
        
        bookingPersonalInfoPanel.setBorder(BorderFactory.createTitledBorder("Personal Info"));
        roomBookingFormPanel.setBorder(BorderFactory.createTitledBorder("Room Info"));
        
        bookingRoomPanel.add(bookingPersonalInfoPanel,BorderLayout.WEST); 
        bookingRoomPanel.add(roomBookingFormPanel,BorderLayout.CENTER);
        
        bookingRoomPanel.add(bookingButtonPanel,BorderLayout.SOUTH);
        bookingButtonPanel.add(bookButton);
        bookingButtonPanel.add(clearButton);
        
        cancelBoookingFormPanel.add(cancelBookingRoomNolbl);
        cancelBoookingFormPanel.add(cancelBookingRoomNo);
        
        cancelBookingMainPanel.add(cancelBoookingFormPanel,BorderLayout.CENTER);
        cancelBookingMainPanel.add(cancelBookingButtonPanel,BorderLayout.SOUTH);
        cancelBookingButtonPanel.add(cancelBookingButton);
        cancelBookingButtonPanel.add(clearButton);
        
        roomsMainPanel.add(roomsListPanel,BorderLayout.CENTER);
        roomsMainPanel.add(checkInButtonPanel,BorderLayout.SOUTH);
        roomsButtonPanel.add(refreshButton);
        roomsButtonPanel.add(closeButton);
        roomsListPanel.add(scrollPane);  
        
        guestsMainPanel.add(guestsListPanel,BorderLayout.CENTER);
        guestsMainPanel.add(guestsButtonPanel,BorderLayout.SOUTH);
        guestsButtonPanel.add(refreshButton);
        guestsButtonPanel.add(closeButton);
        guestsListPanel.add(scrollPane);
        scrollPane.setViewportView(table);
        
        
        
        checkInButtonPanel.setBackground(new Color(100, 149, 237));
        checkOutButtonPanel.setBackground(new Color(100, 149, 237));
        cancelBookingButtonPanel.setBackground(new Color(100, 149, 237));
        bookingButtonPanel.setBackground(new Color(100, 149, 237));
        roomsButtonPanel.setBackground(new Color(100, 149, 237));
        guestsButtonPanel.setBackground(new Color(100, 149, 237));
        hearderPanel.setBackground(new Color(100, 149, 237));
        add(mainPanel);
                
        
        mainPanel.add(hearderPanel,BorderLayout.NORTH);
        mainPanel.add(menuPanel,BorderLayout.WEST);
        mainPanel.add(roomsMainPanel,BorderLayout.CENTER);
        
    }
    
    public static void main(String[] args) {
        ResortManagementGUI myGUI = new ResortManagementGUI();
        myGUI.setSize(800, 600);
    }
    
    
    JPanel mainPanel = new JPanel(new BorderLayout());
    
    JPanel hearderPanel = new JPanel(new FlowLayout());
    JLabel title = new JLabel("Tyson Resort");
    
    
    JPanel menuPanel = new JPanel(new GridLayout(6,1));
    
    Button checkIn = new Button("Check In");
    Button checkOut = new Button("Check Out");
    Button roomBooking = new Button("Room Booking");
    Button cancelBooking = new Button("Cancel Booking");
    Button viewGuests = new Button("View Guests");
    Button viewRooms = new Button("View Rooms");
    Button closeButton = new Button("Close");
    
    
    
    JPanel checkInFormPanel = new JPanel(new BorderLayout());
    JMenuItem savedraft = new JMenuItem("save draft");
    JMenuItem saveTemplate = new JMenuItem("save template");
    JMenuItem deleteTemplate = new JMenuItem("delete template");
    JSeparator separator = new JSeparator();
    JMenu viewTemplatesMenu = new JMenu("view saved templates");
    JMenu templateEditsmenu = new JMenu("edit Temp");
    JMenuItem myTemp = new JMenuItem("My Template");
    JMenuItem sallysTemp = new JMenuItem("sally's Template");
    JMenu subMenu = new JMenu("Sub Menu");
    JMenuBar menuBar = new JMenuBar();
    JPanel checkInMainPanel = new JPanel(new BorderLayout());
    JPanel checkInButtonPanel = new JPanel(new FlowLayout());
    Button checkInButton = new Button("Check In");
    Button clearButton = new Button("clear");
   
    JPanel checkInPersonalInfoPanel = new JPanel(new GridLayout(7, 2));
    JPanel checkInRoomPanel = new JPanel(new GridLayout(4,2));
    
    
    JLabel fullNameslbl = new JLabel("Full Name(s):");
    JTextField fullName = new JTextField();
    JLabel surnamelbl = new JLabel("Surname:");
    JTextField surname = new JTextField();
    JLabel emaillbl = new JLabel("Email:");
    JTextField email = new JTextField();
    JLabel cellNumberlbl = new JLabel("Cell Number");
    JTextField cellNumber = new JTextField();
    JLabel carReglbl = new JLabel("Car Registration");
    JTextField carReg = new JTextField();
    JLabel adultCountlbl = new JLabel("Adults");
    JSpinner adultCount = new JSpinner();
    JLabel kidsCountlbl = new JLabel("Kids");
    JSpinner kidsCount = new JSpinner();
    JLabel suiteTypelbl = new JLabel("Suite Type:");
    JPanel radiobuttonpanel = new JPanel(new GridLayout(2, 1));
    JRadioButton bachelor = new JRadioButton("Bachelor");
    JRadioButton chalet = new JRadioButton("Chalet");
    JLabel checkInDatelbl = new JLabel("Check In Date:");
    JTextField checkInDate = new JTextField();
    JLabel checkOutDatelbl = new JLabel("Check Out Date:");
    JTextField checkOutDate = new JTextField();
    JLabel roomNolbl = new JLabel("Room No:");
    JTextField roomNo = new JTextField();
    
    JPanel checkOutMainPanel = new JPanel(new BorderLayout());
    JPanel checkOutPanel = new JPanel(new FlowLayout());
    JPanel checkOutButtonPanel = new JPanel(new FlowLayout());
    Button checkOutButton = new Button("Check Out");
    
    JPanel roomBookingFormPanel = new JPanel(new GridLayout(4, 2));
    JPanel bookingPersonalInfoPanel = new JPanel(new GridLayout(7, 2));
    JPanel bookingRoomPanel = new JPanel(new BorderLayout());
    JPanel bookingButtonPanel = new JPanel(new FlowLayout());
    Button bookButton = new Button("Book Room");
    
    JLabel bookingFullNameslbl = new JLabel("Full Name(s):");
    JTextField bookingFullName = new JTextField();
    JLabel bookingSurnamelbl = new JLabel("Surname:");
    JTextField bookingSurname = new JTextField();
    JLabel bookingEmaillbl = new JLabel("Email:");
    JTextField bookingEmail = new JTextField();
    JLabel bookingCellNumberlbl = new JLabel("Cell Number");
    JTextField bookingCellNumber = new JTextField();
    JLabel bookingCarReglbl = new JLabel("Car Registration");
    JTextField bookingCarReg = new JTextField();
    JLabel bookingAdultCountlbl = new JLabel("Adults");
    JSpinner bookingAdultCount = new JSpinner();
    JLabel bookingKidsCountlbl = new JLabel("Kids");
    JSpinner bookingKidsCount = new JSpinner();
    JLabel bookingSuiteTypelbl = new JLabel("Suite Type:");
    JPanel bookingRadiobuttonpanel = new JPanel(new GridLayout(2, 1));
    JRadioButton bookingBachelor = new JRadioButton("Bachelor");
    JRadioButton bookingChalet = new JRadioButton("Chalet");
    JLabel bookingCheckInDatelbl = new JLabel("Check In Date:");
    JTextField bookingCheckInDate = new JTextField();
    JLabel bookingCheckOutDatelbl = new JLabel("Check Out Date:");
    JTextField bookingCheckOutDate = new JTextField();
    JLabel bookingRoomNolbl = new JLabel("Room No:");
    JTextField bookingRoomNo = new JTextField();
    
    JPanel cancelBookingMainPanel = new JPanel(new BorderLayout());
    JPanel cancelBoookingFormPanel = new JPanel(new FlowLayout());
    JPanel cancelBookingButtonPanel = new JPanel(new FlowLayout());
    Button cancelBookingButton = new Button("Cancel Booking");
    JLabel cancelBookingRoomNolbl = new JLabel("Room No:");
    JTextField cancelBookingRoomNo = new JTextField();
    
    
    JScrollPane scrollPane = new JScrollPane();
    JTable table = new JTable();
		
    
    JPanel roomsMainPanel = new JPanel(new BorderLayout());
    JPanel roomsListPanel = new JPanel();
    JPanel roomsButtonPanel = new JPanel(new FlowLayout());
    Button refreshButton = new Button("Refresh");
    
    JPanel guestsMainPanel = new JPanel(new BorderLayout());
    JPanel guestsListPanel = new JPanel();
    JPanel guestsButtonPanel = new JPanel(new FlowLayout());
    
}
