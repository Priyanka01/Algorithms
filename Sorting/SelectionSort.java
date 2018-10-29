class SelectionSort{
    public static void main(String args[]){
        int arr[] = {64,25,12,22,11};

        for(int i = 0; i < arr.length-1; i++){
            int min_idx = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }  
                
            }
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;  
        }
        // int n = arr.length; 
  
        // // One by one move boundary of unsorted subarray 
        // for (int i = 0; i < n-1; i++) 
        // { 
        //     // Find the minimum element in unsorted array 
        //     int min_idx = i; 
        //     for (int j = i+1; j < n; j++) 
        //         if (arr[j] < arr[min_idx]) 
        //             min_idx = j; 
  
        //     // Swap the found minimum element with the first 
        //     // element 
        //     int temp = arr[min_idx]; 
        //     arr[min_idx] = arr[i]; 
        //     arr[i] = temp; 
        // } 
        for(int i:arr)
            System.out.println(i);
    }
}

