import java.util.*;
public class pair {



public int[][] run(int s,Stack<Stack<Integer>> a, int[][] p ){
    boolean whee=true;
    while(a.size()>0)
    {
        Stack<Integer> z = a.pop();
        int row=z.pop();
        int col=z.pop();       
        p[row][col]=s;
        if(row!=9)
        if(p[row+1][col]==0)
        {
            z.push(row+1);
            z.push(col);
            a.push(z);
            whee=false;
        }
        if(row!=0)
        if(p[row-1][col]==0)
        {
            z.push(row-1);
            z.push(col);
            a.push(z);
            whee=false;
        }
        if(col!=9)
        if(p[row][col+1]==0)
        {
            z.push(row);
            z.push(col+1);
            a.push(z);
            whee=false;
        }
        if(col!=0)
        if(p[row][col-1]==0)
        {
            z.push(row);
            z.push(col-1);
            a.push(z);
            whee=false;
        }
        
    }
    if (s>=99||whee)
    return p;
    else{
        return run(s+1,a,p);
    }
}
}