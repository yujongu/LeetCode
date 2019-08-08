public class Leet9 {
    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        char[] fHalf = new char[temp.length()/2];
        char[] sHalf = new char[temp.length()/2];
        for(int i = 0; i < temp.length()/2; i++){
            fHalf[i] = temp.charAt(i);
        }
        if(temp.length() % 2 == 0){
            for(int i = temp.length()/2; i < temp.length(); i++){
                sHalf[i - temp.length()/2] = temp.charAt(i);
            }
        } else{
            for(int i = temp.length()/2 + 1; i < temp.length(); i++){
                sHalf[i - temp.length()/2 - 1] = temp.charAt(i);
            }
        }

        for(int i = 0; i < temp.length()/2; i++){
            if(fHalf[i] != sHalf[temp.length()/2 - i - 1]){
                return false;
            }
        }
        return true;
    }

}
