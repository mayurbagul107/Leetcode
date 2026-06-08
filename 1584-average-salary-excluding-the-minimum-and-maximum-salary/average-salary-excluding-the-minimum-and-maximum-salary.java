class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for(int s : salary) {
            sum += s;
            
            if(s < min) {
                min = s;
            }
            if (s > max) {
                max = s;
            }
        }
        int remainingSum = sum - min - max;
        int count = n -2;
        return (double) remainingSum / count;
    }
}