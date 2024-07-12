class thread1 extends Thread{
    public void run(){
        System.out.println(currentThread());
        // for (int i =0; i<=5; i++){
        //     System.out.println("thread1");
        //     try {
        //         Thread.sleep(10);
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        // }
    }}

class thread2 extends Thread{
    @SuppressWarnings("deprecation")
    public void run(){
        System.out.println(currentThread());
        System.out.println(currentThread().getName());
        System.out.println(currentThread().getPriority());
        System.out.println(currentThread().getId());
        System.out.println(currentThread().getClass());
        System.out.println(currentThread().getState());
        // for (int i =0; i<=5; i++){
        //     System.out.println("thread2");
        //     try {
        //         Thread.sleep(10);
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }
        // }      
    }
    }
    class thread3 extends Thread{
        public void run(){
            System.out.println(currentThread());}}
public class threa {

    public static void main(String[] args) {

        thread1 obj = new thread1();
        // obj.start();
        obj.setPriority(Thread.MIN_PRIORITY+2);

        thread2 obj1 = new thread2();
        obj1.start();
        thread3 obj2 = new thread3();
        // obj2.start();
    }

}
