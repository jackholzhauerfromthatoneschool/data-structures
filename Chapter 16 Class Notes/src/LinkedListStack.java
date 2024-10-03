import java.util.NoSuchElementException;

/**
 * An implementation of a stack as a sequence of nodes.
*/
public class LinkedListStack
{
    private Node last;

    /**
     * Constructs an empty stack.
    */
    public LinkedListStack()
    {
        last = null;
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to add
    */

    public void push(Object element)
    {//always push thing to the front (autin)
        Node newNode=new Node();
        newNode.data=element;
        newNode.next=this.last;
        this.last=newNode;
    }
    public boolean empy_questionmark(){
        return this.last==null;
    }



    /**
        Removes the element from the top of the stack.
        @return the removed element
    */
 public Object remove_something_from_a_stack()
 {
    if (empy_questionmark())
    {
    Object shmelement = this.last.data;
    this.last=this.last.next;
    return shmelement;
    }
    else return null;
 }







    /**
     * Checks whether this stack is empty.
     *
     * @return true if the stack is empty
    */


    static class Node
    {
        public Object data;
        public Node next;
    }
}
