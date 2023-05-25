
package oopisfun_practice;


public class Pen {
    
    int point = 10;
    String color = "Blue";
    String type = "gel";
    
    static boolean clicked = false;
    
    public static void click(){
     clicked = true;
    }
    
    public static void unclicked(){
    clicked = false;
    }
    
    
}
