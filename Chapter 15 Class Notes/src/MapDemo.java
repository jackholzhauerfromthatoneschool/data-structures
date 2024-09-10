import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        //map interface boring () gives key and type
        Map<String, Color> autsinpoinrs = new HashMap<>();
        autsinpoinrs.put("autsin",Color.RED);
        autsinpoinrs.put("autsin1",Color.BLUE);
        autsinpoinrs.put("autsin3",Color.GREEN);
        //can have two different elements with the smae value
        //no multiple key 🤔
        autsinpoinrs.put("autsin",Color.BLACK);
        //make a set of keys within the map🤔🤔c
        Set<String> keys = autsinpoinrs.keySet();
        for(String key:keys){
        System.out.println("key"+keys);
        }

    }
}
