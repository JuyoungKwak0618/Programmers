class Solution {
    public int[] solution(int money) {
        // 초기값 설정
        int[] answer = {0,0};
            answer[0] = money / 5500;
            answer[1] = money - (5500 * answer[0]);
        return answer;
    }
}