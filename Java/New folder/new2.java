@FunctionalInterface
interface A{
    int add(int a, int b);   
}

public class new2 {

    public static void main(String[] args) {
        A obj =(a, b) -> a+b;
        A obj1 = (a, b) -> a-b;
    //     A obj = new A()
    //     {
    //         public int add(int a, int b){
    //             return a+b;
               
    //         }

    //     };
        int res = obj.add(10,20);
        int res1 = obj1.add(30,13);
        System.out.println(res);
        System.out.println(res1);
    }
        }
    


