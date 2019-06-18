/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionexamen;

import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class Computer {
    private String ownerName;
    private ArrayList<String> discountBrandRef
            = new ArrayList <>();
    private ArrayList<Component> components
            = new ArrayList <>();
    private ArrayList<Software> programs
            = new ArrayList <>();
    
    Computer (String ownerName){
        this.ownerName = ownerName;
    }
    
    public boolean addComponent (Component component){
        String reference = component.getReference();
        
        for (int i = 0; i < components.size(); i++){
            if (reference.equals(components.get(i).getReference())){
                return false;
            }
        }
        
        // no hay componente con misma referencia.
        components.add(component);
        return true;
    }
    
    public boolean addProgam (Software program){
        String reference = program.getReference();
        
        for (int i = 0; i < programs.size(); i++){
            if (reference.equals(programs.get(i).getReference())){
                return false;
            }
        }
        
        // no hay software con misma referencia.
        programs.add(program);
        return true;
    }
    
    public boolean changeQuantityComponent(
    String reference, int changeBy){
        for (int i = 0; i < components.size(); i++){
            if (reference.equals(components.get(i).getReference())){
                return components.get(i).changeQuantityBy(changeBy);
            }
        }
        
        return false;
    }
    
    public boolean changeQuantitySoftware(
    String reference, int changeBy){
        for (int i = 0; i < programs.size(); i++){
            if (reference.equals(programs.get(i).getReference())){
                return programs.get(i).changeQuantityBy(changeBy);
            }
        }
        
        return false;
    }
    
    public boolean addDiscountBrand (String reference){
        for (int i = 0; i < discountBrandRef.size(); i++){
            if (reference.equals(discountBrandRef.get(i))){
                return false;
            }
        }
        
        discountBrandRef.add(reference);
        return true;
    }
    
    public double totalPrice (){
        double componentTotal = 0;
        
        for (int i = 0; i < components.size(); i++){
            componentTotal += components.get(i).getTotalPrice();
        }
        
        double programTotal = 0;
        
        for (int i = 0; i < programs.size(); i++){
            Software program = programs.get(i);
            boolean hasDiscount = false;
            for (int j = 0; j < discountBrandRef.size(); j++){
                if (program.checkBrandRef(discountBrandRef.get(j))){
                    hasDiscount = true;
                    break;
                }
            }
            
            if (hasDiscount){
                programTotal += program.getTotalPrice() * 0.85;
            }else{
                programTotal += program.getTotalPrice();
            }
        }
        
        return programTotal + componentTotal;
    }
}
