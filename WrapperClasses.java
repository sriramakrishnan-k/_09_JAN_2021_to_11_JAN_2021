//package _09_JAN_2021_to_11_JAN_2021;
import java.util.Scanner;

/*
Wrapper class in java are used to convert primitive datatype to reference type.
Integer, Float, Double, Short, Character, Byte, Long, Boolean 
are the built-in avaible wrapper class in java.
*/
class Wrapper{
  public int n;
  Wrapper(int n){
    this.n = n;
  }
}
class WrapperClasses{
  public static Scanner sc = new Scanner(System.in);
  //method overloading
  public static void change(Wrapper n){
   n.n++;
  }
  public static void change(int n){
   n++;
  }
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    Wrapper obj = new Wrapper(sc.nextInt());
    //
    System.out.println("Before -> obj.n = " + obj.n);
    change(obj);//passing obj as a arg (pass by reference indirectly takes place)
                //changes reflect
    System.out.println("After -> obj.n = " + obj.n);
    System.out.println("Before -> obj.n = " + obj.n);
    change(obj.n);//passing instance variable(member) but it is a primitive datatype (pass by value)
                  //changes will never reflect
    System.out.println("After -> obj.n = " + obj.n);
  }
}