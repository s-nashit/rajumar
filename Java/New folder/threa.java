class A implements Runnable{
    public void run(){
        // System.out.println(currentThread().getThreadGroup());

        for(int i = 0; i<=100; i++){
        System.out.println("AAAA - CLass");
            // System.out.println(i);
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class B implements Runnable{
    public void run(){

        for(int i = 0; i<=100; i++){
            System.out.println("BBBBB - CLass");
            // System.out.println(i);
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
            }
            }

    }
}


public class threa {

    public static void main(String[] args) {

        Runnable obj = new A();
        Runnable obj1 = new B();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();


        // obj.setPriority(3);
        
        // System.out.println(obj.getPriority() + " " + obj1.getPriority());
        // obj1.setPriority()
        // obj.start();
        // try {
        //     Thread.sleep(1);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // obj1.start();
        // try {
        //     Thread.sleep(50);
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
    }

}
