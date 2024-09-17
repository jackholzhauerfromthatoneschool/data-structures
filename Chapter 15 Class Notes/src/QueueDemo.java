import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        //priner q of string (Linked List)
        Queue<String> autin_priner= new LinkedList<>();
        autin_priner.add("goobert1");
        autin_priner.add("once more the world");
        System.out.println("Printing:"+autin_priner.remove());

        autin_priner.add("jojo");
        autin_priner.add("fuga");
        autin_priner.add("goobert2");
        System.out.println("Printimg b n"+autin_priner.remove());

        autin_priner.add("boss autin ded???");
        while(autin_priner.size()>0)
        {
            System.out.println("Printimg b n"+autin_priner.remove());
        }
    }
}
