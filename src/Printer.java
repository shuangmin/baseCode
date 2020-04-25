public class Printer {
    public static final <T> void out(T[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("empty");
            return;
        }
        String msg = null;
        for (T t : arr) {
            msg += msg == null ? t : "," + t;
        }
        System.out.println(msg);
    }


    public static final void out(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("empty");
            return;
        }
        String msg = "";
        for (int t : arr) {
            msg += msg == "" ? t : "," + t;
        }
        System.out.println(msg);
    }

}
