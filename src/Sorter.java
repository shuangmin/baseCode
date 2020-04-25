public class Sorter {
    public final void bubbleSort(int[] arr) {
        if(arr == null || arr.length == 0) {
            return;
        }

        int min,tmp;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < min) {
                    tmp = arr[j];
                    arr[j] = min;
                    min = tmp;
                    arr[i] = min;
                }
            }
        }

        Printer.out(arr);
    }
}
