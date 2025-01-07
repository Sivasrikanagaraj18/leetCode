class Solution {
    public String toLowerCase(String s) {
        StringBuffer str=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                str.append((char) (ch+32));
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}