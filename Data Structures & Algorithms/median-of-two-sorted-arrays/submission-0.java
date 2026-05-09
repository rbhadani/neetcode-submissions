class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int l1 = nums1.length;
        int l2 = nums2.length;


        if(l2<l1) return findMedianSortedArrays(nums2,nums1);
        int totalSize = (l1+l2+1)/2;
        int left = 0;
        int right = l1;

        while(left<=right){

        int partitionX = (left+right)/2;
        int partitionY = totalSize-partitionX;

        int left1 =  partitionX==0 ? Integer.MIN_VALUE : nums1[partitionX-1];
        int right1 = partitionX==l1 ? Integer.MAX_VALUE : nums1[partitionX];

        int left2 = partitionY==0 ? Integer.MIN_VALUE : nums2[partitionY-1];
        int right2 = partitionY==l2 ? Integer.MAX_VALUE : nums2[partitionY];


            if(left1<=right2 && left2<=right1){
                if((l1+l2) %2!=0){
                    return Math.max(left1,left2);
                }
                else{
                   return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                }
            }
            else if(left1>right2){
                right = partitionX-1;//too many elements taken from nums1
            }
            else{
                left = partitionX+1;
            }
        }
        return -1;
    }
}
