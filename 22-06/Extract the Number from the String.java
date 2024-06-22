class Solution {
    long ExtractNumber(String sentence) {
        long num=-1;
        String []s=sentence.split(" ");
        for(String i:s){
            if(Character.isDigit(i.charAt(0))){
                if(!(i.contains("9"))){
               long nm=Long.parseLong(i);
                num=Math.max(nm,num);
            }
        }
    }
    return num;
}
}

