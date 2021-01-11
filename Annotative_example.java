//package _09_JAN_2021_to_11_JAN_2021;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)              //Target annotation indicate on which the element the annotation going to be apply.
@Retention(RetentionPolicy.RUNTIME)    //Retention annotation indicate on which phase it available
@interface Check{
    int age() default 20;
    String name() default "sriram";
}

@Check(age = 30, name = "man")  //User defined Annotation is applied on the below class
class Details{

    public String Comment;
    public Details(String Comment){
        this.Comment = Comment;
    }

}

public class Annotative_example {

    /* 
    @Deprecated annotation tells the compiler 
    to show the method as a deprecated method for the user
    */
    @Deprecated 
    public static void display(){
        System.out.println("This method id deprecated");
    }

    public static void main(String[] args){
        display();
        Details personalDetail = new Details("Before this age any one should try to settle in life");
        
        /* --> creating Class obj to hold the return type of getClass method ( return the class of a object)
           --> object yields by getClass method helps to find or to see the annotation used on class using getAnnotation member function
           --> Any no o
        Class c = personalDetail.getClass();
        Check an = (Check) c.getAnnotation(Check.class);
        System.out.println(an.age());
        System.out.println(an.name());
    }  
}

/*  

OUTPUT OF THE PROGRAM    
~~~~~~~~~~~~~~~~~~~~~             
30
man
 

*/