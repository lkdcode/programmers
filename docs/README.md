https://school.programmers.co.kr/learn/courses/30/lessons/120864
ProgrammersLv0_HiddenAdd

String my_string = "aAb1B2cC34oOp";
String[] num = my_string.replaceAll("[^0-9]", " ").split(" ");
[^0-9] : 0부터 9가 아니라면 " " 으로 변경하고
" "을 삭제하며 나눠서 배열에 담는다

---------------------------------------------------------------------------
외계어 사전
        for (String dics : dic) {
            boolean word = true;
            for (String spells : spell) {
                if (dics.indexOf(spells) == -1) {
                    word = false;
                    break;
                }
            }
            if (word) {
                answer = 1;
                break;
            }
        }

String.indexOf('a') a를 포함하고 있지 않다면 -1을 리턴함

---------------------------------------------------------------------------

최대 공약수

int gcd(int a, int b) {
if (b == 0) {
return a;
}
return gcd(b, a % b);
}

최소 공배수
int lcm(int a, int b){
return a * b / gcd(a,b);
}


---------------------------------------------------------------------------




---------------------------------------------------------------------------
