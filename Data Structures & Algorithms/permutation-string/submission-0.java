class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // first check
        if(s1.length()>s2.length()){
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];


        // store frequency of s1
        for(char c : s1.toCharArray()){
            count1[c-'a']++;
        }

        // first window 

        for(int i=0; i<s1.length(); i++){
            count2[s2.charAt(i)-'a']++;
        }
        for(int i=s1.length();i<s2.length();i++){
        // compare two arrays
        if(same(count1,count2)){
            return true;
        }
        // Add items to the array
        count2[s2.charAt(i)-'a']++;

        // delete the previous element in the loop

        count2[s2.charAt(i-s1.length()) -'a'] --;
    }

    return same(count1,count2);

    }

    public boolean same(int[] a , int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
