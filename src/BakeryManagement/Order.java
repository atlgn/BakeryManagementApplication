/**
 * @author Ali ATILGAN
 */
package BakeryManagement;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Order implements Serializable{
   private int ord_id; 
   private int cust_id;
   private int emp_id;
   private GregorianCalendar ord_date;
    private String ord_note;

    public int getOrd_id() {
        return ord_id;}
    public void setOrd_id(int ord_id) {
        this.ord_id = ord_id;}
    
    public int getCust_id() {
        return cust_id;}
    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;}
    
    public int getEmp_id() {
        return emp_id;}  
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;}

    public GregorianCalendar getOrd_date() {
        return ord_date;}
    public void setOrd_date(GregorianCalendar ord_date) {
        this.ord_date = ord_date;}
    
    
    public String getOrd_note() {
        return ord_note;}
    public void setOrd_note(String ord_note) {
        this.ord_note = ord_note;}

    
    public Order(int ord_id, int cust_id, int emp_id, GregorianCalendar ord_date, String ord_note)
    {
        this.ord_id = ord_id;
        this.cust_id = cust_id;
        this.emp_id = emp_id;
        this.ord_date = ord_date;
         this.ord_note= ord_note;
    }
}
