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
import java.text.SimpleDateFormat;
import java.util.Iterator;

/**
 *
 * @author gram1
 */
public class ListFunctions {

    public static void list_stock() {
        Stock st;
        Iterator<Stock> itr = BakeryManagementSystemProject.stocks.iterator();
        System.out.printf("\n%10s %10s %15s %15s %15s %10s", "stock_id", "prod_id", "sup_id", "suplied_qty", "sell_amnt" ,"supplied_check");
        BakeryManagementSystemProject.draw_line(120);
        while (itr.hasNext()) {
            st = itr.next();
            System.out.printf("\n%10d %10s %15s %15s %15s %10s", st.getStock_id(), st.getProd_id(), st.getSup_id(), st.getSupplied_qty(), st.getSell_amnt(), st.getSupplied_check());
        }
        BakeryManagementSystemProject.draw_line(120);
    }

    public static void list_orderderived() {
        OrderDerived od;
        Iterator<OrderDerived> itr = BakeryManagementSystemProject.orderderiveds.iterator();
        System.out.printf("\n%10s %10s %15s %15s %15s", "Order Derived Id", "Order Id", "Product Id", "Product QTY", "Order Bill");
        BakeryManagementSystemProject.draw_line(120);
        while (itr.hasNext()) {
            od = itr.next();
            System.out.printf("\n%10s %10s %15s %15s %15s", od.getOrdderived_id(), od.getOrd_id(), od.getProd_id(), od.getProd_qty(), od.getOrd_bill());
        }
        BakeryManagementSystemProject.draw_line(120);
    }

    public static void list_product() {
        Product pr;
        Iterator<Product> itr = BakeryManagementSystemProject.products.iterator();
        System.out.printf("\n%10s %10s %15s", "Product Id", "Product Price", "Product Name");
        BakeryManagementSystemProject.draw_line(120);
        while (itr.hasNext()) {
            pr = itr.next();
            System.out.printf("\n%10s %10s %15s ", pr.getProd_id(), pr.getProd_price(), pr.getProd_name());
        }
        BakeryManagementSystemProject.draw_line(120);
    }

    //----------------------------------------------------
    public static void list_customer() {
        Customer cu;
        Iterator<Customer> itr = BakeryManagementSystemProject.customers.iterator();
        System.out.printf("\n%10s %10s %15s %15s %10s %12s %12s", "Customer Id", "cust_name", "cust_email", "cust_address", "cust_city", "cust_phone", "cust_grade");
        BakeryManagementSystemProject.draw_line(120);
        while (itr.hasNext()) {
            cu = itr.next();
            System.out.printf("\n%10d %10s %15s %15s %10s %12s %12s", cu.getCust_id(), cu.getCust_name(), cu.getCust_email(), cu.getCust_address(), cu.getCust_city(), cu.getCust_phone(), cu.getCust_grade());
        }
        BakeryManagementSystemProject.draw_line(120);
    }

    public static void list_employee() {
        Employees em;
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Iterator<Employees> itr = BakeryManagementSystemProject.employeeses.iterator();
        System.out.printf("\n%10s %10s %15s %15s %15s %15s %15s %15s", "Employee Id", "Employee Name", "Employee email", "Employee Phone", "Employee address", "Employee city", "Employee salary", "Employee hire date");
        BakeryManagementSystemProject.draw_line(120);
        while (itr.hasNext()) {
            em = itr.next();
            fmt.setCalendar(em.getEmp_hiredate());
            System.out.printf("\n%10s %10s %15s %15s %15s %15s %15s %15s", em.getEmp_id(), em.getEmp_name(), em.getEmp_email(), em.getEmp_phone(), em.getEmp_address(), em.getEmp_city(), em.getEmp_salary(), fmt.format(em.getEmp_hiredate().getTime()));
        }
        BakeryManagementSystemProject.draw_line(120);
    }

    public static void list_supplier() {
        Suppliers su;
        Iterator<Suppliers> itr = BakeryManagementSystemProject.supplierses.iterator();
        System.out.printf("\n%10s %10s %15s %15s %10s %12s %12s", "suade Id", "Student Id", "Course Id", "suade mt", "suade hw", "suade final", "suade lsuade");
        BakeryManagementSystemProject.draw_line(120);
        while (itr.hasNext()) {
            su = itr.next();
            System.out.printf("\n%10d %10s %15s %15s %10s", su.getSup_id(), su.getSup_name(), su.getSup_contact(), su.getSup_address(), su.getSup_city());
        }
        BakeryManagementSystemProject.draw_line(120);
    }

    public static void list_order() {
        Order or;
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Iterator<Order> itr = BakeryManagementSystemProject.orders.iterator();
        System.out.printf("\n%10s %10s %15s %15s %10s", "Order Id", "Customer Id", "Employee Id", "Order date","Order Note");
        BakeryManagementSystemProject.draw_line(120);
        while (itr.hasNext()) {
            or = itr.next();
            fmt.setCalendar(or.getOrd_date());
            System.out.printf("\n%10s %10s %15s %15s %10s", or.getOrd_id(), or.getCust_id(), or.getEmp_id(), fmt.format(or.getOrd_date().getTime()), or.getOrd_note());
        }
        BakeryManagementSystemProject.draw_line(120);
    }

    public static void list_bakery() {
        Bakery ba;
        Iterator<Bakery> itr = BakeryManagementSystemProject.bakeryies.iterator();
        System.out.printf("\n%10s %10s", "bakery_id", "bakery_name");
        BakeryManagementSystemProject.draw_line(120);
        while (itr.hasNext()) {
            ba = itr.next();
            System.out.printf("\n%10d %10s", ba.getBakery_id(), ba.getBakery_name());
        }
        BakeryManagementSystemProject.draw_line(120);
    }
    
}
