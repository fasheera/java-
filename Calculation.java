/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
//method overloading
public class Calculation {
    public static void main(String arg[]){
        
        Ega k=new Ega();
        
        k.addition(5, 6);
       k.addition(6, 20, 10);
    }
    
}

class Ega{
    void addition(int a,int b){
    System.out.println(a+b);
    
    }
    void addition(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
