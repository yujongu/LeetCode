public class Leet26 {
    public int removeDuplicates(int[] nums) {
        int len = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[len] != nums[i]){
                len++;
                nums[len] = nums[i];
            }
        }
        len++;
        return len;
    }
}
