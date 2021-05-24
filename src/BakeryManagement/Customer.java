/**
Customer ID	Integer	true	true
Customer Name	Object	true	true
Customer Email	Object	true	true
Customer Address	Object	true	true
Customer City	Object	true	true
Customer Phone	Object	true	true
Customer Grade	Object	true	true
 */
package BakeryManagement;

import java.io.Serializable;

public class Customer implements Serializable{
   private int cust_id; 
   private String cust_name;
   private String cust_email;
   private String cust_address;
   private String cust_city;
   private String cust_phone;
   private String cust_grade;
   
  // private GregorianCalendar std_birthdate;

    public int getCust_id() {
        return cust_id;
    }
    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }
       
    public String getCust_name() {
        return cust_name;
    }
    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }
 
    public String getCust_email() {
        return cust_email;
    }
    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public String getCust_address() {
        return cust_address;
    }
    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    public String getCust_city() {
        return cust_city;
    }
    public void setCust_city(String cust_city) {
        this.cust_city = cust_city;
    }

    public String getCust_phone() {
        return cust_phone;
    }
    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }
  
    public String getCust_grade() {
        return cust_grade;
    }
    public void setCust_grade(String cust_grade) {
        this.cust_grade = cust_grade;
    }
  /* 
    public GregorianCalendar getCust_birthdate() {
        return std_birthdate;
    }

   public void setCust_birthdate(GregorianCalendar std_birthdate) {
        this.std_birthdate = std_birthdate;
    }
*/
    public Customer(int cust_id, String cust_name, String cust_email, 
                     String cust_address, String cust_city, String cust_phone, 
                   String cust_grade) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.cust_email = cust_email;
        this.cust_address = cust_address;
        this.cust_city = cust_city;
        this.cust_phone = cust_phone;
        this.cust_grade = cust_grade;
    }
    
}
