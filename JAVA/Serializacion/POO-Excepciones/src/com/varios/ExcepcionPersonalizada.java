/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.varios;


public class ExcepcionPersonalizada extends Exception{
    protected String str1;

    public ExcepcionPersonalizada(String str1) {
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return "ExcepcionPersonalizada{" + "str1=" + str1 + '}';
    }
    
}
