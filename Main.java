
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Main
{
    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(50) + 1;
        int a[] = new int[size];
        size = rand.nextInt(50) + 1;
        int b[] = new int[size];
        for(int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(999);
        for(int i = 0; i < b.length; i++)
            b[i] = rand.nextInt(999);
        Sorter sorta = new Sorter(a);
        Sorter sortb = new Sorter(b);
        Thread t1 = new Thread(sorta);
        Thread t2 = new Thread(sortb);
        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");


        System.out.println("");
        for(int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        
        int[] c = new int[a.length + b.length];
        Merger merge = new Merger(a, b, c);
        Thread t3 = new Thread(merge);
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e){
        e.printStackTrace();
        }
        System.out.println("");
        for(int i = 0; i < c.length; i++)
        System.out.print(c[i] + " ");
        
    }

}
