public class Leet999 {
    public int numRookCaptures(char[][] board) {
        //locate rook
        int row = 0;
        int col = 0;
        first:
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(board[i][j] == ('R')){
                    row = i;
                    col = j;
                    break first;
                }
            }
        }
        int answer = 0;

        //above
        for(int i = row; i >= 0; i--){
            if(board[i][col] == 'B'){
                break;
            }
            if(board[i][col] == 'p'){
                answer++;
                break;
            }
        }

        //below
        for(int i = row; i < 8; i++){
            if(board[i][col] == 'B'){
                break;
            }
            if(board[i][col] == 'p'){
                answer++;
                break;
            }
        }

        //left
        for(int i = col; i >= 0; i--){
            if(board[row][i] == 'B'){
                break;
            }
            if(board[row][i] == 'p'){
                answer++;
                break;
            }
        }

        //right
        for(int i = col; i < 8; i++){
            if(board[row][i] == 'B'){
                break;
            }
            if(board[row][i] == 'p'){
                answer++;
                break;
            }
        }


        return answer;
    }
}
