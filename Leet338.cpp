public:
    vector<int> countBits(int num) {
        int p;
        int a[32] = { 0 };
        vector<int> ans;
        for(int i = 0; i <= num; i++){
            p = i;
            int count = 0;
            while(p != 0){
                for(int j = 31; j >= 0; j--){
                    a[j] = p % 2;
                    p /= 2;
                    if(a[j] == 1){
                        count++;
                    }
                }
            }
            ans.push_back(count);
        }
        return ans;
    }
