public class StaticMemberByObj {
    public static void main(String[] args) {
        //Access by class:
        System.out.println(Example.x);
        System.out.println(Example.b);
        Example.x = 43;
        System.out.println(Example.x);
        Example.showData();
        //Access by Obj :
        Example e1 = new Example();
//We can call the static member variable using object but not recommended...
        e1.x = 122;
        System.out.println(e1.x);
//We can't call the static function using the object...
        //e.showData();
        System.out.println(Example.x);
    }
}
class Example{
    static int a;
    public static  int b = 5;
    static int x;
    public static void showData() {
        System.out.println(b +" "+x);
    }
}