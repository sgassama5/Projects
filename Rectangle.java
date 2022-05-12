/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

/**
 *
 * @author sidig
 */
public class Rectangle {

   private int width;
    private int length;

    public Rectangle() {
        width = 0;
        length = 0;
    }

    public Rectangle(int aLength, int aWidth) {
        setLength(aLength);
        setWidth(aWidth);
    }
    public Rectangle(int aLength) {
        length = aLength;
       width = 0;
    }
    
   public Rectangle(Rectangle aRectangleObject){
        length = aRectangleObject.length;
       width = aRectangleObject.width;
    }
   public int getLength(){
   return length;
   }
     public int getWidth(){
   return length;
   }
   public void setLength(int aLength){
   if(aLength >= 1 && aLength <= 20)
       length = aLength;
   else
       length = 0;
   }
   public void setWidth(int aWidth){
   if(aWidth >= 1 && aWidth <= 20)
       width = aWidth;
   else
       width = 0;
   }
   public int calculateArea(){
   return length * width;
   }

    @Override
    public String toString() {
        return "The length is " 
                + length + " the width is  " + width + " The area is: " + calculateArea();
    }
   
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10,4);
        Rectangle r3 = new Rectangle(7);
        Rectangle r4 = new Rectangle(r2);
        System.out.println(r1.toString());
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
      
                
    }
    
}
