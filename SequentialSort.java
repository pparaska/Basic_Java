class SequentialSort 
{ 
    void sort(int array[]) 
    { 
        int n = array.length; 
        for (int i=1; i<n; i++) 
        { 
            int key = array[i]; 
            int j = i-1; 
            while (j>=0 && array[j] > key) 
            { 
                array[j+1] = array[j]; 
                j = j-1; 
            } 
            array[j+1] = key; 
        } 
    } 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " ");
        System.out.println(); 
    } 
    public static void main(String args[]) 
    {         
        int array[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47}; 
  
        SequentialSort ob = new SequentialSort();         
        ob.sort(array); 
          
        printArray(array); 
    } 
} 
