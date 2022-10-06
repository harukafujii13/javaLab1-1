// import java.text.NumberFormat;

// public class Exersise2 {
//     public static void main(String[] args){
//     long doublePayment = 324;
//     NumberFormat n = NumberFormat.getCurrencyInstance(Local.US);
//     String s = n.format(doublePayment);
//     System.out.println(s);
//     }
// }

import java.text.NumberFormat;

 public class Exersise2{
    public static void main(String[] args){
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Input the cent");
    int cents = scan2.nextInt();
    System.out.printf("The value of %d dollar and %d cents%n", (cents / 100), (cents % 100));
 }
}
