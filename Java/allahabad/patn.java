
@FunctionalInterface
interface A{
    int mathy(int a, int b, int c);
}


public class patn {

    public static void main(String[] args) {
        A obj = (a, b, c) -> a+b+c;
        A obj1 = new A(){
            public int mathy(int a, int b, int c){
                return a+b+c;

            }
        };


        int res = obj.mathy(11, 29, 13);
        System.out.println(res);
    }

}
