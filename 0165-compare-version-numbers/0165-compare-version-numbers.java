class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1=version1.split("\\.");
         String[] arr2=version2.split("\\.");
int len1=arr1.length;
int len2=arr2.length;
int soii=Math.max(len1,len2);

for(int i=0;i<soii;i++){
    try{
   if(Integer.valueOf(arr1[i])<Integer.valueOf(arr2[i])){
    return -1;
   }
   if(Integer.valueOf(arr1[i])>Integer.valueOf(arr2[i])) {
    return 1;
   }}
   catch(ArrayIndexOutOfBoundsException e){
    if(soii==len1){
        if(Integer.valueOf(arr1[i]) > 0){
            return 1;
        }

    }
    else if(soii==len2){
         
        if(Integer.valueOf(arr2[i]) > 0){
            return -1;
        }


    }
    
}




}

     return 0;   
    }
}