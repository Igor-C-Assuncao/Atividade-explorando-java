package dados;

public class utils {


    public static  int[] convertInt2Array(int guess)  {
        String temp = Integer.toString(guess);
        String temp2;
        int temp3;
        int [] newGuess = new int[temp.length()];
        for(int i=0; i<=temp.length(); i++) {
            if (i!=temp.length()) {
                temp2 = temp.substring(i, i+1);
            } else {
                temp2 = temp.substring(i);
                //System.out.println(i);
            }
            temp3 =  Integer.parseInt(temp2);
            newGuess[i] = temp3;
        }
    return newGuess;
}
}
