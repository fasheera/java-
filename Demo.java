/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Demo {
    public static void main(String arg[]){
        Student amal=new Student();
        amal.name="amal";
        amal.age=21;
        
                
       amal.details();
                
                
                
        
    }
    
}


class Student{
    String name;
    int age;
    
    void details(){
    System.out.println(name);
    System.out.print(age);
}
    
}
