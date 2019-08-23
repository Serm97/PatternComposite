/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

import composite.CompositeProduct;
import composite.SimpleProduct;

/**
 *
 * @author Sergio Ramirez
 */
public class CompositePattern {

    public static void main(String[] args) {
        //Leaf
        SimpleProduct cd = new SimpleProduct("CD Salsa", 52, "CDList");
        SimpleProduct usb = new SimpleProduct("Memoria USB", 20, "KingStone");
        SimpleProduct book = new SimpleProduct("Cronicas", 58, "Editorial Lavert");
        SimpleProduct headphone = new SimpleProduct("Audifonos", 18, "Samsung");

// Construcción de Compuestos
        System.out.println("\n");
        CompositeProduct boxMusic = new CompositeProduct("Box of Music");
        boxMusic.addProduct(cd, boxMusic.getName());
        boxMusic.addProduct(headphone, boxMusic.getName());
        System.out.println("\n");
        CompositeProduct boxInfo = new CompositeProduct("Box of Info");
        boxInfo.addProduct(usb, boxInfo.getName());
        boxInfo.addProduct(book, boxInfo.getName());

        System.out.println("\n");
        CompositeProduct boxAll = new CompositeProduct("Box All");
        boxAll.addProduct(cd, boxAll.getName());
        boxAll.addProduct(usb, boxAll.getName());
        boxAll.addProduct(headphone, boxAll.getName());
        boxAll.addProduct(book, boxAll.getName());

//Creación de Paquetes conformados por varios compuestos
        System.out.println("\n");
        CompositeProduct box = new CompositeProduct("Shipping Box");
        box.addProduct(boxMusic, box.getName());
        box.addProduct(boxInfo, box.getName());
        box.addProduct(boxAll, box.getName());

        Weighing wightOrder = new Weighing("#REF211265");
        wightOrder.addProduct(box);
        wightOrder.printWeigth();


    }
    
}
