class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n))
        {
            seen.add(n);
            n=sumofSquares(n);
        }
        return n==1;
    }
    private int sumofSquares(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum += digit * digit;
            num = num /10;
        }
        return sum;
    }
}