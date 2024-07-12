// abstract class
abstract class adit{
        // public abstract void students();
        public void teachers(){
            System.out.println("they are teachers");
        };
    }

// concrete class

class patna extends adit{
    // public void students(){}
}
public class interf {
    public static void main(String[] args) {
        adit a = new patna();

    }

}
