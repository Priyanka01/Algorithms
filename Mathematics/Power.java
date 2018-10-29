class Power{
    public static void main(String args[]){
        System.out.println(findPower(10));
    }

    public static boolean findPower(int n){
        // if(num == 0)
        //     return false;

        // while(num != 1){
        //     if(num % 2 != 0){
        //         return false;
        //     }
        //     num = num / 2;
        // }
        // return true;

        if(n < 1)
            return false;

        while( n % 2 == 0)
        {
            n = n / 2;

        }
        return n == 1;
    }
}