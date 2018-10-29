class QuickSort{

    public static void main(String args[]){
         int arr[] = {64,25,12,22,11};
        
         quicksort(arr,0,arr.length-1);
         for(int i : arr){
             System.out.println(i);
         }

    }

    public static void quicksort(int arr[],int low,int high){
        if(low < high){
            int pi = partition(arr,low,high);

            quicksort(arr,low,pi - 1);
            quicksort(arr,pi + 1,high);
        }
    }

    public static int partition(int arr[],int low,int high){

        //Set pivot element as rightmost element
        int pivot = arr[high];

        // i is incremented after larger elements if found
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        /* At last put pivot in correct position i.e on left smaller elements and on right larger elements */
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;   //new pivot index

    }
}