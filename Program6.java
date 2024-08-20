//import stuff here!

//Your code here
import java.util.Scanner;

public class Program6
{public static void main (String[] args)
    {
    
//get radius from user using a double
Scanner user_imput = new Scanner(System.in); 
System.out.println("enter radius: ");
double radius = user_imput.nextDouble();

//use final for pi value
final double piValue= 3.14159;


//calculations
double diameter= radius*2;
        
double circumference= 2*(piValue*radius);
double area= piValue*(radius*radius);
        
//changing the decimal places
radius= ((int)((radius*1000)+0.5))/1000.0;
area= ((int)((area*1000)+0.5))/1000.0;
circumference= ((int)((area*1000)+0.5))/1000.0;
diameter= ((int)((diameter*1000)+0.5))/1000.0;
        
        System.out.println("the radius of the circle= " + radius);
         System.out.println("the area of the circle= " + area);
          System.out.println("the circumference of the circle= " + circumference);
           System.out.println("the diameter of the circle= " + diameter);
        
    
}}



//Paste console output below:
/*

enter radius: 
2
the radius of the circle= 2.0
the area of the circle= 12.566
the circumference of the circle= 12.566
the diameter of the circle= 4.0

*/
