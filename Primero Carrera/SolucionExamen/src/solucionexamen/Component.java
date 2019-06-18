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
public class Component {
    private double price;
    private int quantity;
    private String reference;
    private String name;
    
    Component (String name, String reference,
            double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.reference = reference;
    }
    
    public String getReference (){
        return reference;
    }
    
    public String getName (){
        return name;
    }
    
    public int getQuantity (){
        return quantity;
    }
    
    public boolean changeQuantityBy (int changeBy){
        if (changeBy + quantity >= 0){
            quantity += changeBy;
            return true;
        }else{
            return false;
        }
    }
    
    public double getTotalPrice (){
        return quantity * price;
    }
}













