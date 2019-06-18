/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionexamen;

/**
 *
 * @author Alberto
 */
public class SolucionExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Computer myComputer = new Computer ("MiOrdenador");
        
        Component ram = new Component ("DDR3 RAM 8G",
        "345", 120, 3);
        Component cpu = new Component ("i7",
        "123", 350.50, 2);
        
        Brand ms = new Brand ("Microsoft", "1");
        Software ssoo = new Software ("Windows 10",
        "345", 100, ms, 1);
        
        Software office365 = new Software ("Office 365", 
                "2", 200, ms, 5);
        
        myComputer.addComponent(cpu);
        myComputer.addComponent(ram);
        myComputer.addProgam(ssoo);
        myComputer.addProgam(office365);
        
        myComputer.addDiscountBrand("1");
        
        System.out.println(myComputer.totalPrice());
        
        myComputer.changeQuantitySoftware("2", -3);
        
        System.out.println(myComputer.totalPrice());
    }
    
}










