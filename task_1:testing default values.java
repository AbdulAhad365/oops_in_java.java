class Student{
    int a=1;
    boolean b;


    void sum(){
        System.out.println("sum is ");
    }
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(double a,double b){
        System.out.println(a+b+" woow");
    }
//    void sum(int a,double b){
//        System.out.println("int +double");
//    }
}
public class oops {
    public static void main(String[] args) {
        Student s=new Student();
        s.sum();
        s.sum(3,2.0);

        System.out.println(s.b);
    }
}
