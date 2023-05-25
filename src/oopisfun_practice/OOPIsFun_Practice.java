
package oopisfun_practice;

import java.util.Arrays;


public class OOPIsFun_Practice {

   
    public static void main(String[] args) {
        
        Pen p = new Pen();
        
        System.out.println("Color of the pen: " + p.color);
        System.out.println("Point of the pen: " + p.point);
        System.out.println("Type of the pen: " + p.type);
        
        System.out.println("Clicked? " + p.clicked);
        
        p.click();
        
        System.out.println("Clicked? " + p.clicked);
        
        
        Headphone hp = new Headphone();
        
        System.out.println(hp.charge);
        System.out.println(hp.color);

        System.out.println(hp.power);
        
        System.out.println(Arrays.toString(hp.control)); 
     
    }
}
