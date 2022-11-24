import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args){
        int[] source = {1,2,3,4};
        int [] destination = new int[4];

        for(int i=0; i<source.length;i++)
            destination[i] = source[i];
        System.out.println(source[0]);
        System.out.println(Arrays.toString(destination));


    }
}
