import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
     Queue<WorkOrder> weeee = new PriorityQueue<>();

     weeee.add(new WorkOrder(99999, "call austin"));
     weeee.add(new WorkOrder(99998, "die peacefully"));
     weeee.add(new WorkOrder(-1, "all in on red"));
     weeee.add(new WorkOrder(0, "fortnut"));
     weeee.add(new WorkOrder(0,"software dev"));

     System.out.println(weeee);
     //no in order Dios meurtos
     while (weeee.size()>0)
      {
        System.out.println(weeee.remove());
     }
    }
}
