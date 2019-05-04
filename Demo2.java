/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Demo2 {
    public static void main(String arg[]){
        Box rec=new Box();
        rec.height=5;
        rec.width=6.5;
        rec.length=8;
        double g=rec.volume();
        System.out.println(g);
        
        System.out.println(rec.volume());
        
    }
    
}

class Box{
    double height,width,length;
    double vol,ar;
    
    double volume(){
        vol=height*width*length;
        return vol;
    }
    double area(){
        ar=6*(height*width);
        return ar;
    }
}
