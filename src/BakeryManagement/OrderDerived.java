package BakeryManagement;

import java.io.Serializable;

public class OrderDerived implements Serializable{
   private int ordderived_id; 
   private int ord_id; 
   private int prod_id;
   private String prod_qty;
   private String ord_bill;
 
   public int getOrdderived_id() {
        return ordderived_id;}
    public void setOrdderived_id(int ordderived_id) {
        this.ordderived_id = ordderived_id;}
    
    public int getOrd_id() {
        return ord_id;}
    public void setOrd_id(int ord_id) {
        this.ord_id = ord_id;}
    
    public int getProd_id() {
        return prod_id;}
    public void setProd_id (int prod_id) {
        this.prod_id = prod_id;}
     
    public String getProd_qty() {
        return prod_qty;}
    public void setProd_qty (String prod_qty) {
        this.prod_qty = prod_qty;}
    
     public String getOrd_bill() {
        return ord_bill;}
    public void setOrd_bill (String ord_bill) {
        this.ord_bill = ord_bill;}
    
    public OrderDerived (int ordderived_id, int ord_id, int prod_id, String prod_qty, String ord_bill)
    {
        this.ordderived_id = ordderived_id;
        this.ord_id = ord_id;
        this.prod_id = prod_id;
        this.prod_qty = prod_qty;
        this.ord_bill = ord_bill;
    }
}
