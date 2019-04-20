class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list= new ArrayList<>();
        for (int i: nums1) {
            list.add(i);
        }
        for (int j : nums2) {
            list.add(j);
        }
        Collections.sort(list);
        int size = list.size();
        double median = 0;
        if (size % 2 == 0) {
            median = (list.get(size/2-1) + list.get(size/2))/2.0;
        }
        else {
            median = list.get(size/2);
        }
        return median;
    }
}