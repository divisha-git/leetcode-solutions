class Solution {
    public String reverseVowels(String s) {
        char a[]=s.toCharArray();
        int l=0;
        int r=a.length-1;
        while(l<r){
            while(l<r && !(a[l]=='a'||a[l]=='e'||a[l]=='i'||a[l]=='o'||a[l]=='u'||a[l]=='A'||a[l]=='E'||a[l]=='I'||a[l]=='O'||a[l]=='U')){
                l++;
            }
            while(l<r && !(a[r]=='a'||a[r]=='e'||a[r]=='i'||a[r]=='o'||a[r]=='u'||a[r]=='A'||a[r]=='E'||a[r]=='I'||a[r]=='O'||a[r]=='U')){
                r--;
            }
            char temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            r--;
            l++;
             
        }
        return new String(a);
    }
}