/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]){
        int x ;
        Scanner y= new Scanner(System.in);
        System.out.print("the Year:");
         x=y.nextInt();
         
        int d=x%4;
        if(d==0){
            System.out.println("the "+x+" is leap year");
            
        }
        else{
            System.out.print("the "+x+" is not Leapyear");
            
        }
        
 
        
    }
    
    
}
