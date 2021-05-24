/**
 * @author Ali ATILGAN
 */
package BakeryManagement;

import java.io.Serializable;


public class Suppliers implements Serializable{
   private int sup_id; 
   private String sup_name;
   private String sup_contact; 
   private String sup_address;
   private String sup_city; 
 
    public int getSup_id() {
        return sup_id;}
    public void setSup_id(int sup_id) {
        this.sup_id = sup_id;}
        
    public String getSup_name() {
        return sup_name;}
     public void setSup_name(String sup_name) {
        this.sup_name = sup_name;}
     
    public String getSup_contact() {
        return sup_contact;}
     public void setSup_contact(String sup_contact) {
        this.sup_contact = sup_contact;}
     
    public String getSup_address() {
        return sup_address;}
    public void setSup_address(String sup_address) {
        this.sup_address = sup_address;}
    
    public String getSup_city() {
        return sup_city;}
    public void setSup_city(String sup_city) {
        this.sup_city = sup_city;}
   
    public Suppliers(int sup_id, String sup_name, String sup_contact, String sup_address, String sup_city)
    {
        this.sup_id = sup_id;
        this.sup_name = sup_name;
        this.sup_contact = sup_contact;
        this.sup_address = sup_address;
        this.sup_city = sup_city;
    }
}

