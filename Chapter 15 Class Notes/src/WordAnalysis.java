import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        //read dictionary and novel file
        Set<String> dictionaryWords = readWords("data-structures\\Chapter 15 Class Notes\\src\\words");
        Set<String> dictionaryWordy = readWords("data-structures\\Chapter 15 Class Notes\\src\\war-and-peace.txt");
        for(String word : dictionaryWordy){
            System.out.println(word);
            Iterator<String> iterator = dictionaryWordy.iterator();
            while(iterator.hasNext()){
                if (!(iterator.next().equals("it")))
                System.out.println("weak");
            }
        }
    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename)
        throws FileNotFoundException
    {
        //hash instead of tree
        Set<String> words=new HashSet<>();
        //determine the current working directory
        //System.out.println(System.getProperty("user.dir"));
        Scanner in = new Scanner(new File(filename),"UTF-8");
        in.useDelimiter("[^a-zA-Z]+");
        //use any char not letter as delimeter
        //forefathers one and all bear witness
        while(in.hasNext()){
            //add words to set
           words.add(in.next().toLowerCase());
        }
        return words;
    }
}
