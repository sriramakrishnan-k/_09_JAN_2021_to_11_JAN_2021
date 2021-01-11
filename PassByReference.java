//package _09_JAN_2021_to_11_JAN_2021;

/* 
   In java by default passing args are  pass by value
   eventhough obj in java are pass by value(passing a copy), 
   still copy of the obj point to the same memory address
   since obj are reference datatype.
   Hence to achieve pass by reference wrapper class are used to
   convert primitive data to a reference type.
*/
import java.util.Scanner;
   
class Wrapper{
    public int n;
    Wrapper(int n){
        this.n = n;
    }
}
public class PassByReference {
    public static Scanner sc = new Scanner(System.in);
    public static void change(Wrapper n){
    n.n++;
    }
    public static void change(int n){
    n++;
    }
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        System.out.println("Enter the integer value");
        Wrapper obj = new Wrapper(sc.nextInt());
        System.out.println("Before -> obj.n = " + obj.n);
        change(obj); // 
        System.out.println("After -> obj.n = " + obj.n);
        System.out.println("Before -> obj.n = " + obj.n);
        change(obj.n);
        System.out.println("After -> obj.n = " + obj.n);
    }
}
