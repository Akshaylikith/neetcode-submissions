class Solution {
    public int characterReplacement(String s, int k) {
      int[] count = new int[26];
      int left=0;
      int right=0;
      int maxlen=0;
      int maxfreq=0;

      while(right<s.length()){
        // Add a right character to window
        count[s.charAt(right)-'A'] ++;

        // update frequency
        maxfreq=Math.max(maxfreq,count[s.charAt(right)-'A']);

        // if window requires to many replacements
        while((right-left +1) - maxfreq>k){
            count[s.charAt(left) -'A'] --;
            left++;
        }

        maxlen=Math.max(maxlen,right - left + 1);
        right++;
      }  
      return maxlen;
    }
}
