class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int []minNumbers = {a, b, c, d};
        
        // 1번째 조건
        if(a == b & a == c & a == d) {
            answer = a * 1111;
        }
         
        // 2번째 조건
        
        //d만 다를때,
        else if(a == b && b == c && c != d){
            answer += (10 * a + d) * (10 * a + d);
        }
        //c만 다를 때,
        else if(a == b && b == d && d != c){
            answer += (10 * a + c) * (10 * a + c);
        }
        //b만 다를 때,
        else if(a == d && d == c && c != b){
            answer += (10 * a + b) * (10 * a + b);
        }
        
        //a만 다를 때,
        else if(d == b && b == c && c != a){
            answer += (10 * d + a) * (10 * d + a);
        }
        
        // 3,4번째조건
        
       else if(a == b){
            if(c == d){
                answer += (a + c) * Math.abs(a - c);
            }
            else{
                answer += c * d;
            }
        }
        //두 주사위만 같을 때,
        else if(a == c){
            if(b == d){
                answer += (a + b) * Math.abs(a - b);
            }
            else{
              answer += b * d;  
            }
        }
        //두 주사위만 같을 때,
        else if(a == d){
            if(b == c){
                answer += (a + b) * Math.abs(a - b);
            }
            else{
                answer += b * c;
            }
        }
        //두 주사위만 같을 때,
        else if(b == c){
            if(a == d){
                answer += (b + a) * Math.abs(b - a);
            }
            else{
                answer += a * d;
            }
        }
        //두 주사위만 같을 때,
        else if(b == d){
            if(a == c){
                answer += (b + a) * Math.abs(b - a);
            }
            else{
                answer += a * c;
            }
        }
        //두 주사위만 같을 때,
        else if(c == d){
            if(b == a){
                answer += (c + b) * Math.abs(c - b);
            }
            else{
                answer += b * a;
            }
        }
        // 5번째 조건
        else {
            int min = minNumbers[0];
              for(int i = 1; i < minNumbers.length; i++) {
             if(minNumbers[i] < min) {
                min = minNumbers[i];
             }
          }
             answer = min;
        }
        return answer;
    }
}