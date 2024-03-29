package 力扣热题100;

/**
 * @Author shizq18
 * @Date 2023/10/17
 * @Description
 */
public class 搜索插入位置 {
    public static void main(String[] args) {
        searchInsert(new int[]{1,3,5,6},5);
    }
    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     *
     * 请必须使用时间复杂度为 O(log n) 的算法。
     *
     *
     *
     * 示例 1:
     *
     * 输入: nums = [1,3,5,6], target = 5
     * 输出: 2
     * 示例 2:
     *
     * 输入: nums = [1,3,5,6], target = 2
     * 输出: 1
     * 示例 3:
     *
     * 输入: nums = [1,3,5,6], target = 7
     * 输出: 4
     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left <= right) {
            int middle = (left+right)/2;
            if (nums[middle] > target) {
                right = middle-1;
            } else if (nums[middle] < target) {
                left = middle+1;
            }  else {
                return middle;
            }
        }
        return left;
    }
}
