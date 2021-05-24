

package BakeryManagement;

import BakeryManagement.Forms.Login;
import BakeryManagement.Functions.AddFunctions;
import BakeryManagement.Functions.ListFunctions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.swing.UnsupportedLookAndFeelException;


public class BakeryManagementSystemProject {
    
    public static List customers;
    public static List bakeryies;
    public static List employeeses;
    public static List orders;
    public static List stocks;
    public static List supplierses;
    public static List orderderiveds;
    public static List products;
    public static SimpleDateFormat fmt;
    
      
      
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
 
            customers     = new ArrayList(); // cu
            bakeryies     = new ArrayList(); // br
            employeeses   = new ArrayList(); // em
            orders        = new ArrayList(); // or
            stocks        = new ArrayList(); // st
            supplierses   = new ArrayList(); // su
            orderderiveds = new ArrayList(); // od
            products      = new ArrayList(); // pr
            fmt         = new SimpleDateFormat("dd/MM/yyyy");     
            
            selectBakery();
            selectEmployees();
            selectSuppliers();
            selectCustomer();
            selectOrder();
            selectOrderderived();
            selectStock();
            selectProduct();
            
            
                   new Login().setVisible(true);
                   
                    System.out.print("\n Ali Atılgan 17000103 \n ");
                    
    }
   
    // Create Functions =================================================================
    
    public static void selectBakery() throws IOException, ClassNotFoundException{  
    System.out.print("\n Added BAKERY.... \n");   
                AddFunctions.add_bakery(1,"Bakeryy Moka");
                AddFunctions.add_bakery(2,"Bakeryy MALIBU");
                AddFunctions.add_bakery(3,"TOKAT Moka BAKERY");
          
           System.out.print("\nListing BAKERY.... \n");
                ListFunctions.list_bakery();

    }
    public static void selectEmployees() throws IOException, ClassNotFoundException{  
                  System.out.print("\n Added Employees.... \n");   
                AddFunctions.add_employees(1,"Hasan","hasan@mail","ADANA","454550008","CAMIYOLU","1500",strToGregorianCalendar("09/04/2021"));
                AddFunctions.add_employees(2,"Muzaffer","muzaffer@mail","izmir","5412255","izmir","2500",strToGregorianCalendar("04/05/2020"));
                AddFunctions.add_employees(3,"melek","melek@mail","ELAZIG","355511215","ELAZG MERKEZ","5000",strToGregorianCalendar("10/01/1999"));

    
                ListFunctions.list_employee();
      System.out.print("\nListing Employee.... \n");
  
    }
    public static void selectCustomer() throws IOException, ClassNotFoundException{  
     
        System.out.print("\n Added Customer.... \n");    
                AddFunctions.add_customer(1,"Ahmet","ahmet@gma.com","turkey/tekirdag","TOKAT","544841564","Goood");
                AddFunctions.add_customer(2,"PHEC","phec@gma.com","BESEVLER","ADAN","0054115","Very Good");
                AddFunctions.add_customer(3,"BERKAY","abekıo@gma.com","abd/cıra","Istanbul","488748748","Bad");
          System.out.print("\nListing Customer.... \n");
 
                ListFunctions.list_customer();
    
      
    }
    public static void selectOrder() throws IOException, ClassNotFoundException{  
       
        System.out.print("\n Added Order.... \n");  
                AddFunctions.add_order(1,1,1,strToGregorianCalendar("09/04/2021"),"az pişmiş olsun");
                AddFunctions.add_order(2,2,1,strToGregorianCalendar("12/01/2015"),"hey Can I take some good things ");
                AddFunctions.add_order(2,3,2,strToGregorianCalendar("25/12/2019"),"Fast Delivery Please");
                
             System.out.print("\nListing Order.... \n");
                ListFunctions.list_order();

    }
    public static void selectSuppliers() throws IOException, ClassNotFoundException{  
       System.out.print("\n Added Supplier.... \n");  
                AddFunctions.add_suppliers(1,"MANGO","Holding","Cyprus","Famagusta");
                AddFunctions.add_suppliers(2,"Chocolate Center","Ulker","Turkey","IZMIR");
                AddFunctions.add_suppliers(3,"Banana marketer"," Banana Holding","Turkey","Konya");
           
          
       System.out.print("\nListing Supplier.... \n");
                ListFunctions.list_supplier();
 
  
    }
    public static void selectProduct() throws IOException, ClassNotFoundException{  
        
          System.out.print("\n Added Product.... \n");    
                AddFunctions.add_product(1,"5000TL","Apple Cake");
                AddFunctions.add_product(2,"5000TL","Banana Cake");
                AddFunctions.add_product(3,"100TL","CAKE with Cake");
        System.out.print("\nListing Product.... \n");
                ListFunctions.list_product();
     
  
    }
    public static void selectOrderderived() throws IOException, ClassNotFoundException{  
     System.out.print("\n Added attendance.... \n");    
                AddFunctions.add_orderderived(1,1,1,"50qty","5000$");
                AddFunctions.add_orderderived(2,3,2,"60qty","2000$");
                AddFunctions.add_orderderived(3,2,3,"100qty","10000$");
         
   System.out.print("\nListing attendance.... \n");
 
                ListFunctions.list_orderderived();
     
    }
    public static void selectStock() throws IOException, ClassNotFoundException{  
       System.out.print("\n Added Stock.... \n");  
                AddFunctions.add_stock(1,1,1,"800","800$",false);
                AddFunctions.add_stock(2,2,2,"50","1000$",false);
                AddFunctions.add_stock(3,2,3,"100","50$",false);
                AddFunctions.add_stock(4,3,2,"100","123$",true);
                AddFunctions.add_stock(5,2,3,"233","200$",false);
                AddFunctions.add_stock(6,3,1,"100","500$",true);
        
 System.out.print("\nListing Stock.... \n ");
                ListFunctions.list_stock();
      
    }
    
//==============================================================================================
	
    //CALENDAR
    public static GregorianCalendar strToGregorianCalendar(String stDate){
        GregorianCalendar bdate;
        
        bdate = new GregorianCalendar(
                Integer.parseInt(stDate.substring(6,10)),
                Integer.parseInt(stDate.substring(3,5))-1,
                Integer.parseInt(stDate.substring(0,2)));
        return bdate;       
    }
 
        // DRAW LİNE
    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }  
    

} 

