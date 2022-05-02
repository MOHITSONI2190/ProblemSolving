public class MedianOfSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int length= nums1.length+nums2.length;
       int len=(length/2)+1;
       int [] output= new int[len];
       int j=0, k=0;
       for(int i=0;i<len;i++){
       if(j<nums1.length&& k <nums2.length){
           if(nums1[j]>= nums2[k]){
               output[i]=nums2[k];
               k++;
           }else {
               output[i]=nums1[j];
               j++;
           }
       }else if(j>=nums1.length){
           output[i]=nums2[k];
           k++;
       }else{
           output[i]=nums1[j];
           j++;
       }
       }

       if(length%2!=0){
           return output[len-1];
       }else{
           return ((double)output[len-1]+(double)output[len-2])/2;
       }
    }

    public static void main(String[] args) {
        int[] nums1= {1,2};
        int[] nums2= {3,4};
System.out.print(MedianOfSortedArray.findMedianSortedArrays(nums1, nums2));
    }
}
