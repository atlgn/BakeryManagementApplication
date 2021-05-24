/**
 * @author Ali ATILGAN
 */
package BakeryManagement;

import java.io.Serializable;

public class Stock implements Serializable{
   private int stock_id; 
   private int prod_id;
   private int sup_id;
   private String sell_amnt;
   private String suplied_qty;
   private Boolean supplied_check;

    public int getStock_id() {
        return stock_id;}
    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;}
     
    public int getProd_id() {
        return prod_id;}
    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;}
    
    public int getSup_id() {
        return sup_id;}
    public void setSup_id(int sup_id) {
        this.sup_id = sup_id;}
      
    public String getSupplied_qty() {
        return suplied_qty;}
    public void setSupplied_qty(String suplied_qty) {
        this.suplied_qty = suplied_qty;}
       
    public String getSell_amnt() {
        return sell_amnt;}
    public void setSell_amnt(String sell_amnt) {
        this.sell_amnt = sell_amnt;}
 
     public Boolean getSupplied_check() {
        return supplied_check;}
    public void setSupplied_check(Boolean supplied_check) {
        this.supplied_check = supplied_check;}
    
    public Stock(int stock_id, int prod_id,int sup_id, String suplied_qty, String sell_amnt, Boolean supplied_check)
    {
        this.stock_id = stock_id;
        this.prod_id = prod_id;
        this.sup_id = sup_id;
        this.suplied_qty = suplied_qty;
        this.sell_amnt = sell_amnt;
        this.supplied_check = supplied_check;
    }
}
