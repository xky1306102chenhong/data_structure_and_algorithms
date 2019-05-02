/**
 * @author Chris Chen
 * @date 2019/5/2 下午2:15
 */
public class RectCover {
    public int rectCover(int target){
        if(target == 0){
            return 0;
        }
        if(target ==1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int frontTwo = 1;
        int frontOne = 2;
        for(int i = 3; i<=target;i++){
            int tmp = frontOne;
            frontOne = frontTwo + tmp;
            frontTwo = tmp;
        }
        return frontOne;
    }
}
