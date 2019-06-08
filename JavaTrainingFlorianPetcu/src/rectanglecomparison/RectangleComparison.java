/*
 * Program to compare the area of two rectangles
 */
package rectanglecomparison;

/**
 *Program to compare the area of two rectangles
 */
import java.util.Scanner;

public class RectangleComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int len, wid, peri, area;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Lengt and Width of Rectangle 1:");
        len = scan.nextInt();
        wid = scan.nextInt();
        
        int area1;
        area1 = len*wid;
        int peri1;
        peri1 = (2*len) + (2*wid);
        
        System.out.println("Area 1 = "+area1);
        System.out.println("\nPerimeter 1 ="+peri1);
        
        System.out.println("Enter Lengt and Width of Rectangle 2:");
        len = scan.nextInt();
        wid = scan.nextInt();
        
        int area2;
        area2 = len*wid;
        int peri2;        
        peri2 = (2*len) + (2*wid);
        
        System.out.println("Area 2 = "+area2);
        System.out.println("\nPerimeter 2 = "+peri2);
        boolean Area1 = false;
        boolean Area2 = false;
        
        // Comparison of Areas
        if(area1 > area2){
            System.out.println(area1+ "Area of Rectangle 1 is greater than Area of Rectangle 2" +area2);
        }
        else{
            System.out.println(area1+ "Area of Rectangle 1 is less than Area of Rectangle 2" +area2);
        }
        // Comparison of Perimeters
        if(peri1 > peri2){
            System.out.println(peri1+ "Perimeter of Rectangle 1 is greater than Perimeter of Rectangle 2" +peri2);
        }
        else{
            System.out.println(peri1+ "Perimeter of Rectangle 1 is less than Perimeter of Rectangle 2" +peri2);
        }
        }
        
    }
    
