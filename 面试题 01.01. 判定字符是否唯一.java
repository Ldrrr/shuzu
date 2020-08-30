class Solution {
    public boolean isUnique(String astr) {
        int[] a =new int[26];
        for(int i=0;i<astr.length();i++){
            a[astr.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]>1){
                return false;
            }
        }
        return true;
    }
}
