class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        int len=nums1.length;
        int len2=nums2.length;
        int f=0;
        for(int i=0;i<len;i++){
            f=0;
            for(int j=0;j<len2;j++){
                if(nums1[i]==nums2[j]){
                    for(int k=j;k<len2;k++){
                        if(nums1[i]<nums2[k]){
                            f=1;
                            arr[i]=nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            if(f==0){
                arr[i]=-1;
            }

        }
        return arr;
        
    }
}