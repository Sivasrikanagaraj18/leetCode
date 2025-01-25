class Solution {
    public String gcdOfStrings(String str1, String str2)
    {
     String str3=str1+str2;
     String str4=str2+str1;
     if(!str3.equals(str4)){
        return "";
     }
     int l=gcd(str1.length(),str2.length());
     return str4.substring(0,l);
    }
    public static int gcd(int l,int r){
        while(r!=0){
            int t=l%r;
            l=r;
            r=t;
        }
        return l;
    }
}