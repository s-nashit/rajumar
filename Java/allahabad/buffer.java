
import java.nio.IntBuffer;

public class buffer {

    public static void main(String[] args) {
        IntBuffer obj = IntBuffer.allocate(4);
        obj.put(10);
        obj.put(12);
        obj.put(9);
        obj.put(18);
        String name = "shrey";

        StringBuffer sb = new StringBuffer();
        sb.append("shrey");
        System.out.println(sb);

        int[] arr = obj.array();

        int [] arr1 = {10, 12, 9, 18};
        // for (int a =0; a<arr1.length; a++){
        //     System.out.println(arr1[a]);
        // }

        // System.out.println(obj);

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
    }

}
