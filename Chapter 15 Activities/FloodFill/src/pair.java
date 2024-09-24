import java.util.*;
public class pair {



public int[][] run(int s,Stack<Stack<Integer>> a, int[][] p ){
    boolean whee=true;
    int ba=a.size();
    Stack<Stack<Integer>> g=new Stack<Stack<Integer>>();
    while(ba>0)
    {
        Stack<Integer> za = a.pop();
        int col=za.pop();
        int row=za.pop();
        if (p[row][col]==0){       
        p[row][col]=s;
        s+=1;
        }
        if(row!=9)
        if(p[row+1][col]==0)
        {
            Stack<Integer> z=new Stack<Integer>();
            z.push(row+1);
            z.push(col);
            g.push(z);
            whee=false;
        }
        if(row!=0)
        if(p[row-1][col]==0)
        {
            Stack<Integer> z=new Stack<Integer>();
            z.push(row-1);
            z.push(col);
            g.push(z);
            whee=false;
        }
        if(col!=9)
        if(p[row][col+1]==0)
        {
            Stack<Integer> z=new Stack<Integer>();
            z.push(row);
            z.push(col+1);
            g.push(z);
            whee=false;
        }
        if(col!=0)
        if(p[row][col-1]==0)
        {
            Stack<Integer> z=new Stack<Integer>();
            z.push(row);
            z.push(col-1);
            g.push(z);
            whee=false;
        }
        //System.out.println(a);
        ba-=1;
        
    }
    if (s>=99||whee)
    return p;
    else{
        return run(s,g,p);
    }
}
}