interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("interfaces");
//     }
// }

public class new1 {
    public static void main(String[] args) {
        //   B obj = new B();
        //   obj.show();
        A obj = new A(){
            public void show(){
                System.out.println("interfaces");
            }        };
        obj.show();


        int a = 10;
        String b = "10";
        System.out.println(a*2 + " " + b+2);
        


    }

}
