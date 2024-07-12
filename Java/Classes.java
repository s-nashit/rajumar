class Students{
    static String name;
    int id;
    String email;
    // System.out.println(Students.name);
    public void display_name(){
        System.out.println(name+" "+id+" "+email);
    }
}

public class Classes {
    public static void main(String[] args) {
        // Students.name = "Nashit";
        // Students.id=23;
        Students a1 = new Students();
        Students a2 = new Students();
        Students a3 = new Students();
        Students a4 = new Students();
        Students a5 = new Students();        

        // a1.name= "Nashit";
        a1.id= 1;
        // a1.email= "Nashit@123";

        // a2.name= "Shrey";
        a2.id= 2;
        a2.email= "Shrey@123";

        // a3.name= "Mukesh";
        a3.id= 3;
        a3.email= "Mukesh@123";

        a4.name= "Rakesh";
        a4.id= 4;
        a4.email= "Rakesh@123";

        a5.name= "Vishal";
        a5.id= 5;
        a5.email= "Vishal@123";

        a1.name= "Peter";

        

        a1.display_name();
        a2.display_name();
        a3.display_name();
        a4.display_name();
        a5.display_name();
       
        

    }

}
