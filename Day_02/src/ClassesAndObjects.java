public class ClassesAndObjects {
    public static void main(String[] args) {
        Nokia n1 = new Nokia();
        n1.display();//0 0
        n1.setValue();
        n1.display();// 2 40
    }
}

class Nokia{
    private int mic;
    private int cam;

    void setValue(){
        mic = 2;
        cam = 40;
    }
    void display(){
        System.out.println(mic);
        System.out.println(cam);
    }
}