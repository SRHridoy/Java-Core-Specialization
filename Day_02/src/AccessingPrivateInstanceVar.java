public class AccessingPrivateInstanceVar {
    public static void main(String[] args) {
        PrivateInstanceClass p1 = new PrivateInstanceClass();
        p1.fun1();
        p1.fun2();//5
        PrivateInstanceClass p2 = new PrivateInstanceClass();
        p2.fun2();//0
    }
}
class PrivateInstanceClass{
    private int x;
    void fun1(){
        x = 5;
    }
    void fun2(){
        System.out.println(x);
    }
}