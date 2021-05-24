/**
 * @author Ali ATILGAN
 */
package BakeryManagement;

import java.io.Serializable;

public class Product implements Serializable{
   private int prod_id; 
   private String prod_price;
   private String prod_name;

    public int getProd_id() {
        return prod_id;}
    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;}
    
    public String getProd_price() {
        return prod_price;}
    public void setProd_price (String prod_price) {
        this.prod_price = prod_price;}
     
    public String getProd_name() {
        return prod_name;}
    public void setProd_name (String prod_name) {
        this.prod_name = prod_name;}
    
    public Product (int prod_id, String prod_price, String prod_name)
    {
        this.prod_id = prod_id;
        this.prod_price = prod_price;
        this.prod_name = prod_name;
    }
}
