import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        BigInteger soii=n1.add(n2);
        System.out.println(soii);

        return String.valueOf(soii);

        
    }
}