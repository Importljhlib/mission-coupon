# 2주차 미션 - 쿠폰

## 구현 기능 목록

    - 회원 등록
        - 이름, 전화번호 입력
    - 쿠폰 검색
        - 전화번호 조회
            - 안 겹치는 경우 -> 회원 Y/N
            - 겹치는 경우 -> 이름 조회
        - 쿠폰 개수 출력
    - 쿠폰 적립
        - 쿠폰 개수 입력
    - 쿠폰 사용
        - 사용할 쿠폰 개수 입력
    - 예외처리

### Flow Chart

```mermaid
sequenceDiagram
    participant View
    participant Controller
    participant Model
    Controller ->> View: 기능 선택
    View ->> Controller: 기능 번호 반환
    Controller ->> View: 기능 실행
    
alt 회원 등록
    View ->> Controller: 이름 정보 전달
    View ->> Controller: 전화번호 정보 전달
    Controller ->> Model: 정보 등록
    Model ->> Controller: 정보 등록 완료
    Controller ->> View: 정보 등록 완료 메시지
end

alt 쿠폰 검색
    View ->> Controller: 전화번호 정보 전달
    Controller ->> Model: 번호 전달 및 중복 확인
    Model ->> Controller: 중복 여부 전달
    alt 중복 o
        Controller ->> Model: 중복 이름 전달 요청
        Model ->> Controller: 중복 이름 전달
        Controller ->> View: 이름 입력창 및 중복 이름 목록 출력 
    else 중복 x
        Controller ->> View: 회원 여부 체크(이름) 출력
        View ->> Controller: 회원 여부 전달 (N일시 처음으로)
    end
    View ->> Controller: 이름 전달
    Controller ->> Model: 이름 전달 및 쿠폰 개수 요청
    Model ->> Controller: 쿠폰 개수 반환
    Controller ->> View: 쿠폰 개수 출력 요청
end

alt 쿠폰 적립
    View ->> Controller: 쿠폰 검색 함수 실행 요청
    
    View ->> Controller: 적립할 쿠폰 개수 전달
    Controller ->> Model: 쿠폰 개수 저장 
    Model ->> Controller: 쿠폰 개수 저장 완료 전달
    Controller ->> View: 적립 완료 메시지 출력
end

alt 쿠폰 사용
    View ->> Controller: 쿠폰번호 전달
    Controller ->> Model: 번호 전달 및 이름 찾기
    Model ->> Controller: 이름 리스트 전달
    Controller ->> View: 이름 리스트 및 이름 입력창 출력
    View ->> Controller: 이름 전달
    Controller ->> Model: 쿠폰 개수 요청
    Model ->> Controller: 쿠폰 개수 전달
    Controller ->> View: 쿠폰 개수 출력
    View ->> Controller: 사용할 쿠폰 개수 전달
    Controller ->> Model: 쿠폰 사용 처리
    Model ->> Controller: 쿠폰 사용 완료
    Controller ->> View: 사용 완료 메시지 출력
end
```

함수를 짜다가 겹치는 기능이 있으면 하나로 합치기.