import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer;
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < record.length;i++){
            String[] arr = record[i].split(" ");
            if(arr[0].equals("Enter")){
                map.put(arr[1],arr[2]);
                list.add("Enter " + arr[1]);
            }else if(arr[0].equals("Leave")){
                list.add("Leave " + arr[1]);
            }else if(arr[0].equals("Change")){
                map.put(arr[1],arr[2]);
            } 
        }
        answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            String[] temp = list.get(i).split(" ");
            if(temp[0].equals("Enter")){
                answer[i] = map.get(temp[1])+"님이 들어왔습니다.";
            }else if(temp[0].equals("Leave")){
                answer[i] = map.get(temp[1])+"님이 나갔습니다.";
            }   
        }
        return answer;
    }
}