/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BakeryManagement.Functions;

import BakeryManagement.BakeryManagementSystemProject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author gram1
 */
public class BackupFunctions {

    public static void backup_bakery() throws IOException {
        File outfile = new File("bakeryies.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(BakeryManagementSystemProject.bakeryies);
        }
    }

    public static void backup_suppliers() throws IOException {
        File outfile = new File("supplierses.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(BakeryManagementSystemProject.supplierses);
        }
    }

    public static void backup_orderderived() throws IOException {
        File outfile = new File("orderderiveds.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(BakeryManagementSystemProject.orderderiveds);
        }
    }

    public static void backup_stock() throws IOException {
        File outfile = new File("stocks.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(BakeryManagementSystemProject.stocks);
        }
    }

    public static void backup_customer() throws IOException {
        File outfile = new File("customers.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(BakeryManagementSystemProject.customers);
        }
    }

    public static void backup_product() throws IOException {
        File outfile = new File("products.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(BakeryManagementSystemProject.products);
        }
    }
    //-----------------------------------

    public static void backup_employee() throws IOException {
        File outfile = new File("employeeses.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(BakeryManagementSystemProject.employeeses);
        }
    }

    public static void backup_order() throws IOException {
        File outfile = new File("orders.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(BakeryManagementSystemProject.orders);
        }
    }
    
}
