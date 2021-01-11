/* 
           Topics covered 
        `````````````````````
   default initialisation of instance variable
   default value of primitive datatypes
   Aggregate relationship (has - a)
   Array declaration and initialisation
   Dynamic array

*/


//package _09_JAN_2021_to_11_JAN_2021;
import java.util.Scanner;

//Here class A and Class String exhibit aggregate(has-a) relation ship
//                                      ````````````````
//                                      ````````````````
//which mean A has a String in it.
// No inheritance
class A{
    public String s;  // default to null because String is also a (class)reference type in java
}

class defaultVariableValue{
                             // default value or default initialization
    public byte BYTE;        //   (byte)0
    public short SHORT;      //   (short)0
    public int INTEGER;      //   0
    public long LONG;        //   (long)0

    public float FLOAT;      //   0.00f
    public double DOUBLE;    //   0.00d

    public char CHAR;        //   '\u0000'

    public boolean BOOLEAN;  //   false
}
class ArrayInJava{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        defaultVariableValue obj = new defaultVariableValue();
        System.out.println( "obj.BOOLEAN = " + obj.BOOLEAN);
        System.out.println("obj.CHAR = " + obj.CHAR);

        System.out.println("obj.BYTE = " + obj.BYTE);
        System.out.println("obj.SHORT = " + obj.SHORT);
        System.out.println("obj.INTEGER = " + obj.INTEGER);
        System.out.println("obj.LONG = " + obj.LONG);

        System.out.println("obj.FLOAT =" + obj.FLOAT);
        System.out.println("obj.DOUBLE =" + obj.DOUBLE);

        //for a derived or user-defined datatype(reference type) value is null
        A obj2 = new A();
        System.out.println("obj1.s = " + obj2.s);

        //array in java --> declaration and initialisation
        int[] arr;         // declaration of array of size 5
        arr = new int[5];

        //int[] arr = new int[5]; valid way

        //declaration and initialisation with value initially
        int[] arr2 = {1,2,4,5,9};

        //we can access array using index
        // by using loops reading and writing are done in effective way in a array using index

        System.out.println("Enter the elements");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements in arr are");
        for(int j : arr){
            System.out.println(j);
        }
    }
}