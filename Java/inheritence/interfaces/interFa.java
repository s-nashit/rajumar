abstract class Car{
    abstract void start();
    
    
    public void ac(){
        System.out.println("ac is on");
    }
    abstract void stop();
    
}
class maruti800 extends Car{

    public void start(){
        System.out.println("car is started");}

    public void stop(){
        System.out.println("car is stopped");}
}

public class interFa {

    public static void main(String[] args) {

        Car c = new maruti800();
        c.start();
        c.ac();
        c.stop();

    }

}
