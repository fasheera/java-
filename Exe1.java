/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
//how to work parameters
public class Exe1 {
    public static void main(String args[]){
       Eg h=new Eg();
       h.printvalues(25, 30);
        
    }
    
}


class Eg{
    void printvalues(int a,int b){
        int sum;
        sum=a+b;
        System.out.println(sum);
    }
}
