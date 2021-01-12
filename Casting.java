import java.util.Scanner;
public class Casting{
    public static void main(String[] args){
        int a = 1234556;
        System.out.println((float)a);
        System.out.println((byte)a); // value of a is greater than the byte limit hence the value is start from initial and goes lies a revolution 
        System.out.println((short)a); // same rule applied
        System.out.println((double)a);// covertion to a fractional value
        System.out.println((long)a); // covertion to a higher range
        System.out.println("casting of int/float to boolean or char to boolean is not possible in java");
        System.out.println("casting of int/float to char");
        for(int i = -20; i<200 ; i++){
            System.out.printf("int %d --> char %c || float %f --> char %c \n",i,(char)i,(float)i,(char)((float)i)); 
        }
        // integer value can be cast to char but the integer value don't have any equivalent then it show ?
    }
}