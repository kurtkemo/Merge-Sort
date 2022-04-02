
/**
 * Write a description of class Merger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Merger extends Thread
{
    private int[]x;
    private int[]y;
    private int[]z;
    public void run()
    {
        merge(x,y,z);
    }

    public Merger(int[]a, int[] b, int[] c){
        x = a;
        y = b;
        z = c;
    }

    private void merge(int[] a, int[] b, int[] c){
        int index = 0, i = 0, j = 0;
        while(i < a.length && j < b.length)
            if(a[i] < b[j])
                c[index++] = a[i++];
            else
                c[index++] = b[j++];
        if(i < a.length)
            for(int k = i; i < a.length; i++)
                c[index++] = a[i];
        if(j < b.length)
            for(int k = j; j < b.length; j++)
                c[index++] = b[j];
    }

}
