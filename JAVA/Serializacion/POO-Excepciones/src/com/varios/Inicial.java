/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.varios;

/**
 *
 * @author Asus
 */
public class Inicial {

    
    public static void main(String[] args) {
        try{
            Nota n1 = new Nota(4);
            int a = 5;
            a = 5/0;
        }catch (ExcepcionPersonalizada e){
          System.out.println(e);
        }
        catch(Exception ex){
            System.out.println(ex);   
        }
    }
    
}
