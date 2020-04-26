import java.util.Deque;
import java.util.LinkedList;

public class Arraier {
    /**
     * 优点，无堆内存
     * 缺点，k很大时复杂度高
     */

    public static final void maxSlideWindow(final int[] nums, int k) {
        if(nums == null) {
            return;
        }

        k = nums.length < k ? nums.length : k;

        int max = Integer.MIN_VALUE;
        boolean maxSkiped = false;
        for (int i = 0; i < nums.length - k + 1; i++) {

            if(i != 0 && nums[i + k - 1] <= max && !maxSkiped) {
                System.out.println(max);
                continue;
            }

            max = nums[i];
            for(int j= i+1; j < i + k; j++) {
                max = nums[j] > max ? nums[j] : max;
            }

            maxSkiped = max == nums[i];

            System.out.println(max);
        }
    }


    /**
     * 优点，复杂度底
     * 缺点，有堆内存
     */
    public static int[] maxSlidingWindow2(int[] nums, int k) {
        if (nums == null || nums.length < k || k == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
            if (deque.getFirst() == i - k) {
                deque.removeFirst();
            }

            if (i >= k - 1) {
                res[i - k + 1] = nums[deque.getFirst()];
            }
        }

        for (int re : res) {
            System.out.println(re);
        }
        return res;
    }
}
