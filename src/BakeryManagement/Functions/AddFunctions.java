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

/**
 *
 * @author gram1
 */
public class AddFunctions {

    public static void add_bakery(int bakery_id, String bakery_name) {
        Bakery ba = new Bakery(bakery_id, bakery_name);
        BakeryManagementSystemProject.bakeryies.add(ba);
    }

    public static void add_employees(int emp_id, String emp_name, String emp_email, String emp_city, String emp_phone, String emp_address, String emp_salary, GregorianCalendar emp_hiredate) {
        Employees em = new Employees(emp_id, emp_name, emp_email, emp_address, emp_city, emp_phone, emp_salary, emp_hiredate);
        BakeryManagementSystemProject.employeeses.add(em);
    }

    public static void add_stock(int stock_id, int prod_id, int sup_id, String suplied_qty, String sell_amnt, Boolean supplied_check) {
        Stock st = new Stock(stock_id, prod_id, sup_id, suplied_qty, sell_amnt,supplied_check);
        BakeryManagementSystemProject.stocks.add(st);
    }

    public static void add_customer(int cust_id, String cust_name, String cust_email, String cust_address, String cust_city, String cust_phone, String cust_grade) {
        Customer cu = new Customer(cust_id, cust_name, cust_email, cust_address, cust_city, cust_phone, cust_grade);
        BakeryManagementSystemProject.customers.add(cu);
    }

    public static void add_order(int ord_id, int cust_id, int emp_id, GregorianCalendar ord_date, String ord_note) {
        Order or = new Order(ord_id, cust_id, emp_id, ord_date, ord_note);
        BakeryManagementSystemProject.orders.add(or);
    }

    public static void add_orderderived(int ordderived_id, int ord_id, int prod_id, String prod_qty, String ord_bill) {
        OrderDerived od = new OrderDerived(ordderived_id, ord_id, prod_id, prod_qty, ord_bill);
        BakeryManagementSystemProject.orderderiveds.add(od);
    }

    public static void add_suppliers(int sup_id, String sup_name, String sup_contact, String sup_address, String sup_city) {
        Suppliers su = new Suppliers(sup_id, sup_name, sup_contact, sup_address, sup_city);
        BakeryManagementSystemProject.supplierses.add(su);
    }

    public static void add_product(int prod_id, String prod_price, String prod_name) {
        Product pr = new Product(prod_id, prod_price, prod_name);
        BakeryManagementSystemProject.products.add(pr);
    }
    
}
