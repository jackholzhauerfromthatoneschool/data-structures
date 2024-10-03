import java.util.NoSuchElementException;

/**
    An implementation of a queue as a circular array.
*/
public class CircularArrayQueue
{
    private Object[] elements;
    //private data
    private int tail;
    private int head;
    private int currentSize;


    /**
        Constructs an empty queue.
    */

    public CircularArrayQueue(){final int soze=5;this.elements=new Object[soze];head=0;tail=0;currentSize=0;}




    /**
        Checks whether this queue is empty.
        @return true if this queue is empty
    */
    public boolean empy_questionmark(){
        return empy_questionmark();
    }



    /**
        Adds an element to the tail of this queue.
        @param newElement the element to add
    */





    /**
        Removes an element from the head of this queue.
        @return the removed element
    */





    /**
        Grows the element array if the current size equals the capacity.
    */
    private void growIfNecessary()
    {
        /*
        if(this.currentSize == this.elements.length)
        {
            Object[] newElements = new Object[2 * this.elements.length];
            for(int i = 0; i < this.elements.length; i++)
            {
                newElements[i] = this.elements[(head + i) % this.elements.length];
            }
            this.elements = newElements;
            this.head = 0;
            this.tail = this.currentSize;
        }
        */
    }




}//CircularArrayQueue
