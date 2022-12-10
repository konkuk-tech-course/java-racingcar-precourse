# 기능 목록

## domain
- [x] Car
    - [x] 필드, 생성자, getter 구현
    - [x] 전진 메서드 구현
- [x] Game 
    - [x] 필드, 생성자
    - [x] 자동차 추가 기능
    - [x] 자동차들의 이름 반환 기능
    - [x] control 기능
    - [x] 우승자 제공 기능
    - [x] 게임 상황 Map 반환 기능

## Service
- [x] GameService
    - [x] playRound 기능
    - [x] 게임 상황 반환 기능
    - [x] 게임 생성 기능
    - [x] 게임 play 기능

## View
- [x] InputView
    - [x] 자동차 이름 입력 기능
        - [x] 구분자 기준 String 파싱
        - [x] 파싱된 요소 별로 view validation 기능 구현
        - [x] 자동차 이름 입력 메서드 작성
    - [x] 시도 횟수 입력 기능
        - [x] 숫자 입력 검증 기능
        - [x] 시도 횟수 입력 메서드 작성
- [x] OutputView
    - [x] printResult 기능
    - [x] 우승자 출력 기능

## Controller
- [x] GameController
    - [x] 게임 생성 기능
    - [x] 게임 진행 기능
    - [x] 게임 종료 기능

## main
- [x] 메인 메서드 작성








# 역할 설명
## domain
- User
    - 필드
        - name
        - 전진 수
- Game
    - 필드
        - 이동 횟수
        - Cars
    - 메서드