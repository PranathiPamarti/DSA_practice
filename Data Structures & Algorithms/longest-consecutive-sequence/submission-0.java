class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int large=0;
        for(int num: set){
            int length=0;
            if(!set.contains(num -1)){
                while(set.contains(num +length)){
                    length++;
                }
            }
            large=Math.max(large,length);
        }
        return large; 
    }
}
