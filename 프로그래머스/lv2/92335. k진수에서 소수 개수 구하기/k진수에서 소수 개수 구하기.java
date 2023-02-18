class Solution {
    
    public int solution(int n, int k) {
        String s = "";
        int answer = 0;
        
        while(n != 0){
            s = (n % k) + s;
            n = n/k;
        }
        String[] arr = s.split("0");
        for(String str : arr){
            if(str.equals("")){
                continue;
            }
            long l = Long.parseLong(str);
            if(isPrime(l)){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isPrime(long num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
}