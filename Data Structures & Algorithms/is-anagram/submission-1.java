class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sorts = s.toCharArray();
        char[] sortt = t.toCharArray();
        Arrays.sort(sorts);
        Arrays.sort(sortt);
        return Arrays.equals(sorts,sortt);

    }
}
