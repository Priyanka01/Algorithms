class Reverse{

    public static void main(String args[]){
        StringBuilder str = " I like to eat apples and bananas";
        int start = 0; 
        while(end < str.length){
            if(str.charAt(end) == ' '){
                reverseString(str,start,end-1);
                end++;
                start = end;
            }
            
        }
        System.out.println(str);
    }

    public static void reverseString(StringBuilder str, int start, int end){
        while(start < end){
            char temp = str.charAt(start);
            str.insert(start,str.charAt(end));
            str.insert(end,temp);
            start++;
            end--;
        }
        
    }

}