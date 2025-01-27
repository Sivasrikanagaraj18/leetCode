class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String num=new String(ch);
        if(!map.containsKey(num)){
            map.put(num,new ArrayList<>());
        }
        map.get(num).add(str);
    }
    return new ArrayList<>(map.values());
}
}