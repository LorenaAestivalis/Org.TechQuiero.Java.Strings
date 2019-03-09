/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Org.TechQuiero.Java.Strings.Contoller;

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
/**
 *
 * @author claudia11
 */
public class MyString {

   public static void main(String[] args){
        HashMap<Integer,String> HMap = new HashMap<Integer,String>();
        

        
        
        Integer number=0;
        //do{
         String cadena = (String) JOptionPane.showInputDialog(null, "Enter the number of words that make up your full name.\n" +
         " ", "YOUR FULL NAME", JOptionPane.PLAIN_MESSAGE, null, null, null);
         number = Integer.parseInt(cadena);
        //}while(number!=0||number!=null);
        
        for(int i=0; i<number;i++){
            String name = (String) JOptionPane.showInputDialog(null, (i+1)+". Palabra\n" +
         " ", "YOUR FULL NAME", JOptionPane.PLAIN_MESSAGE, null, null, null);
                     HMap.put(i, name);
        }
       
        
        try{
            String nombreCompleto="";
        for(Map.Entry<Integer, String>entry : HMap.entrySet() ){
           String cadena1= entry.getValue();
           nombreCompleto=nombreCompleto+" "+cadena1;
           
        }
        
        JOptionPane.showMessageDialog(null, nombreCompleto); 
        }catch(Exception e){
                        JOptionPane.showConfirmDialog(null, e);                    }
        
        }
   
    
}
