import java.util.*;

public class solutionWhoLikesIt {
    public static void main(String[] args) {
        String hasil = whoLikesIt("Alex", "Jacob", "Mark", "Max","budi");
        System.out.println(hasil);
    }

    public static String whoLikesIt(String... names) {
        // Do your magic here
        String finalOut = "";
        if(names.length==0){
            finalOut += "no one likes this";
        } else if(names.length==1){
            finalOut += names[0] + " likes this";
        } else if(names.length==2){
            finalOut += names[0] +" and "+names[1]+" like this";
        } else if(names.length==3){
            finalOut += names[0]+", "+names[1]+" and "+names[2]+" like this";
        } else {
            int restMin = names.length - 2;
            finalOut += names[0]+", "+names[1]+" and "+restMin+" others like this";
        }
        return finalOut;
    }
}
