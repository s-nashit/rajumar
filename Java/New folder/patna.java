// class A{
//     int a; int ; int c;
// }
enum students{
    Shrey,
    Damodar,
    Ranjit,
    Smriti;  
}

public class patna {

    public static void main(String[] args) {
        // students obj[] = students.values();
        // System.out.println(obj);

        // for(int i = 0;i<obj.length;i++){
        //     System.out.println(obj[i]);
        // }

        for(students s : students.values()){
            // System.out.println(s.ordinal()+1 + " " + s);
            System.out.println(s.name());
            System.out.println(s.toString());
            System.out.println(s.valueOf("Shrey"));
            // System.out.println(s);
        }

    }

}
