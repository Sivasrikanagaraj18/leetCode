class Solution {
    public int secondHighest(String s) {
        String str=s.replaceAll("[^0-9]", "");
        int max=-1;
        int sec=-1;
        for(int i=0; i<str.length();i++) {
            int current=str.charAt(i)-'0';  
            if(current>max){
                sec=max;
                max=current;
            } else if (current>sec && current!=max) {
                sec = current;
            }
        }
        return sec;
    }
}

