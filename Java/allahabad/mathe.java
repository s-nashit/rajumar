class Add{
    int calc(int a, int b){
        return a+b;
    }

    
}
class Sub extends Add{
    int calc(int a, int b){
        return a-b;
    }
}


public class mathe {

    public static void main(String[] args) {

        Sub obj = new Sub();
        Add obj1 = new Sub();
        Add obj2 = new Add();
        System.out.println(obj.calc(10, 5));
        System.out.println(obj1.calc(10, 5));
        System.out.println(obj2.calc(10, 5));
    }

}
