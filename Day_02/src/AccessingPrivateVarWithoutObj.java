public class AccessingPrivateVarWithoutObj {
    public static void main(String[] args) {
        Demo1.setter(123);
        Demo1.getter();
    }
}
class Demo1{
    private static int x;
    static void setter(int x){
        Demo1.x = x;
    }
   static void getter(){
        System.out.println(x);
    }
}