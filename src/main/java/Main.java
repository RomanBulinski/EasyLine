import java.math.BigInteger;

public class Main {

    public static BigInteger easyLine(int n) {
        BigInteger[][] setArr = new BigInteger[n + 1][];
        setArray(n, setArr);
        BigInteger tem = new BigInteger("0");
        BigInteger[] lastArr = setArr[setArr.length - 1];
        for (BigInteger big : lastArr) {
            tem = tem.add(big.pow(2));
        }
        return tem;
    }

    private static void setArray(int n, BigInteger[][] setArr) {
        int i = 0;
        while (i <= n) {
            BigInteger[] tempArr = new BigInteger[i + 1];
            tempArr[0] = new BigInteger("1");
            tempArr[tempArr.length - 1] = tempArr[0];
            for (int k = 1; k < tempArr.length - 1; k++) {
                tempArr[k] = (setArr[i - 1][k - 1].add(setArr[i - 1][k]));
            }
            setArr[i] = tempArr;
            i++;
        }
    }

}
