import org.junit.Test;

/**
 * Created by hsm on 16/7/19.
 */
public class Translation_3_7 {
    public String stringTranslation(String A, int n, int len) {
        // write code here
        char[] arrayChar=A.toCharArray();

        //将0到len-1的反转
        String B=revertString(A,0,len-1);
        //将len-1到n-1的反转
        String C=revertString(B,len,n-1);
        //将0-n-1反转
        String D=revertString(C,0,n-1);

        return D;

    }

    private String revertString(String str, int begin, int end){
        char[] arrayChar=str.toCharArray();
        while(begin<end){
            char tmp=arrayChar[begin];
            arrayChar[begin]=arrayChar[end];
            arrayChar[end]=tmp;
            begin++;
            end--;
        }

        return String.valueOf(arrayChar);

    }

    @Test
    public void test(){
        String test="ABCDE";
        int n=5;
        int len=3;

        String result=stringTranslation(test,n,len);

        System.out.println(result);
    }

}
