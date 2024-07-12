
import java.io.*;

public class bufferIn {

    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your age: ");

        // String age = a.readLine();
        int age1 = Integer.parseInt(a.readLine());
        System.out.println(2*age1);
    
        // java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    }

}
