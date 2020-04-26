public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] copy = new int[]{23,34,34,55,65,32,12,45,0,23,21,4,59,31,32348,2349,34934,9349};

        //new Sorter().bubbleSort(copy);


        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};

        Arraier.maxSlideWindow(nums,3);


        Arraier.maxSlidingWindow2(nums,3);
    }

}
