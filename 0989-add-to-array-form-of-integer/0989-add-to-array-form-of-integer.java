import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] n, int k) {
    String a="";
    int i;
    for(i=0;i<n.length;i++)
    {
        a=a+n[i];
    }
    BigInteger nm=new BigInteger(a);
    BigInteger kk=new BigInteger(String.valueOf(k));
    nm=nm.add(kk);
    a=nm.toString();
    List<Integer> mm=new ArrayList<>();
    for(i=0;i<a.length();i++)
    {
        mm.add(Integer.parseInt(String.valueOf(a.charAt(i))));
    }
    return mm;
    }
}