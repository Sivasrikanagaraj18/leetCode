class Solution {
    public boolean isPalindrome(String s) {
    int i=0;
    int j=s.length()-1;
    while(i<j){
        char c1=s.charAt(i);
        char c2=s.charAt(j);
        if(!((c1>='A' && c1<='Z')||(c1>='a' && c1<='z')||(c1>='0' && c1<='9'))){
            i++;
            continue;
        }
         if(!((c2>='A' && c2<='Z')||(c2>='a' && c2<='z')||(c2>='0' && c2<='9'))){
            j--;
            continue;
        }
        if(c1>='A' && c1 <='Z'){
                c1 += 32;
            }
        if(c2>='A' && c2 <='Z'){
                c2 += 32;
            }
        if(c1 != c2){
                return false;
            }

        i++;
        j--;
    }
    return true;
}
}
