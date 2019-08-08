public:
    int hammingDistance(int x, int y) {

        int a[32] = { 0 };
        int b[32] = { 0 };
        int px = x;
        int py = y;
        int check = 0;

        for(int i = 31; i >= 0; i--){
            a[i] = px % 2;
            px /= 2;
            b[i] = py % 2;
            py /= 2;
            if(a[i] != b[i]){
                check++;
            }
        }

        return check;

    }
