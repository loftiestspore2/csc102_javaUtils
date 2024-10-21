/**
 * created by Tebogo Phosa on 21/10/2024
 */
package lstOfStaticArrays;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StaticArrays {

    protected final static Random r =new Random();

    public static char[] charsAlfabet=cA();
    public static String[] alfabetArray;

    public static int[] numsArray=numArrayMethod(0,9);
    public static int[] numCardsArray=numArrayMethod(1,52);//this might never be used

    public static List<String> lst=joiningArrays(alfabetArray,numsArray);

    protected final static int studentNumSz=8;//with leding char
    protected final static int kznNumPlateSz=9;//ND744-405 or code 5numbers
    protected final static int numPlateSz=10;

    private static char[] cA(){//alphabett array
        char[] c=new char[26];
        int a=65;
        for(int j =0;j<26;j++){
            c[j] =( (char) (a+j) );
        }//for
        return c;
    }

    protected static int[] numArrayMethod(int i,final int i1){
        int[] a = new int[i1];
        for(int x = 0;x<=i1;x++){
            a[x]=i;
            i++;
        }
        return a;
    }

    protected static String[] arrayCasting(char[]cA){
        String a="";
        for(char a1:cA){
            a+=" "+a1;
        }
        return a.split(" ");
    }

    private static List<String>joiningArrays(String[]s,int[]n){
        String a="";
        for(String s1:s){
            a+=" "+s1;
        }
        for(int n1 :n){
            a+=" "+n1;
        }
        return Arrays.asList(a.split(" "));
    }

}
