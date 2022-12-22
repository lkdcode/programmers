package tip;

import java.util.Arrays;
import java.util.List;

public class StringTip {
    public static void main(String[] args) {

        /**
         *  문자열 관련 ····
         */

        String exam = "영일이삼사오";
        char charAt = exam.charAt(3); // -> '삼'
        // 영일이삼사오
        // 0 1 2 3 4 5
        // -> 3번째 위치인 '삼' 이 char 타입으로 리턴


        String[] examSplit = exam.split("");
        // 문자열을 배열로 바꾸는데 문자열을 split 하여 배열에 추가한다
        // 어떤 기준으로 split 할 지 설정할 수 있는데
        // "" <- 빈 칸없이 설정하면 한 글자 씩 떼어서 배열을 만든다
        // String[] examSplit = exam.split("");   ->
        // examSplit[0] == 영
        // examSplit[1] == 일
        // examSplit[2] == 이
        // examSplit[3] == 삼
        // examSplit[4] == 사
        // examSplit[5] == 오


        List<String> examList = Arrays.asList(examSplit);
        // 배열을 List 로 바꾸고 싶다면 위의 메소드를 이용하면 편리하다
        // 결과 값은 examSplit 과 동일
        // *다만 .asList() 로 추가한 값은 변경이 안 된다


        String examCase = "anvkdEAafjadne";
        examCase = examCase.toUpperCase();
        // 문자열을 모두 대문자로 바꿔주는 메소드
        // -> ANVKDEAAFJADNE
        // String을 리턴하는 메소드이므로 좌항에서 받아줘야한다.


        examCase = examCase.toLowerCase();
        // 문자열을 모두 소문자로 바꿔주는 메소드
        // -> anvkdEAafjadne
        // String을 리턴하는 메소드이므로 좌항에서 받아줘야한다.


        String exam2 = "   앞에 공간 있고 (중간 공백은 괜찮아) 뒤에 공간 있다면??  ";
        exam2 = exam2.trim();
        // 문자열의 앞과 뒤의 비어있는 공백을 삭제해서 리턴해준다. (좌항에서 받아줘야한다)


        String exam3 = "처음 시작하는 값을 찾을 때 쓰는 메소드";
        boolean is처 = exam3.startsWith("처");  // -> true 리턴
        boolean is드 = exam3.endsWith("드");    // -> true
        boolean is음plus1 = exam3.startsWith("음", 1);     // -> true 리턴
        // 문자열의 시작 값을 boolean 값으로 확인하고 싶을 때 사용하는 메소드
        // 자매품도 있다
        // 인덱스 값을 줘서 찾을 수도 있다
        // "음" 은 1번째 값 -> true 리턴


        String exam4 = "알aa파a벳aaaaa a를 모두 aaaa ㄱ으로 바꿔보자aaa";
        exam4 = exam4.replace('a', 'ㄱ'); // -> 알ㄱㄱ파ㄱ벳ㄱㄱㄱㄱㄱ ㄱ를 모두 ㄱㄱㄱㄱ ㄱ으로 바꿔보자ㄱㄱㄱ
        // 문자열의 특정 a값을 특정 b값으로 바꿀 떄
        // 'a' -> 'ㄱ' 으로 바꿔서 리턴하므로 받아줘야한다


        String exam5 = "올 리플bbbbbbb레이스로도 바꿔보자 bbbbb";
        exam5 = exam5.replaceAll("b", "🍯"); // -> 올 리플🍯🍯🍯🍯🍯🍯🍯레이스로도 바꿔보자 🍯🍯🍯🍯🍯
        // 문자열의 특정 a값을 특정 b값으로 바꿀 때
        // "b" -> "🍯"


    }
}
