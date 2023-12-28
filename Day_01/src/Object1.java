public class Object1 {
    public static void main(String[] args){
        Obj2 obj2 = new Obj2();
        obj2.fun1();
        obj2.fun2();
        System.out.println(obj2.x);

        Obj2 obj3  = new Obj2();
        obj3.fun1();
        obj3.fun2();
        obj3.x = 55;
        System.out.println(obj3.x);
    }
}

class Obj2{
    int x;
    int y;

    void fun1(){
        System.out.println("This is fun1 and it is non-static");
    }
    void fun2(){
        System.out.println("This is fun2 and it is instance member function");
    }
}