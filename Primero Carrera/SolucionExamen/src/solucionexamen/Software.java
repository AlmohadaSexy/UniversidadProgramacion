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
public class Software {
    private double price;
    private int quantity;
    private String reference;
    private String name;
    private Brand brand;
    
    Software (String name, String reference, 
            double price, Brand brand,
            int quantity){
        this.price = price;
        this.quantity = quantity;
        this.reference = reference;
        this.name = name;
        this.brand = brand;
    }
    
    public String getReference (){
        return reference;
    }
    
    public String getName (){
        return name;
    }
    
    public double getTotalPrice (){
        return quantity * price;
    }
    
    public boolean changeQuantityBy (int changeBy){
        if (quantity + changeBy >= 0){
            quantity += changeBy;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean checkBrandRef (String reference){
        return reference.equals(brand.getBrandRef());
    }
}












