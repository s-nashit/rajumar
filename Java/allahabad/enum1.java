// class nashit{
//     int age = 21;
//     int roll = 10;
//     String name = "nashit";
//     public void display(){
//         System.out.println(name + " " + age);
//     }
// }

enum patna{
    mukesh, damodar, shrey, smriti, tannu, rahul;

    private patna(){
        
    }
    public void stude(){
        System.out.println("student called");
    }
}



public class enum1 {

    public static void main(String[] args) {
        patna[] obj = patna.values();
        // obj.stude();
        // System.out.println(obj[1].ordinal());
        // patna[] obj = patna.values();

        // System.out.println(obj[1]);

        // for (int i = 0; i<=obj.length-1; i++){
        //     System.out.println(obj[i]);
        // }

        for(patna a: patna.values()){
            System.out.println(a.ordinal() +" "+ a.name());
        }

    }

}
