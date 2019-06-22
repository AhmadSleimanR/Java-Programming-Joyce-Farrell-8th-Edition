package shell.sort;
/**
 *
 * @author lycan
 */
public class ShellSortTakeTwo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayShell = new int[1000];
        int i, j, n, gap, temp;
        n = arrayShell.length;
        for(i = 0;i < n;++i)
            arrayShell[i] = n - i;
        for(gap = n / 2;gap > 0;gap /= 2){
            for(i = gap;i < n;++i){
                temp = arrayShell[i];
                for(j = i;j >= gap && temp < arrayShell[j - gap];j -= gap){
                    arrayShell[j] = arrayShell[j - gap];
                }
                arrayShell[j] = temp;
            }
        }
        for(i = 0;i < n;++i)
            System.out.println(arrayShell[i]);
    }
}
