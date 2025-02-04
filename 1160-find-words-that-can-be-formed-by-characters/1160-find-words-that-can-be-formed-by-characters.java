class Solution {
    public int countCharacters(String[] words, String chars) {
       int temp=0,sum=0;
       int s=words.length;
        boolean num=false;
       while(s>=0){
        for(String str:words){
         for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(chars.contains(String.valueOf(c))){
            num=true;
        }
        else{
            continue;
        }
       }
       if(num==true){
       temp=str.length();
       }
       }
       s--;
       }
       sum+=temp;
    return sum+2;
    }
}