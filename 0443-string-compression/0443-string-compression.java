class Solution {
    public int compress(char[] chars) {
     int n=chars.length;
     int id=0;
     for(int i=0;i<n;i++){
        char ch=chars[i];
        int c=0;
        while(i<n && chars[i]==ch){
            c++;
            i++;
        }
        if(c==1){
            chars[id++]=ch;
        }
        else{
            chars[id++]=ch;
            for(char digit:Integer.toString(c).toCharArray()){
              chars[id++]=digit;
            }
        }
        i--;
     }
     return id;
}
}