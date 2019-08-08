public class Leet496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] newArr = new int[nums1.length];
        int i = 0;
        for(i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    for(int k = j; k < nums2.length; k++){
                        if(nums1[i] < nums2[k]){
                            newArr[i] = nums2[k];
                            break;
                        }
                    }
                    if(newArr[i] == 0){
                        newArr[i] = -1;
                        break;
                    }

                }
            }
        }

        return newArr;
    }
}
