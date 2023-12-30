public class WrapperClass {

    public static void main(String[] args) {
        // Integer num = new Integer(55); // Deprecated... Instead, use autoboxing.
        Integer num = 55;

        int numS = Integer.parseInt("45");
        System.out.println(num + numS); // Prints the sum of num and numS.

        Integer numX = Integer.valueOf("123");
        System.out.println(numX.getClass()); // Prints the class of numX (java.lang.Integer).

        int x = numX.intValue(); // Unwrapping: Converts Integer to int.

        System.out.println("The data type of x: " + Integer.valueOf(x).getClass().getSimpleName());//Integer...

        //Value of e base o pathano jai...Etai dara convert o kora jia number system...
        Integer bin = Integer.valueOf("1000111",2);
        //System.out.println(bin); works
        int binI = bin.intValue();
        System.out.println(binI);
    }
}
