/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BakeryManagement.Functions;

import BakeryManagement.Bakery;
import BakeryManagement.BakeryManagementSystemProject;
import BakeryManagement.Customer;
import BakeryManagement.Employees;
import BakeryManagement.Order;
import BakeryManagement.OrderDerived;
import BakeryManagement.Product;
import BakeryManagement.Stock;
import BakeryManagement.Suppliers;
import java.util.GregorianCalendar;
import java.util.Iterator;

/**
 *
 * @author gram1
 */
public class EditFunctions {

    public static void edit_suppliers(int sup_id, String sup_name, String sup_contact, String sup_address, String sup_city) {
        Suppliers su = null;
        Boolean found = false;
        Iterator<Suppliers> itr = BakeryManagementSystemProject.supplierses.iterator();
        while (itr.hasNext()) {
            su = itr.next();
            if (sup_id == su.getSup_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            su.setSup_name(sup_name);
            su.setSup_contact(sup_contact);
            su.setSup_address(sup_address);
            su.setSup_city(sup_city);
        }
    }

    public static void edit_orderderived(int ordderived_id, int ord_id, int prod_id, String prod_qty, String ord_bill) {
        OrderDerived od = null;
        Boolean found = false;
        Iterator<OrderDerived> itr = BakeryManagementSystemProject.orderderiveds.iterator();
        while (itr.hasNext()) {
            od = itr.next();
            if (ordderived_id == od.getOrdderived_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            od.setOrd_id(ord_id);
            od.setProd_id(prod_id);
            od.setProd_qty(prod_qty);
            od.setOrd_bill(ord_bill);
        }
    }

    public static void edit_customer(int cust_id, String cust_name, String cust_email, String cust_address, String cust_city, String cust_phone, String cust_grade) {
        Customer cu = null;
        Boolean found = false;
        Iterator<Customer> itr = BakeryManagementSystemProject.customers.iterator();
        while (itr.hasNext()) {
            cu = itr.next();
            if (cust_id == cu.getCust_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            cu.setCust_name(cust_name);
            cu.setCust_email(cust_email);
            cu.setCust_address(cust_address);
            cu.setCust_city(cust_city);
            cu.setCust_phone(cust_phone);
            cu.setCust_grade(cust_grade);
        }
    }

    public static void edit_order(int ord_id, int cust_id, int emp_id, GregorianCalendar ord_date, String ord_note) {
        Order or = null;
        Boolean found = false;
        Iterator<Order> itr = BakeryManagementSystemProject.orders.iterator();
        while (itr.hasNext()) {
            or = itr.next();
            if (ord_id == or.getOrd_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            or.setCust_id(cust_id);
            or.setEmp_id(emp_id);
            or.setOrd_date(ord_date);
            or.setOrd_note(ord_note);
        }
    }

    public static void edit_bakery(int bakery_id, String bakery_name) {
        Bakery ba = null;
        Boolean found = false;
        Iterator<Bakery> itr = BakeryManagementSystemProject.bakeryies.iterator();
        while (itr.hasNext()) {
            ba = itr.next();
            if (bakery_id == ba.getBakery_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            ba.setBakery_name(bakery_name);
        }
    }

    public static void edit_employee(int emp_id, String emp_name, String emp_email, String emp_phone, String emp_address, String emp_city, String emp_salary, GregorianCalendar emp_hiredate) {
        Employees em = null;
        Boolean found = false;
        Iterator<Employees> itr = BakeryManagementSystemProject.employeeses.iterator();
        while (itr.hasNext()) {
            em = itr.next();
            if (emp_id == em.getEmp_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            em.setEmp_name(emp_name);
            em.setEmp_email(emp_email);
            em.setEmp_phone(emp_phone);
            em.setEmp_address(emp_address);
            em.setEmp_city(emp_city);
            em.setEmp_salary(emp_salary);
            em.setEmp_hiredate(emp_hiredate);
        }
    }

    public static void edit_stock(int stock_id, int prod_id, int sup_id, String suplied_qty, String sell_amnt, Boolean supplied_check) {
        Stock st = null;
        Boolean found = false;
        Iterator<Stock> itr = BakeryManagementSystemProject.stocks.iterator();
        while (itr.hasNext()) {
            st = itr.next();
            if (stock_id == st.getStock_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            st.setProd_id(prod_id);
            st.setSup_id(sup_id);
            st.setSupplied_qty(suplied_qty);
            st.setSell_amnt(suplied_qty);
            st.setSupplied_check(supplied_check);
        }
    }

    public static void edit_product(int prod_id, String prod_price, String prod_name) {
        Product pr = null;
        Boolean found = false;
        Iterator<Product> itr = BakeryManagementSystemProject.products.iterator();
        while (itr.hasNext()) {
            pr = itr.next();
            if (prod_id == pr.getProd_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            pr.setProd_price(prod_price);
            pr.setProd_name(prod_name);
        }
    }
    //--------------------------------------
    
}
