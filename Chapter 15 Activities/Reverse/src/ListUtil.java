import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> employeeNames){
        LinkedList<String> silly = new LinkedList<String>();
        LinkedList<String> sillys = new LinkedList<String>();
        sillys = employeeNames;
        employeeNames=silly;
        silly=sillys;
        ListIterator<String> iterator = silly.listIterator(silly.size());
        while(iterator.hasPrevious())
        {       employeeNames.addLast(iterator.previous());
                iterator.remove();
        }
        //System.out.println(strings);
        System.out.println(employeeNames);
        //System.out.println("Expected: [Tom, Romeo, Harry, Dick]");
    }
}