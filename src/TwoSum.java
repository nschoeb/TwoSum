public class TwoSum {

    public static void main(String[] args) {
        int[] nums={3,2,4,5};
        int[] result=twoSum(nums,6);
        for(int num:result) System.out.print(num+" ");
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j)continue;
                if(nums[i]+nums[j]==target){
                    int[] result={i,j};
                    return result;
                }
            }
        }return null;
    }
}
