public:
    bool judgeCircle(string moves) {
        int up, left;
        up = left = 0;

        for(int i = 0; i < moves.length(); ++i){
            if(moves.at(i) == 'U'){
                up++;
            }
            else if(moves.at(i) == 'D'){
                up--;
            }
            else if(moves.at(i) == 'L'){
                left++;
            }
            else {
                left--;
            }
        }

        if(up == 0 && left == 0){
            return true;
        }
        return false;
    }
