import java.util.*;

public class Solution {

    public int[] solution(int []arr) {

        // 배열 리스트를 선언        
        ArrayList<Integer> list = new ArrayList<>();

        // 배열의 값만큼 반복해서 동작
        for(int i = 0; i < arr.length; i++) {
            // 리스트가 비어있거나 들어간 마지막 값과 현재 값을 비교해서 다르면 추가
            if( list.isEmpty() || list.get(list.size() -1) != arr[i] ) {
                list.add(arr[i]);
            }
        }

        // 리스트 배열로 전환
        // 리스트 개수만큼의 int배열 선언
        int[] answer = new int[list.size()];
        // 리스트 개수만큼 반복 대입 삽입
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}