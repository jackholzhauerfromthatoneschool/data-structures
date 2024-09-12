import java.util.*;
/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Map<String,String> z= new HashMap<>();
        

        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                System.out.println("What is the students name?");
                String name=in.next();
                System.out.println("What is the students grade?");
                String grade=in.next();
                z.put(name, grade);
            } else if (input.equals("R"))
            {
                System.out.println("What is the students name?");
                String name=in.next();
                z.remove(name);
            } else if (input.equals("M"))
            {
                System.out.println("What is the students name?");
                String name=in.next();
                System.out.println("What is the students new grade?");
                String new_grade=in.next();
                z.put(name, new_grade);
            } else if (input.equalsIgnoreCase("P"))
            {
                Set<String> keys = z.keySet();
                for(String key:keys){
                    System.out.println(key+" "+z.get(key));
                }
                System.out.println();
            } else
            {
                done = true;
            }
        }
    }
}
