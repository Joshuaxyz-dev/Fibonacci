public class Fib {

    public boolean expectedFibonacciSeries(int Number) {

        boolean flag = true;
        for (int i = 55; i < Number; i++) {
//            if (Number % i == 0) {
                flag = false;
//            }
        }
        return flag;
    }
}
