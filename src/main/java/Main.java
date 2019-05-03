import java.math.BigInteger;
import java.util.Arrays;

public class Main {


    public static BigInteger easyLine(int n) {

        BigInteger[][] setArr = new BigInteger[n+1][];
        int i =0;

        while(i<=n){
            BigInteger[] tempArr = new BigInteger[i+1];
            tempArr[0] = new BigInteger("1");
            for(int k=1; k<tempArr.length-1; k++ ){
                BigInteger tempBigInt = (setArr[i-1][k-1].add( setArr[i-1][k]));
                tempArr[k]= tempBigInt;
            }
            tempArr[tempArr.length-1] = new BigInteger("1");
            setArr[i] = tempArr;
            i++;
        }

        BigInteger tem = new BigInteger("0");
        BigInteger[] lastArr = setArr[setArr.length-1];
         for( BigInteger big : lastArr ){
             tem = tem.add(big.pow(2));
         }

        return new BigInteger( String.valueOf(tem) );
    }




    public static void main(String[] args) {
        System.out.println( easyLine(7));
    }

}
