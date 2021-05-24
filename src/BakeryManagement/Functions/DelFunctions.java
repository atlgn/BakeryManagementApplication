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
import java.util.Iterator;

/**
 *
 * @author gram1
 */
public class DelFunctions {

    public static void delete_customer(int cust_id) {
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
            BakeryManagementSystemProject.customers.remove(cu);
        }
    }

    public static void delete_order(int ord_id) {
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
            BakeryManagementSystemProject.orders.remove(or);
        }
    }

    public static void delete_suppliers(int sup_id) {
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
            BakeryManagementSystemProject.supplierses.remove(su);
        }
    }

    public static void delete_employee(int emp_id) {
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
            BakeryManagementSystemProject.employeeses.remove(em);
        }
    }

    public static void delete_stock(int stock_id) {
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
            BakeryManagementSystemProject.stocks.remove(st);
        }
    }

    public static void delete_orderderived(int ordderived_id) {
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
            BakeryManagementSystemProject.orderderiveds.remove(od);
        }
    }

    public static void delete_product(int prod_id) {
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
            BakeryManagementSystemProject.products.remove(pr);
        }
    }
    //-------------------------------------------------

    public static void delete_bakery(int bakery_id) {
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
            BakeryManagementSystemProject.bakeryies.remove(ba);
        }
    }
    
}
