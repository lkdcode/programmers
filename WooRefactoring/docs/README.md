## 🎯Problem1

┌────┬── [✅] pobi 의 왼쪽 페이지 번호를 담을 정수 선언 [Controller#pobiLeftNumber]
│....├── [✅] <Exception> 시작 면이나 마지막 면이 아닌지 확인한다. [problemOne#validateNumber#startOrLast]
│....└── [✅] <Exception> 홀수인지 확인한다. [validateNumber]
├────┬── [✅] pobi 의 오른쪽 페이지 번호를 담을 정수 선언 [pobiRightNumber]
│....├── [✅] <Exception> 짝수인지 확인한다. [validateNumber]
│....└── [✅] <Exception> 페이지 `pobiLeftNumber +1` == `pobiRightNumber` 성립하는지 확인 한다. [validateNumber]
├────┬── [✅] crong 의 왼쪽 페이지 번호를 담을 정수 선언 [crongLeftNumber]
│....├── [✅] <Exception> 시작 면이나 마지막 면이 아닌지 확인한다. [validateNumber]
│....└── [✅] <Exception> 홀수인지 확인한다. [validateNumber]
├────┬── [✅] crong 의 오른쪽 페이지 번호를 담을 정수 선언 [crongRightNumber]
│....├── [✅] <Exception> 짝수인지 확인한다. [validateNumber]
│....└── [✅] <Exception> 페이지 `crongLeftNumber +1` == `crongRightNumber` 성립하는지 확인 한다. [validateNumber]
├─────── [✅] pobi 의 첫 번째 페이지의 각 자리의 덧셈과 곱셈 중 큰 수 [CalNumber]
├─────── [✅] pobi 의 두 번째 페이지의 각 자리의 덧셈과 곱셈 중 큰 수 [CalNumber]
├─────── [✅] crong 의 첫 번째 페이지의 각 자리의 덧셈과 곱셈 중 큰 수 [CalNumber]
├─────── [✅] crong 의 두 번째 페이지의 각 자리의 덧셈과 곱셈 중 큰 수 [CalNumber]
├─────── [✅] 두 페이지의 덧셈과 곱셈을 비교해서 가장 큰 수를 저장할 정수 선언 [pobiNumber]
├─────── [✅] 두 페이지의 덧셈과 곱셈을 비교해서 가장 큰 수를 저장할 정수 선언 [crongNumber]
└─────── [✅] 포비 번호와 크롱 번호를 비교 한다. 포비 승리 1, 크롱 승리 2, 무승부 0, 예외 사항 -1

## 🎯Problem2

┌─────── [✅] 주어진 문자열을 선언 [result]
├─────── [✅] 문자열의 중복된 위치 값을 저장하는 메소드 [skipNumber]
├─────── [✅] 중복된 위치 값을 넘기고 문자열을 선언 [removeDuplication]
└─────── [✅] 중복된 문자가 존재하는지 확인한다. [validateDuplication]

## 🎯Problem3

──────── [✅] 주어진 숫자를 [for] 문으로 문자열에 추가 후 문자열의 문자가 "3", "6", "9" 일 경우 answer++