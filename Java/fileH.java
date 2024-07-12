import java.io.File;

public class fileH {

    public static void main(String[] args) {
        File a = new File("abc.txt");

        if(a.exists()){
            a.delete();
            System.out.println("file deleted successfully");
        }
        else{
            System.out.println("file not found");
        }

        // try {
        //     File a = new File("abc.txt");
        //     Scanner b = new Scanner(a);
        //     String data = b.nextLine();
        //     System.out.println(data);
        //     // while(b.hasNextLine()){ 
        //     //     String data = b.nextLine();
        //     //     System.out.println(data);
        //     // }

            
        // } catch (Exception e) {
        // }

        // try{
        // FileWriter a = new FileWriter("abc.txt");
        // a.write("writeen using Java");
        // a.close();
        // System.out.println("file written successfully");
        // }
        // catch(Exception e){
        //     System.out.println("file can not be written");
        // }
        


        // File a = new File("abc.txt");

        // if(a.exists()){
        //     // System.out.println("file found");
        //     System.out.println("file name is: "+a.getName());
        //     System.out.println("Path is: "+a.getAbsolutePath());
        //     System.out.println("Parent is: "+a.getParent());
        //     System.out.println("File size is : "+a.length()+" bytes");
        //     System.out.println("file IS readble : "+a.canRead());
        //     System.out.println("file is writeable: "+a.canWrite());
            

        // }
        // else{
        //     System.out.println("file not found");
        // }
    //     File a = new File("C:\\Users\\s_nas\\OneDrive\\Desktop\\abc.txt");
    //     try{
    //         if(a.createNewFile())
    //         {
    //         System.out.println("created successfully");
    //     }
    //     else{
    //         System.out.println("file already exists");
    //     }
    // }
    //     catch(Exception e){
    //         System.out.println("file not created");
    //     }
       
    }

}
