//package _09_JAN_2021_to_11_JAN_2021;

// Inheritance (Is - a) relationship
abstract class Abc{
    // commenting  this (show method) or removing it in this abstract class will gives error 
    // since 3 interface are exhibit multple inheritance and 
    // if we try to call the show method ( default method )
    // will gives error because all interfaces  are having equal precedences 
    // Hence the compiler don't know  to call which one
    public void show(){
        System.out.println("* class Abc *");
    }
}

interface X{
    default void show(){
        System.out.println("* interface X*");
    }
}

interface Y{
    default void show(){
        System.out.println("* interface Y*");
    }
}
interface Z{
    default void show(){
        System.out.println("* interface Z*");
    }
}
class Mul extends Abc implements X, Y, Z{}

public class MultipleInheritance {
    public static void main(String[] args){
        Mul obj = new Mul();
        obj.show();
    }
}

/*  

OUTPUT OF THE PROGRAM    
~~~~~~~~~~~~~~~~~~~~~             
* class Abc * 
-------------XXXX-------

Note:-
`````
    #considering only one interface is present then the output will be
    depends on the presence of show method in different datatype and it is
    explained below
*****************************************************************************|
        Present in   |   Absent in       |method execute or method called    |
*****************************************************************************|
-->  abstract class, |                   |method in child class              |
     interface,      |        ---        |( method overriding takes          | 
     child  class    |                   |place ).                           |
                     |                   |                                   |
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                     |                   |                                   |
--> abstract class,  |                   |method in abstract class           | 
    interface        |   child class     |( compiler gives more              | 
                     |                   | precedences to the method in      |
                     |                   | abstract class ).                 |
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
                     |                   |                                   |
---> interface       |   abstract class, |method in interface                |
                     |    child class    |( available only in                |
                     |                   |  interface ).                     |
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|                   

*/