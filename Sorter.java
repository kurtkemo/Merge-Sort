
/**
 * Write a description of class Sorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sorter extends Thread
{
    private int[]arr;
    
    public void run()
    {
        sort(arr);
    }
    public Sorter(int[] a){
        arr = a;
    }

    private void sort(int[] a){
        for(int i = 0; i < a.length; i++){
            int pos = i;
            int min = a[i];
            for (int j = i + 1; j < a.length; j++)
                if(a[j] < min){
                    min = a[j];
                    pos = j;
                }
            a[pos] = a[i];
            a[i] = min;
        }
    }

}
