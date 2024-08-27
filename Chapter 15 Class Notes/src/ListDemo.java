import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        /* the addlast method can be used to populate a list */
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("DIO");
        staff.addLast("Austin but worse some how");
        staff.addLast("Jesus");
        staff.addLast("Austin Ziliak");
        //list is DIO worse austin jesus and slightly better austin
        //System.out.println(staff);
    /*
     * list iterator makes a iterator
     * positioned at the head
     * | used to represent the iterator pos
     */
       ListIterator<String> iterator = staff.listIterator();
       /*
        * the next method advances the iterator over the next element in the list
        */
        String goober=iterator.next(); //D| mA j a
        System.out.println(goober);
        /*
         * the add method also returns the next element at the iterator position
         * he iterator is then positioned after the element
         */
        iterator.add("goobert the skeleton");
        iterator.add("freaky goobert the skeleton");//D gTS fGTS| mA j a
        /* the remove method removes the element returned by the last call to next or previous 
         * the remove mathod can only be called after calling next or previous NOT after add
        */
        iterator.next();
        iterator.remove(); //slightly worse austin is dead and i have killed him //D gTS fGTS |j a
        System.out.println(staff);
        /*
        the set method updates the element returned by the last call  to next or previous
        */
        iterator.previous();
        iterator.set("jesus 2");
        System.out.println(staff);
        /* has next used to determine if at end of list 
         * used in while loops alot
         */
        iterator = staff.listIterator();
        while (iterator.hasNext()){
            String n = iterator.next();
            if (n.equals("Austin"))
            {
                iterator.remove();//the list has been purged of austins the world is healing
            }
        }
    /* enhanced for loops work with linked lists */
    for (String n : staff){
        System.out.println(n+"");
    }
    System.out.println("gamablin");
    while (iterator.hasNext())
    {
        String n = iterator.next();
        //if (n.equals("DIO"))
        //staff.remove("DIO");
    }   
    //the goat enhanced for loop auto makes a iterator
for (String n : staff){
    if(n.equals("jesus 2"))
    staff.add("bruce");
}
}






























































}/* cant modify a linked list while using an iterator via means that arent the iterator */



