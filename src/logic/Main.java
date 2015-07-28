package logic;

/**
 * Created by Yevhen on 28.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int[] a;
        a = new int[5];
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
        double[] x = {5.3, 2.2, -0.1};
        for (int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
        //System.out.println(x);

        double[] z = new double[4];
        z[0] = 5.2;
        z[1] = -0.2;
        z[2] = 0.7;
        z[3] = 1000.345;
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
            System.out.print(" ");
        }
        System.out.println();
        double sum1 = sum(x);
        System.out.println("sum1 = " + sum1);
        System.out.println("max1 = " + max(x));
        double sum2 = sum(z);
        System.out.println("sum2 = " + sum2);
        double mx2 = max(z);
        System.out.println("max2 = " + mx2);
    }

    public double sum(double[] x) {
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            result = result + x[i];
        }
        return result;
    }

    public double max(double[] x) {
        double result = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i]>result){
                result = x[i];
            }
        }
        return result;
    }

    public double min(double[] x) {
        double result = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i]<result){
                result = x[i];
            }
        }
        return result;
    }
}
