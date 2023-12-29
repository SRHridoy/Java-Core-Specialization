public class AccessingPrivateVar {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.setter(54);
        d.getter();
    }
}
 class Demo{
    private static int x;
    static void setter(int x){
        Demo.x = x;
    }
    void getter(){
        System.out.println(x);
    }
}