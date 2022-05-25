package fibmap;
/**
 *
 * @author myset
 */
public class FibMap {
    
    public static long fib(int n){
        if (n < 2) {
            return n;
        }
        long[] f = new long[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
    
    public static void main(String[] args) {
        System.out.println(fib(92));
    }    
}
