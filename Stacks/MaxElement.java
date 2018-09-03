import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        
        Stack stk = new Stack();
        Stack maxStk = new Stack();
        int currMax = 0;
        for(int i = 0; i < lines; i++){
            
            if( sc.nextInt() == 1){
                int element = sc.nextInt();
                stk.push(element);
                    
                if(maxStk.isEmpty()){
                    maxStk.push(element);
                }
                else{
                    if((int)maxStk.peek() <= element){
                        maxStk.push(element);
                    }
                }
            }
            
            if(sc.nextInt() == 2 && !stk.isEmpty()){
                int element = (int)stk.pop();
                if(!maxStk.isEmpty() && (int)maxStk.peek() == element){
                    maxStk.pop();
                }
            }
            
            if(!maxStk.isEmpty() && sc.nextInt() == 3){
                System.out.println(maxStk.peek());
            }
            
        }  
 
    }

}