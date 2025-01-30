class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        StringBuilder br = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            br.append(arr[i]);  
            if (i != 0){
                br.append(" ");
            }
        }
        return br.toString();  
    }
}
