import java.util.Arrays;

public class FirstandLastPos {
    public static void main(String[] args) {
        int[]arr={5,7,7,8,8,10};
        int target=8;
        int[]ans=firstAndlast(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] firstAndlast(int[] nums,int target){
        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] arr,int target,boolean findStartIndex){
        int start=0;
        int end= arr.length-1;
        int ans=-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                ans=mid;
                if (findStartIndex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
