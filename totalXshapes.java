import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class totalXshapes
 {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int t=0;t<test;++t){
            int row = in.nextInt();
            int col = in.nextInt();
            char arr[][] = new char[row][col];
            for(int i=0;i<row;++i){
                String str = in.next();
                for(int j=0;j<col;++j)
                    arr[i][j] = str.charAt(j);
            }
            int rowIndex[] = new int[row*col];
            int colIndex[] = new int[row*col];
            int front =-1;
            int rear =-1;
            int numberOfShapes = 0;
            for(int i=0;i<row;++i){
                for(int j=0;j<col;++j){
                    if(arr[i][j]=='X'){
                        ++numberOfShapes;
                        arr[i][j] = 'O';
                        rowIndex[++rear] = i;
                        colIndex[rear] =  j;
                        while(front!=rear){
                            int r = rowIndex[++front];
                            int c = colIndex[front];
                            if(r>0 && arr[r-1][c]=='X'){
                                arr[r-1][c] = 'O';
                                rowIndex[++rear] = r-1;
                                colIndex[rear] =  c;
                            }
                            if(r<row-1 && arr[r+1][c]=='X'){
                                arr[r+1][c] = 'O';
                                rowIndex[++rear] = r+1;
                                colIndex[rear] =  c;
                            }
                            if(c>0 && arr[r][c-1]=='X'){
                                arr[r][c-1] = 'O';
                                rowIndex[++rear] = r;
                                colIndex[rear] =  c-1;
                            }
                            if(c<col-1 && arr[r][c+1]=='X'){
                                arr[r][c+1] = 'O';
                                rowIndex[++rear] = r;
                                colIndex[rear] =  c+1;
                            }
                        }
                    }
                }
            }
            System.out.println(numberOfShapes);
        }
    }
}
