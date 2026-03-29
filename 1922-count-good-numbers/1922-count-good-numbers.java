class Solution {
    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long result = (power(5, even) * power(4, odd)) % MOD;
        return (int) result;
    }

    private long power(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) { // if odd
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1; // divide by 2
        }

        return result;
    }
}