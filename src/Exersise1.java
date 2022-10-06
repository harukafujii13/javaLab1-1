// import java.util.Scanner;

// public class Exersise1 {
//     public static void main(String[] args){

//         double radius,area;
//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter the radius of the circle");
//         radius = input.nextDouble();
//         input.close();

//         area = Math.PI * radius * radius;

//         System.out.println("Area of the circle is "+area);
//     }
// }

import java.util.Scanner;
public class Exersise1 {
    public static void main(String[] args){

    Scanner scan1 = new Scanner(System.in);
    System.out.print("Input the radius");
    int radius = scan1.nextInt();
    System.out.println("The radius is: " + radius);
    System.out.println("The area is: " + (Math.PI * radius * radius));

    }
}
