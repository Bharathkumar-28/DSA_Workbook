class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] hash= new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']+=1;
            //System.out.println(hash[s.charAt(i)-'a']);
        }
        HashMap<Integer,String> mosh=new HashMap<>();
        for(int i=0;i<26;i++){
            if(hash[i]!=0){
                  char c = (char) (i + 'a');
                if(mosh.containsKey(hash[i])){
                   mosh.put(hash[i], mosh.getOrDefault(hash[i], "") + String.valueOf(c));

                }
                else{
                    mosh.put(hash[i],String.valueOf(c));
                }
                 //System.out.println(mosh.get(hash[i]));
            }
           
            
        }
        String soii="";
        int max=0;
        for (Map.Entry<Integer, String> entry : mosh.entrySet()) {
    Integer key = entry.getKey();
    String value = entry.getValue();
    //System.out.println(key + " -> " + value);
    if(soii.length()<value.length()){
        soii=value;
        max=key;
    }
    else if(soii.length()==value.length()){
        if(key>=max){
            soii=value;

        }

    }

}
        return soii;



        
    }
}