class Solution {
    public int[] solution(int[] arr, int[][] queries) {
		 int[] answer = new int[queries.length];
		for(int i = 0; i < queries.length; i++) {
			 int s = queries[i][0];
	            int e = queries[i][1];
			int min = Integer.MAX_VALUE;
			for(int k = e; k >= s; k--) {
				if(arr[k] > queries[i][2] && min > arr[k]) {
					min = arr[k];
				}
			}
			answer[i] = min == Integer.MAX_VALUE ? -1 : min;
		}
		return answer;
	}
}