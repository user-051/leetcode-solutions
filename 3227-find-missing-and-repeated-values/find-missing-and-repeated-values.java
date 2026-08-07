class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;
        int a=0 , b=0 ;
        int expSum = 0, actualSum = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                actualSum += grid[i][j]; 
                if(set.contains(grid[i][j])){
                    a= grid[i][j];
                    // ans.add(a);
                    // break;
                }
                set.add(grid[i][j]);
            }
        }
        expSum = (n*n) *(n*n +1)/2;
        b = expSum + a - actualSum;
        // ans.add(b);
        return new int[]{a, b};
    }
}