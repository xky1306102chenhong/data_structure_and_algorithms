import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Chris Chen
 * @date 2019/5/6 上午11:23
 * https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&tqId=11172&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class PrintMatrix {
    public static ArrayList<Integer> printMatrix(int[][] matrix){
        int x=0;
        int y=0;
        int counter = 0;
        int total = matrix.length * matrix[0].length;
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for (int i=0;i<visited.length;i++){
            Arrays.fill(visited[i], false);
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>(total);
        while (counter < total){
            /*
            左
             */
            while (y>=0 && y<matrix[0].length && visited[x][y]==false){
                arrayList.add(matrix[x][y]);
                visited[x][y]=true;
                counter ++;
                y += 1;
            }
            /*
            down
             */
            y -= 1;
            x +=1;
            while (x>=0 && x<matrix.length && visited[x][y]==false){
                arrayList.add(matrix[x][y]);
                visited[x][y]=true;
                counter ++;
                x += 1;
            }
            /*
            left
             */
            x -=1;
            y -=1;
            while (y>=0 && y<matrix[0].length && visited[x][y]==false){
                arrayList.add(matrix[x][y]);
                visited[x][y]=true;
                counter ++;
                y -= 1;
            }
            /*
            up
             */
            y +=1;
            x -=1;
            while (x>=0 && x<matrix.length && visited[x][y]==false){
                arrayList.add(matrix[x][y]);
                visited[x][y]=true;
                counter ++;
                x -= 1;
            }
            x +=1;
            y +=1;
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[][] mat = {{}};
        ArrayList<Integer> arrayList = printMatrix(mat);
        for (Integer e:arrayList){
            System.out.println(e);
        }
    }

}
