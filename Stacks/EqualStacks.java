import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class EqualStacks {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
     
        Stack stk1 = new Stack();
        Stack stk2 = new Stack();
        Stack stk3 = new Stack();
        
        int stk1Height = 0;
        int stk2Height = 0;
        int stk3Height = 0;
        
        for(int i = h1.length-1; i > 0; i--){
            stk1.push(h1[i]);
            stk1Height += h1[i];
        }
        for(int i = h2.length-1; i > 0; i--){
            stk2.push(h2[i]);
            stk2Height += h2[i];
        }
        for(int i = h3.length-1; i > 0; i--){
            stk3.push(h3[i]);
            stk3Height += h3[i];
        }
        
        int minHeight = Math.min(stk1Height,stk2Height);
        minHeight = Math.min(minHeight,stk3Height);
        
        while(stk1Height != stk2Height && stk2Height != stk3Height){
            
            while(stk2Height > minHeight){
                int element = (int)stk2.pop();
                stk2Height -= element;
            }
            if(stk2Height < minHeight){
                minHeight = stk2Height;
            }

            while(stk3Height > minHeight){
                int element = (int)stk3.pop();
                stk3Height -= element;
            }
            if(stk3Height < minHeight){
                minHeight = stk3Height;
            }
            
            while(stk1Height > minHeight){
                int element = (int)stk1.pop();
                stk1Height -= element;
            }
            if(stk1Height < minHeight){
                minHeight = stk1Height;
            }
        }
        
        
        return minHeight;
    }
    
    public static int count(int arr[]){
        int minHeight = 0;
        for(int i = 0; i < arr.length; i++){
            minHeight += arr[i];
        }
        return minHeight;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
