
class Patna{
    static int a;
    static int b;

    public static void add(){
        int c = a+b;
        System.out.println("a+b = "+c);
    }

}

public class meth {

    public static void main(String[] args) throws ClassNotFoundException {
        // Class p1;
        // Class p1 = Class.forName("Patna");
        // System.out.println(p1);
        Patna p1 = new Patna();
        p1.a = 10;
        p1.b = 20;
        
        Patna p2 = new Patna();
        p2.a = 30;
        p2.b = 40;
        p1.add();
        p2.add();

    }

}
