class Students{

    static String name;
    String a;

    



    public static void show(Students Students){
        System.out.println(Students.name);
        // System.out.println("this is static method");
    }
}

public class methH {

    public static void main(String[] args) {

        // Students a = new Students();

        Students adit= new Students();
        adit.name="Nashit";
        
        Students cits= new Students();
        cits.name="Vivek";

        Students cts = new Students();
        cts.name="Mukesh";
        adit.show(adit);
        cits.show(cits);
        cts.show(cts);

    }

}
