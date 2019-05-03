import java.math.BigInteger;
import java.util.Arrays;

public class Main {

//    public static BigInteger easyLine(int n) {
    public static BigInteger easyLine(int n) {

        Integer[][] setArr = new Integer[n+1][];
        int i =0;

        while(i<=n){
            Integer[] tempArr = new Integer[i+1];
            tempArr[0] = 1;
            for(int k=1; k<tempArr.length-1; k++ ){
                tempArr[k]= setArr[i-1][k-1] + setArr[i-1][k];
            }
            tempArr[tempArr.length-1] = 1;
            setArr[i] = tempArr;
            i++;
        }

//        Arrays.stream(setArr)
//                .forEach( g -> Arrays.stream(g).forEach( h -> System.out.println(h)));


        Integer[] lastArr = setArr[setArr.length-1];

        Arrays.stream(lastArr).forEach( b-> System.out.print(b+" "));
        System.out.println();
        Arrays.stream(lastArr).forEach( b-> System.out.print(b*b+" "));
        System.out.println();

        Integer result = Arrays.stream(lastArr)
                .mapToInt(x -> x*x)
                .sum();

        return new BigInteger( String.valueOf(result) );
    }




    public static void main(String[] args) {
        System.out.println( easyLine(7));
    }

}
