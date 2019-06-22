package shell.sort;

/**
 *
 * @author lycan
 */
public class ShellSortFirstTry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayShell = new int[1000];
        int i, a, b, temp;
        int counter1 = 0, counter2 = 0, counter3 = 0;
        for(i = 0;i < arrayShell.length;++i){
            arrayShell[i] = arrayShell.length - i;
        }
        for(i = 0;i < arrayShell.length;++i)
            System.out.println(arrayShell[i]);
        System.out.println("Now we start");
        for(a = arrayShell.length / 2;a > 1;a /= 2){
            ++counter1;
            for(i = a;i < (arrayShell.length - a);i += a){
                temp = arrayShell[a];
                b = a - 1;
                while(b >= 0 && temp < arrayShell[b]){
                    ++counter3;
                    arrayShell[b+1] = arrayShell[b];
                    --b;
                }
                arrayShell[b+1] = temp;
            }
        }
        System.out.println("Counter 1: "+counter1);
        System.out.println("Counter 3: "+counter3);
        for(i = 0;i < arrayShell.length;++i)
            System.out.println(arrayShell[i]);
        System.out.println("the above is the counter after loop 2");
        a = 1;
        while(a < arrayShell.length){
            temp = arrayShell[a];
            b = a -1;
            while(b >= 0 && temp < arrayShell[b]){
                    ++counter2;
                    arrayShell[b + 1] = arrayShell[b];
                    --b;
            }
                arrayShell[b+1] = temp;
                ++a;
        }  
        for(i = 0;i < arrayShell.length;++i)
            System.out.println(arrayShell[i]);
        System.out.println("Counter 2: "+counter2);
    }
    //FAILED TRY, Apparently the guy who explained how shell sort worked
    //to us didn't have a clue so we implemented it differently.
}


