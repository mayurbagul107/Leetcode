class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        if (restrictions.length == 0) {
            return n - 1;
        }

        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 0});
        for (int[] r : restrictions) {

            list.add(r);
        }
        list.add(new int[]{n, n - 1});
        list.sort((a, b) -> a[0] - b[0]);

        for (int i = 1; i < list.size(); i++) {
            int dist =
                list.get(i)[0] -
                list.get(i - 1)[0];

            list.get(i)[1] =
                Math.min(
                    list.get(i)[1],
                    list.get(i - 1)[1] + dist
                );
        }

        for (int i = list.size() - 2; i >= 0; i--) {
            int dist =
                list.get(i + 1)[0] -
                list.get(i)[0];

            list.get(i)[1] =
                Math.min(
                    list.get(i)[1],
                    list.get(i + 1)[1] + dist
                );
        }

        int answer = 0;
        for (int i = 1; i < list.size(); i++) {
            int id1 = list.get(i - 1)[0];
            int h1 = list.get(i - 1)[1];

            int id2 = list.get(i)[0];
            int h2 = list.get(i)[1];

            int dist = id2 - id1;
            int peak =
                (h1 + h2 + dist) / 2;

            answer = Math.max(answer, peak);
        }
        return answer;
    }
}