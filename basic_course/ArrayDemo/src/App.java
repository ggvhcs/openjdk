package ArrayDemo.src;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Java World! (Arrays)");
        double[] a;
        double max = Double.NEGATIVE_INFINITY;
        a = new double[10];
        for (byte i = 0; i < a.length; i++) {
            a[i] = i * 2;
            System.out.println(a[i]);
            // max value of Array.
            if (a[i] > max)
                max = a[i];
        }
        System.out.println("Maximun Value --> "+max);
    }
}
