/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.product.Package;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class sales {

    Scanner input;
    String[] products;
    double[] price;
    int[] quantity;
    int pc = 0;
    int c = 0;
    int j;
    String sproduct = "";
    String brand = "";
    boolean[] status;

    public sales(Scanner input, String[] products,boolean[] status, double[] price, int[] quantity) {
        this.input = input;
        this.products = products;
        this.status=status;
        this.price = price;
        this.quantity = quantity;
    }

    public void productname() {

        if (pc < 10) {
            System.out.print("Enter name of product: ");
            products[pc] = input.next();
            c = pc;
            pc++;
        } else {
            System.out.println("You have exceeded the limit.");
        }

    }

    public void price() {
        System.out.print("Enter price for " + products[c] + ":");
        price[c] = input.nextDouble();

    }

    public void quantity() {
        System.out.print("Enter quantity for " + products[c] + ": ");
        quantity[c] = input.nextInt();
    }

    public void search() {
        System.out.println("Enter product's name: ");
        sproduct = input.next();
        for (int i = 0; i < pc; i++) {
            if (products[i].equalsIgnoreCase(sproduct)) {
                brand = "found";
                j = i;

            }
        }
        if (brand.equals("found")) {
            System.out.println("Product details:");
            System.out.println("Product's name: " + products[j]);
            System.out.println("Product's status: "+brand);
            System.out.println("Product's price: " + price[j]);
            System.out.println("Product's quantity: " + quantity[j]);
        } else {
            System.out.println("Product not found!");
        }

    }

}
