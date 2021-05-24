/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BakeryManagement.Functions;

import BakeryManagement.BakeryManagementSystemProject;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author gram1
 */
public class RetriveFunctions {

    public static void retrieve_stock() throws IOException, ClassNotFoundException {
        File infile = new File("stocks.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            BakeryManagementSystemProject.stocks = (ArrayList) inObjectStream.readObject();
        }
    }

    public static void retrieve_employee() throws IOException, ClassNotFoundException {
        File infile = new File("employeeses.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            BakeryManagementSystemProject.employeeses = (ArrayList) inObjectStream.readObject();
        }
    }

    public static void retrieve_order() throws IOException, ClassNotFoundException {
        File infile = new File("orders.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            BakeryManagementSystemProject.orders = (ArrayList) inObjectStream.readObject();
        }
    }

    public static void retrieve_suppliers() throws IOException, ClassNotFoundException {
        File infile = new File("supplierses.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            BakeryManagementSystemProject.supplierses = (ArrayList) inObjectStream.readObject();
        }
    }

    public static void retrieve_orderderived() throws IOException, ClassNotFoundException {
        File infile = new File("orderderiveds.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            BakeryManagementSystemProject.orderderiveds = (ArrayList) inObjectStream.readObject();
        }
    }

    //----------------------------------------------
    public static void retrieve_customer() throws IOException, ClassNotFoundException {
        File infile = new File("customers.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            BakeryManagementSystemProject.customers = (ArrayList) inObjectStream.readObject();
        }
    }

    public static void retrieve_product() throws IOException, ClassNotFoundException {
        File infile = new File("products.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            BakeryManagementSystemProject.products = (ArrayList) inObjectStream.readObject();
        }
    }
    //------------------------------------------------------

    public static void retrieve_bakery() throws IOException, ClassNotFoundException {
        File infile = new File("bakeryies.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            BakeryManagementSystemProject.bakeryies = (ArrayList) inObjectStream.readObject();
        }
    }
    
}
