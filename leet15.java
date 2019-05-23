public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();


    //sort
    for(int i = 0; i < nums.length - 1; i++){
        for(int j = 0; j < nums.length - i - 1; j++){
            if (nums[j] > nums[j + 1]){
                int temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }


    int count = 0;
    for (int i = 0; i < nums.length - 1; i++){
        for (int j = i + 1; j < nums.length; j++){
            int sum = nums[i] + nums[j];

            for(int k = nums.length - 1; k >= j + 1; k--){
                if (nums[k] + sum == 0){
                    ans.add(new ArrayList<>());
                    ans.get(count).add(nums[i]);
                    ans.get(count).add(nums[j]);
                    ans.get(count).add(nums[k]);
                    count++;
                }
            }
        }
    }

    for (int i = 0; i < ans.size() - 1; i++){
        for (int j = i + 1; j < ans.size(); j++){
            if (ans.get(i).equals(ans.get(j))){
                ans.get(j).add(-1);
            }
        }
    }

    List<List<Integer>> temp = new ArrayList<>();


    for (int i = 0; i < ans.size(); i++){
        if (ans.get(i).size() < 4){
            temp.add(ans.get(i));
        }
    }

  //        for (int i = 0; i < temp.size(); i++){
  //            for (int j = 0; j < 3; j++){
  //                System.out.print(temp.get(i).get(j) + ", ");
  //            }
  //            System.out.println();
  //        }

    ans = temp;

    return ans;
}
