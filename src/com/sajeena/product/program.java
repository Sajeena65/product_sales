/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.product;

import com.sajeena.product.Package.sales;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] products = new String[10];
        double[] price = new double[products.length];
        boolean[]status=new boolean[products.length];
        int[] quantity = new int[products.length];
        int choice;

        sales product = new sales(input, products,status, price, quantity);
        while (true) {

            System.out.println("1. Enter name of product:");
            System.out.println("2. Enter price");
            System.out.println("3. Enter quantity");
            System.out.println("4. Search product");
            System.out.println("5. Exit");

            System.out.print("Enter your choice[1-5]: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    product.productname();
                    break;
                case 2:
                    product.price();
                    break;

                case 3:
                    product.quantity();
                    break;
                case 4:
                    product.search();
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }

    }

}
