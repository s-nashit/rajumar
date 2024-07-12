public class eHand {

    public static void main(String[] args) {
        int a = 76;
        int b = 0;
        int d[] = {2,3,4};
        String c = null;

        try{
            // String c = 12;
            System.out.println(c.length());
            System.out.println(d[5]);
            System.out.println("this is try block1");
            System.out.println("this is try block2");
            // int c = a/b;
        System.out.println("this is finaltry block");}


        catch(ArithmeticException i){
            System.out.println("division by 0 error");
        }
        catch(ArrayIndexOutOfBoundsException j){
            System.out.println("array error");
        }
        catch(Exception k){
            System.out.println("this is a new error!");
        }

        // catch(Exception x){
        //     System.out.println("division by 0 error");

        // // System.out.println(c);

        // }
        // System.out.println("hello");
        // System.out.println("this part is working fine");

    }




    //     int d = a+b;
    //     System.out.println(d + "hello");

    //     try{
    //     int c = a/b;
    //     System.out.println(c);
    // }
    // catch (Exception x){
    //     System.out.println("Hello");}
    
    //     System.out.println("hello");
    // }

}
