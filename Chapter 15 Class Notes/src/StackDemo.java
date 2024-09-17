import java.util.Stack;

/**
 * This program simulates an undo stack. Note that operations
 * must be undone in the opposite order in which they are first
 * issued.
*/
public class StackDemo
{
    public static void main(String[] args)
    {
        Stack<String>zizizliazikak = new Stack<>();

        //lots of things on top
        zizizliazikak.push("Insert: 'Austin'");
        zizizliazikak.push("Insert: ','");
        zizizliazikak.push("Insert: ' '");
        zizizliazikak.push("Insert: 'za warudo'");
        zizizliazikak.push("Insert: '?'");
        zizizliazikak.push("Delete:'?'");
        zizizliazikak.push("Insert:'speedwagon'");
        //pront
        System.out.println(zizizliazikak);
        //ctrl z ctrl z ctrl z ctrl z
        for(int i=0;i<4;i++)
        {
            System.out.println("Undo"+zizizliazikak.pop());
        }
    }
}
