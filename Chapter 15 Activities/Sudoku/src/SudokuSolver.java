import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * TL; DR:
 * 
 * Write a program that solves Sudoku puzzles using sets and operations on sets. The general algorithm should be a traditional 
 * backtracking algorithm. In a backtracking algorithm, a potential solution is explored recursively until it fails. When that
 * happens, the most recent move is undone and an alternative move is explored.
 * 
 */

public class SudokuSolver {
    private final int M = 3;
    private Set<Integer> possibleNums;
    private final int N = M * M;
    private int[][] grid;
    private ArrayList<Set<Integer>> rows;
    private ArrayList<Set<Integer>> cols;
    private ArrayList<Set<Integer>> squares;
    private Set<Integer> nums;

    public SudokuSolver(String fileName) {
        // read the puzzle file
        possibleNums = new HashSet<Integer>();
        possibleNums.add(0);
        try (Scanner in = new Scanner(new File(fileName))) {

            this.grid = new int[N][N];

            for (int row = 0; row < N; row++) {
                String line = in.next();

                for (int col = 0; col < N; col++) {
                    String strVal = line.substring(col, col + 1);
                    int number;
                    if (strVal.equals("x")) {
                        number = 0;
                    } else {
                        number = Integer.parseInt(strVal);
                    }
                    System.out.println(number);
                    this.grid[row][col] = number;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open: " + fileName);
        }

        
        // create the list of sets for each row (this.rows)
        ArrayList<Set<Integer>> rows = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            Set<Integer> set = new HashSet<>();
            
            System.out.println(set);
            for (int j = 0; j < N; j++) {
                if (grid[i][j]!=0)
                set.add(grid[i][j]);
                
            }
            rows.add(set);
        }
        this.rows = rows;


        // create the list of sets for each col (this.cols)
        ArrayList<Set<Integer>> cols = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            Set<Integer> set = new HashSet<>();
            
            Set<Integer> remove = new HashSet<>();
            for (int j = 0; j < N; j++) {
                    set.add(grid[j][i]);
            }

            set.removeAll(remove);
            cols.add(set);
        }
        this.cols = cols;
        System.out.println(this.rows.get(0));

        // create the list of sets for each square (this.squares)
        /* the squares are added to the list row-by-row:
            0 1 2
            3 4 5
            6 7 8
         */
        Set<Integer> sets = new HashSet<>();
        sets.add(0);
        ArrayList<Set<Integer>> sqrs = new ArrayList<>();
        for (int i=2;i<9;i+=3)
        {
            for(int b=2;b<9;b+=3)
            {
                Set<Integer> set = new HashSet<>();
                set.add((grid[i-2][b-2]));
                set.add((grid[i-2][b-1]));
                set.add((grid[i-2][b-0]));
                set.add((grid[i-1][b-2]));
                set.add((grid[i-1][b-1]));
                set.add((grid[i-1][b-0]));
                set.add((grid[i-0][b-2]));
                set.add((grid[i-0][b-1]));
                set.add((grid[i-0][b-0]));
                set.removeAll(sets);
                System.out.println(set);
                sqrs.add(set);
            }
        }
        this.squares = sqrs;
        // create a hash set for [1...9] (this.nums)
        Set<Integer> nums = new HashSet();
        for (int i = 1; i <= 9; i++){
            nums.add(i);
        }
        
        this.nums = nums;
        
        // visually inspect that all the sets are correct
        for (int row = 0; row < N; row++) {
            System.out.println("row " + row + ": " + this.rows.get(row));
        }
        for (int col = 0; col < N; col++) {
            System.out.println("col " + col + ": " + this.cols.get(col));
        }
        //for(int i = 0; i<N;i++){
        //System.out.println("square "+i+": "+this.squares.get(i));}
        for (int square = 0; square < N; square++) {
            System.out.println("square " + square + ": " + this.squares.get(square));
        }
        System.out.println(this.nums);
    }

    public boolean solve() {
        boolean done=true;
        boolean stop=true;
        for (int i=0;i<N&&stop;i++){
            Set<Integer>a=new HashSet<>();
            for(int b=0;b<N&&stop;b++)
            { if (grid[i][b]==0){
                possibleNums=this.nums;
                possibleNums.removeAll(rows.get(i));
                possibleNums.removeAll(cols.get(b));
                if(i<3&&b<3)
                possibleNums.removeAll(squares.get(0));
                else if(i<3&&b<6)
                possibleNums.removeAll(squares.get(1));
                else if(i<3&&b<9)
                possibleNums.removeAll(squares.get(2));
                else if(i<6&&b<3)
                possibleNums.removeAll(squares.get(3));
                else if(i<6&&b<6)
                possibleNums.removeAll(squares.get(4));
                else if(i<6&&b<9)
                possibleNums.removeAll(squares.get(5));
                else if(i<9&&b<3)
                possibleNums.removeAll(squares.get(6));
                else if(i<9&&b<6)
                possibleNums.removeAll(squares.get(7));
                else if(i<9&&b<9)
                possibleNums.removeAll(squares.get(8));
                System.out.println(possibleNums+" "+i+" "+b);
                for (int zi = 1; zi <= 9; zi++){
                    nums.add(zi);
                }
            }
            }
        }
        return true;
    }

            // recursively solve the board
           /* if (this.solve()) {
                // the board is solved!
                return true;
            } else {
                System.out.println("elrip_");
            }

        return false;
    }
*/
    public String toString() {
        String str = "";

        for (int[] row : grid) {
            for (int val : row) {
                str += val + "\t";
            }

            str += "\n";
        }

        return str;
    }

    public static void main(String[] args) {
        
        //the file path is different on my laptop 
        //String fileName = "Chapter 15 Activities\\Sudoku\\src\\puzzle1.txt";
        String fileName = "data-structures\\Chapter 15 Activities\\Sudoku\\src\\puzzle1.txt";

        SudokuSolver solver = new SudokuSolver(fileName);
        System.out.println(solver);
        

        if (solver.solve()) {
            System.out.println("Solved!");
            System.out.println(solver);
        } else {
            System.out.println("Unsolveable...");
        }
    }
}