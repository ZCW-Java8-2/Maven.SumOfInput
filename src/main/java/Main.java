import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        long[] sum = getSum(n);

        System.out.println(String.format("The sum of numbers 1 through %s is %s.", n, sum[0]));
        double timeDif = sum[1];
        System.out.println("Runtime was: " + timeDif + " microseconds.");

        //for Extra Credit
        long sumGauss[] = getSumGauss(n);
        double timeDifGauss = sumGauss[1];
        System.out.println("Gauss did it in " + timeDifGauss + " nanoseconds.");
    }

    static long[] getSum (int n) {
        long[] ans = new long[2];
        long sum = 0;
        long timeStart = System.nanoTime();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        long timeStop = System.nanoTime();
        ans[0] = sum;
        ans[1] = (timeStop - timeStart)/(1000);
        return ans;
    }

    static long[] getSumGauss (int n) {
        long[] john = new long[2];
        long timeStartGauss = System.nanoTime();
        long sumGauss = (n * (n+1)) / 2;
        long timeStopGauss = System.nanoTime();
        john[0] = sumGauss;
        john[1] = timeStopGauss - timeStartGauss;

        return john;
    }
    // for Extra extra credit - compare the methods and show which one is faster
    
}
