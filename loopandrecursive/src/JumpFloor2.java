/**
 * @author Chris Chen
 * @date 2019/5/2 下午1:44
 */
public class JumpFloor2 {
    public int jumpFloor2(int target) {
        if (target ==0){
            return 0;
        }
        if(target==1){
            return 1;
        }
        int ans=1;
        for(int i=1;i<target;i++){
            ans = ans * 2;
        }
        return ans;
    }
}
