/**
 * @author Ali ATILGAN
 */
package BakeryManagement;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Employees implements Serializable{
   
   private int emp_id; 
   private String emp_name;
   private String emp_email;
   private String emp_phone;
   private String emp_address;
   private String emp_city;
   private String emp_salary;
   private GregorianCalendar emp_hiredate;

    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
         
    public String getEmp_email() {
        return emp_email;
    }
    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_phone() {
        return emp_phone;
    }
    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    public String getEmp_address() {
        return emp_address;
    }
    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public String getEmp_city() {
        return emp_city;
    }
    public void setEmp_city(String emp_city) {
        this.emp_city = emp_city;
    }
	
    public String getEmp_salary() {
        return emp_salary;
    }
    public void setEmp_salary(String emp_salary) {
        this.emp_salary = emp_salary;
    }
    
    public GregorianCalendar getEmp_hiredate() {
        return emp_hiredate;
    }
    public void setEmp_hiredate(GregorianCalendar emp_hiredate) {
        this.emp_hiredate = emp_hiredate;
    }

    public Employees(int emp_id, String emp_name, String emp_email, 
                   String emp_phone, String emp_address, String emp_city, String emp_salary,
                   GregorianCalendar emp_hiredate) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_email = emp_email;
        this.emp_phone = emp_phone;
        this.emp_address = emp_address;
        this.emp_city = emp_city;
        this.emp_salary = emp_salary;
        this.emp_hiredate = emp_hiredate;
    }
    
   
}

