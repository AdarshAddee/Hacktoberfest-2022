import java.util.Arrays;

public class searchIn2dArr {
    public static void main(String[] args) {
        int[][] arr={
                {3,5,36,2,56},
                {34,57,24,72,7},
                {35,67,4,6,2,67,34}
        };
        int target=24;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int Max(int[][]arr ){
        int max=arr[0][0];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                if (arr[i][j]>max) {
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    static int[] search(int[][]arr,int target){
        if(arr.length==0){
            return new int[]{-1};
        }
        int i = 0;
        for(i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
}
