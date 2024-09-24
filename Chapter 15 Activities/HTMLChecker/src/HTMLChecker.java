import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "data-structures\\Chapter 15 Activities\\HTMLChecker\\src\\TagSample1.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            boolean works=true;
            // Your code goes here
            Stack<String>a=new Stack<String>();
            while (in.hasNext())
            {
                String temp=in.next();
                temp=temp.substring(1);
                temp=temp.substring(0,temp.length()-1);
                if (temp.contains("/")){
                    if (!(temp.substring(1).equals(a.pop())))
                    {
                        works=false;
                    }
                }
                else{
                    a.push(temp);
                }
            }
            if(!works||a.size()!=0)
            {
                System.out.println("It doesnt work");
            }
            else System.out.println("works");


        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}
