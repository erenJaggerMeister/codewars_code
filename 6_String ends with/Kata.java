import java.util.*;
public class Kata {
    public static void main(String[] args){
        boolean hasilCek = solution("ninja", "ja");
        System.out.println("hasil cek string = "+hasilCek);
    }
    public static boolean solution(String str, String ending) {
        char[] stnce1 = str.toCharArray();
        char[] stnce2 = ending.toCharArray();
        int index1 = stnce1.length-1;
        int index2 = stnce2.length-1;
        if(stnce2.length>stnce1.length){
            return false;
        } 
        if(ending.equals("")){
            return true;
        } else if(str.equals("")){
            return false;
        }
        boolean outStr = true;
        while(true){
            if(stnce1[index1]!=stnce2[index2]){
                outStr = false;
                break;
            }
            index1--;
            index2--;
            if(index1<0 || index2<0){
                break;
            }
        }
        return outStr;
    }
}
