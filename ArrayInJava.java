/* wrapper class to achieve pass by reference concept 
for a integer datatype(primitive datatype) */
class Number{
    public int n;
    public Number(int n){
        this.n = n;
    }
}

class ArrayInJava{
	public static void main(String[] args){
    System.out.println("*****hello sriram******");
    Number num = new Number(50);
    System.out.println("Before update" + num.n);
    ArrayInJava.modify(num);
    System.out.println("After update" + num.n);
    }
    static private void modify(Number num){
        num.n++;
    }
}