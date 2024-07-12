class Student{    
    static String name;
    int age;
    public void show(){
        System.out.println(name + " " + age);
    }
}

public class dirH {
    public static void main(String[] args) {
        String name="Nashit";
        Student s1= new Student();
        s1.name="Nashit";
 
        s1.name="Vivek";
        s1.show();
        Student s2= new Student();
        s2.show();
        Student s3= new Student();
        s3.name="Mukesh";
        

        Student s4= new Student();
        // s2.name="Shrey";
        
        s4.name="peter";
        
        
        // s3.show();
        
        
        
        // s4.show();


    }

}
