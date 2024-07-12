class Patna{
    private String name;
    private int age;
    private String city;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }

    
    

//     public String getName(){
//         return name;
//     }
//     public void setAge(int a){
//         age = a;

// }
}



public class getH {

    public static void main(String[] args) {

        Patna p1 = new Patna();
        // System.out.println(p1.name);
        System.out.println(p1.getName()+".."+p1.getAge());
        
        // p1.setName("Nashit");

    }



}
