https://school.programmers.co.kr/learn/courses/30/lessons/120864
ProgrammersLv0_HiddenAdd

String my_string = "aAb1B2cC34oOp";
String[] num = my_string.replaceAll("[^0-9]", " ").split(" ");
[^0-9] : 0부터 9가 아니라면 " " 으로 변경하고
" "을 삭제하며 나눠서 배열에 담는다

---------------------------------------------------------------------------

