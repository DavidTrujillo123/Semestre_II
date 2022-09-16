
package com.varios;

public class InialExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=6;
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                for (int j = 0; j < 10; j++) {
                    System.out.println(j/0);
                }
            }
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
