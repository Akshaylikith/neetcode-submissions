class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int right=0;
        int maxlen=0;
    while(right<s.length()){
        // dulicates search
        while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
        }
        // add current character
        set.add(s.charAt(right));

        //calculate the max length

        int len=right-left+1;

        maxlen=Math.max(maxlen,len);
        right++;
    }
        return maxlen;
    }
}
