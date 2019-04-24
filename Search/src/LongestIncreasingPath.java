import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Chris Chen
 * @date 2019/4/25 上午12:05
 */
public class LongestIncreasingPath {
    public static int longestIncreasingPath(int[][] matrix){
        int ans = 0;
        if(matrix.length == 0){
            return ans;
        }
        class Point{
            int i;
            int j;
            int value;

            public Point(int i, int j, int value) {
                this.i = i;
                this.j = j;
                this.value = value;
            }
        }
        ArrayList<Point> arrayList = new ArrayList<Point>();
        for (int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                arrayList.add(new Point(i, j, matrix[i][j]));
            }
        }
        arrayList.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.value - o2.value;
            }
        });

        int[][] f = new int[matrix.length][matrix[0].length];
        for (int i=0; i<f.length; i++){
            Arrays.fill(f[i], 0);
        }

        int[][] dir = {{0, 1},{0,-1},{1, 0},{-1,0}};

        for (Point p: arrayList){
            int max = 0;
            for (int i=0;i<dir.length;i++){
                int tmpX = p.i + dir[i][0];
                int tmpY = p.j + dir[i][1];
                if(tmpX >= 0 && tmpX < f.length && tmpY >= 0 && tmpY < f[0].length && matrix[tmpX][tmpY] < matrix[p.i][p.j]){
                    if(max<f[tmpX][tmpY]){
                        max = f[tmpX][tmpY];
                    }
                }
            }
            f[p.i][p.j] = 1 + max;
        }



        for(int i = 0; i< f.length;i++){
            for(int j= 0;j<f[i].length;j++){
                if(f[i][j]>ans){
                    ans =f[i][j];
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {9,9,4},
                {6,6,8},
                {2,1,1}};
        System.out.println(longestIncreasingPath(matrix));

    }
}
