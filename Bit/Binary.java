/* Convert given integer to binary no. */

class Binary{
    public static void main(String args[]){
        int num = 10;
        int binaryArray[] = new int[10000];
        int i = 0;

        while(num > 0){
            binaryArray[i] = num % 2;
            num = num / 2;
            i++;
        }
        for(int j = i; j >= 0; j--){
            System.out.print(binaryArray[j]);
        }
    }
}