import java.util.*;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<Stack<Integer>> begin;

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        begin=new Stack<Stack<Integer>>();
        Stack<Integer> z = new Stack<Integer>();
        z.push(row);
        z.push(column);
        begin.push(z);
        pair j = new pair();
        pixels=j.run(1,begin,pixels);
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
