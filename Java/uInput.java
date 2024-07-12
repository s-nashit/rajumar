import java.util.Scanner;
public class uInput {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        System.out.println("Enter number:");

        int num = a.nextInt();

        System.out.println("Table of "+num);

        for(int i = 1; i<=10; i++){
            System.out.println(num*i);
        }

        // BigInteger phone = a.nextBigInteger();
        // System.out.println("your height is: "+phone);
        // float phone = a.nextFloat();
        // System.out.println("your height is: "+phone);
        // int phone = a.nextInt();
        // System.out.println("your phone number is: "+phone);

        // byte age = a.nextByte();
        // System.out.println("your age is: "+age);
        // System.out.println("Do you have a laptop");
        // boolean laptop = a.nextBoolean();

        // if (laptop){
        //     System.out.println("You have a laptop");
        // }
        // else{
        //     System.out.println("You don't have a laptop");
        // }

        // System.out.println("enter your name: ");
        // String name = a.nextLine();
        // System.out.println("your name is: "+name);
        // System.out.println("enter password: ");
        // String pass = a.nextLine();
        // System.out.println("your password is: "+pass);

        // if(name.equals("nashit") && pass.equals("12345")){
        //     System.out.println("Authorised user");
        // }
        // else{
        //     System.out.println("Logging out...");
        // }

        // if(name.equals("admin") || name.equals("")){
        //     if(pass.equals("admin")){
        //         System.out.println("Authorised user");
        //     }
        // }
        // else{
        //     System.out.println("Logging out...");
        // }


        // if(name == "" && ){
        //     System.out.println("Authorised user");
        // }
        // else{
        //     System.out.println("Logging out...");
        // }


        // int age= a.nextInt();

        // if (age>=18){
        //     System.out.println("you can vote");
        // }
        // else{
        //     System.out.println("you cannot vote");}

    }

}
