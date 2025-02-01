class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    ArrayList<Integer> num=new ArrayList<>();
    HashMap<Integer,Integer> num1=new HashMap<>();
    for(int n:nums){
        num1.put(n,num1.getOrDefault(n,0)+1);
    }
    for(int m:nums){
        if(num1.get(m)==2){
            num.add(m);
            num1.put(m,0);
        }
    }
    return num;
    }
}