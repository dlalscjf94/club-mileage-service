# 트리플여행자 클럽 마일리지 서비스

트리플 사용자들이 장소에 리뷰를 작성할 때 포인트를 부여하고, 전체/개인에 대한 포인트 부여 히스토리와 개인별누적 포인트를 관리하고자 합니다.

## SPECIFICATIONS 

> 리뷰 작성이 이뤄질때마다 리뷰 작성 이벤트가 발생하고, 아래 API로 이벤트를 전달합니다.

```java
POST /events

{
  "type" : "REVIEW",
  "action" : "ADD", /* "MOD", "DELETE" */
  "reviewId" : "240a0658-dc5f-4878-9381-ebb7b2667772",
  "content" : "좋아요!",
  "attachedPhotoIds" : [ "e4d1a64e-a531-46de-88d0-ff0ed70c0bb8", "afb0cef2-851d-4a50-bb07-9cc15cbdc332" ],
  "userId" : "3ede0ef2-92b7-4817-a5f3-0c575361f745",
  "placeId" : "2e4baf1c-5acb-4efb-a1af-eddada31b00f"
}
```
## 요구사항 
- 이 서비스를 위한 SQL(MySQL >= 5.7) 스키마를 설계해 주세요. 테이블과 인덱스에 대한 DDL이 필요합니다.
- 아래 API를 제공하는 서버 애플리케이션을 작성해 주세요.
  - POST /events 로 호출하는 포인트 적립 API  
  - 포인트 조회 API
- 상세 요구사항
  - REST API를 제공하는 서버 애플리케이션을 구현해 주세요.
  - 프로그래밍 언어는 Java, Kotlin, Python, JavaScript(혹은 TypeScript) 중에서 선택, => Java
  - Framework, Library는 자유롭게 사용할 수 있어요. 추가의 Data Storage가 필요하다면 여러 종류 사용 가능
  - 테스트 케이스를 작성하면 좋음
  - 어플리케이션 실행 방법을 README 파일에 명세

## 주요 사용 프레임워크 / 라이브러리 및 버전

- Spring Boot 2.7.6
    - Querydsl JPA 5.0.0
    - Swagger 3(API 문서화)
- Java 8
- Gradle 7.4.1
- MySQL (8.0.29) (InnoDB)
- Docker & docker compose (MySQL 컨테이너 실행)

## ERD 

요구사항을 바탕으로 ERD 작성(draw.io 사용)
![club-mileage](https://user-images.githubusercontent.com/30383018/208692388-a82622b7-b7fa-404b-8098-883f02ff2e4c.JPG)

## 실행방법 및 실행 확인

docker-compose.yml의 경로로 이동한뒤에  `docker compose`로 MySQL 컨테이너를 실행합니다. 
```bash
$ docker compose up
```
컨테이너가 준비됐다면 스프링 애플리케이션을 빌드 후 실행합니다.

## Swagger 및 DB-adminer를 통한 직접 확인

# DB-adminer
http://localhost:18080/triple?server=database-mysql&username=lmc&db=triple

# Swagger
http://localhost:8080/swagger-ui/index.html#/

