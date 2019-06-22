package shell.sort;

/**
 *
 * @author lycan
 */
public class ShellSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Shell Sort 1st try
        int[] arrayShellSort = new int[1000];
        int i, x, temp;
        for(i = 0;i < arrayShellSort.length;++i){
            arrayShellSort[i] = arrayShellSort.length - i;
        }
        sort(arrayShellSort);
//        for(i = arrayShellSort.length / 2 ;i > 0; i /= 2){
//            for(x = 0;x < arrayShellSort.length / 2;++x){
//                if(arrayShellSort[x] > arrayShellSort[x + i]){
//                    temp = arrayShellSort[x];
//                    arrayShellSort[x] = arrayShellSort[x + i];
//                    arrayShellSort[x + i] = temp;
//                }
//            }
//        }
        for(i = 0;i < arrayShellSort.length;++i){
            System.out.println(arrayShellSort[i]);
        }
    }
    
        /* function to sort arr using shellSort */
    static void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // Start with a big gap, then reduce the gap 
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
            // Do a gapped insertion sort for this gap size. 
            // The first gap elements a[0..gap-1] are already 
            // in gapped order keep adding one more element 
            // until the entire array is gap sorted 
            for (int i = gap; i < n; ++i) 
            { 
                // add a[i] to the elements that have been gap 
                // sorted save a[i] in temp and make a hole at 
                // position i 
                int temp = arr[i]; 
  
                // shift earlier gap-sorted elements up until 
                // the correct location for a[i] is found 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
  
                // put temp (the original a[i]) in its correct 
                // location 
                arr[j] = temp; 
            } 
        }
    } 
}