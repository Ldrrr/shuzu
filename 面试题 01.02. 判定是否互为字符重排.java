class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        /*char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);*/
        if(s1.length()!=s2.length()) return false;
        int[] a = new int[26];
        int[] b = new int[26];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
