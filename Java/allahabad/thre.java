class A implements Runnable{
    public void run(){
        for(int i =1; i<=10; i++){
        System.out.println("Thread - 1 - A");
    try {
        Thread.sleep(10);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}}
}
class C extends Thread{}

class B implements Runnable{
    public void run(){
        for(int i =1; i<=10; i++){
        System.out.println("Thread - 2 - B");
    try {
        Thread.sleep(10);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
    }
}


public class thre {

    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();

        t2.start();


    }

}
