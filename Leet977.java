public class Leet977 {
    public int[] sortedSquares(int[] A) {
        int[] N = new int[A.length];

        for(int i = 0; i < A.length; i++){
            N[i] = A[i] * A[i];
        }

        //sort
        for(int i = 0; i < A.length - 1; i++){
            for(int j = 0; j < A.length - 1 - i; j++){
                if(N[j] > N[j + 1]){
                    //swap
                    int hold = N[j];
                    N[j] = N[j + 1];
                    N[j + 1] = hold;
                }
            }
        }

        return N;
    }
}
