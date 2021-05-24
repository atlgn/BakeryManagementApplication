/**
 * @author Ali ATILGAN
 */
package BakeryManagement;

import java.io.Serializable;

public class Bakery implements Serializable{
   private int bakery_id; 
   private String bakery_name;


   
    public int getBakery_id() {
        return bakery_id;}
    public void setBakery_id(int bakery_id) {
        this.bakery_id = bakery_id;}
    
    public String getBakery_name() {
        return bakery_name;}
    public void setBakery_name(String bakery_name) {
        this.bakery_name = bakery_name;}

    public Bakery (int bakery_id, String bakery_name)
    {
        this.bakery_id = bakery_id;
        this.bakery_name = bakery_name;
      
    }
}
