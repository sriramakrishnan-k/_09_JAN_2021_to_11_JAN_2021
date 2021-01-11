//package _09_JAN_2021_to_11_JAN_2021;
import java.util.Scanner;

public class auto_and_un_boxing {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String args[]) { 
    System.out.println("autoboxing and unboxing are done by compiler automatically depending on needs and necessity in code");

    //Wrapper class in java are used to convert primitive datatype to reference type.
    /* Integer, Float, Double, Short, Character, Byte, Long, Boolean 
    are the built-in avaible wrapper class in java.*/
    
    Integer n = value(); // autoboxing {int (primitive type) ----> Integer (reference type)}
    Class obj = n.getClass();
    System.out.println("The value of n is "+ n + " (reference type).");
    System.out.println(obj.toString());

    int a = n; // unboxing { Integer (reference type) ----> int (primitive type)}
    System.out.println("The value of a is "+ a + " (primitive type).");
  } 

  public static int value(){
    System.out.println("Enter the integer value");
    return sc.nextInt();
  }
}