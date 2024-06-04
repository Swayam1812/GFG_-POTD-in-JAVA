class Solution {
    String binaryNextNumber(String s) {
        char sa[]=s.toCharArray();
        int carry=1,j=0;
        for(int i=sa.length-1;i>=0;i--){
            if(sa[i]=='0'){
                carry=0;
                sa[i]='1';
                break;
            }else sa[i]='0';
        }
        s=new String(sa); 
        if(carry==1) s='1'+s; 
        while(j<s.length() && s.charAt(j)=='0') j++;
        s=s.substring(j); 
        return s;
    }
}
