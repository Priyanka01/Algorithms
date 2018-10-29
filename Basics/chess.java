class Chess{

    public static void main(String args[]){
    int row = 8;
    int col = 8;

    for(int i = 0; i < row; i++){
        for(int j = 0; j < col/2; j++){
            if(i % 2 == 0){
                System.out.print("B");
                System.out.print("W");
            }
            if(i % 2 != 0){
                System.out.print("W");
                System.out.print("B");
            }
            
        }
        System.out.println();
    }
}
}