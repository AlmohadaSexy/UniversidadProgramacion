/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtracksuma10;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author profesoresi
 */
public class Estado {
    ArrayList<Integer> actual = new ArrayList <>();
    ArrayList<Integer> candidatos = new ArrayList <>();
    
    // constructor copia
    Estado (Estado from){
        this.actual = new ArrayList <>(from.actual);
        this.candidatos = new ArrayList <>(from.candidatos);
    }
    
    // constructor inicial
    Estado (ArrayList<Integer> numeros){
        candidatos = new ArrayList<>(numeros);
    }
    
    @Override
    public String toString (){
        String res = "[";

        for (int i = 0; i < actual.size(); i++){
            if (i != actual.size() - 1){
                res += actual.get(i) + ",";
            }else{
                res += actual.get(i);
            }
        }
        res += "]";
        
//        res += ",resto[";
//
//        for (int valor : candidatos){
//            res +=valor + ",";
//        }
//        res += "]";
        
        return res;
    }
    
}
