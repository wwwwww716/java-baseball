# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

[ ] ComputerNumber : 1-9 사이의 서로 다른 세자리 숫자 생성
[ ] InputView : 게임 시작 시 유저 인풋 받기, 게임 종료 시 재시작 인풋 받기
[ ] UserNumber : 유저 인풋 받아서 숫자로 변환하고, 리스트 콜렉션에 저장
[x] ValidationUtils 
 [x] isValidLength : 유저 인풋 길이가 3인지 검사
 [x] isValidRange : 유저 인풋 1-9사이 숫자만 입력했는지 검사
 [x] isNotDuplicate : 유저 인풋 중복 없는지 검사
 [x] isValidExitNumber : 종료 인풋 유효한 숫자 입력했는지 검사 (1,2만 입력가능)
[ ] Ball : strike, ball, nothing 판정