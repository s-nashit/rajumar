// class A{
//     // variables
//     int age = 34;
//     String name = "Dmodar";
//     String location = "Patna";
//     // methods

//     public void display(){
//         System.out.println(name + " " + age + " " + location);
//     }
//     public int add(int a , int b){
//         return a+b;
//     }
// }

// abstract


// abstract class A{
//     abstract void display();
// }

// concrete
// class B implements A{
//     public void display(){
//         System.out.println("Hello");
//     }
// }

@FunctionalInterface
interface A{
    void display();
    // void show();
}
public class pat {

    public static void main(String[] args) {
        // B obj = new B();
        // obj.display();

        A obj = () -> System.out.println("Lambda Function WORKING");
        obj.display();

        // lambda function works only with functional interface

        // A obj1 = new A(){
        //     public void display(){
        //         System.out.println("Hello");
        //     }
        // };
        // obj1.display();
    }

}
