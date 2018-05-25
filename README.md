# Soin (소인)
- 소규모 인테리어 시공 중개플랫폼
- 역할 - 팀장 (기획, 견적요청 폼, Header 디자인)

## 00. 프로젝트 개요
  - 기본 정보
    - 팀 프로젝트(총 7명)
    - 팀 구성방법 - 아이디어 스피치를 통한 팀 구성
  - 프로젝트 기획 상세
    - 창문 교체, 욕실 타일 시공 등 소규모 인테리어 시공만을 위한 시공 중개 O2O 서비스
    - 고객이 올린 시공 견적요청서에 시공업자들이 견적서를 제안하여 매칭시켜주는 시스템
    - 역할자 - 관리자, 고객, 시공업자
    - 참고한 서비스: 집닥, 카닥, 오늘의집

## 01. 주요 코드
  - [견적요청 Entity,Dao,View,JDBC](https://github.com/Integerous/Soin/tree/master/src/Soin/EstimateRequest)
  - [견적요청서.jsp](https://github.com/Integerous/Soin/blob/master/WebContent/WEB-INF/views/Estimate/EstimateRequestForm/Form1.jsp)
  - [견적요청서요약.jsp](https://github.com/Integerous/Soin/blob/master/WebContent/WEB-INF/views/Estimate/EstimateRequestList/List.jsp)
  - [견적요청폼.css](https://github.com/Integerous/Soin/blob/master/WebContent/Css/Style4.css)
  - [헤더.jsp](https://github.com/Integerous/Soin/blob/master/WebContent/WEB-INF/views/inc/header.jsp)
  - [헤더.css](https://github.com/Integerous/Soin/blob/master/WebContent/Css/StyleHF.css)
  
## 02. 개발 기간
- 2018.01.08 ~ 2018.03.23

## 03. 개발 환경
- Java 9.0.1
- Servlets & JSP
- Javascript ES5
- Tomcat 9.0.7
- Tiles 3.0.7
- Oracle DBMS
- Eclipse

## 04. 돌이켜보니 좋았던 점
- 해커톤 처럼 아이디어 스피치를 통해 팀을 구성하여 팀원들의 참여 의지가 높았던 점.
- 기획 단계부터 팀원의 추천으로 Trello와 같은 Kanban 스타일의 협업 도구를 사용한 점.
- Git과 Github, GitKraken을 공부해서 팀원들에게 전파하고 사용한 점.
- 팀원 각자 데이터모델링을 공부하고 개념설계-논리설계-물리설계 순으로 각자 작성 후 토론하며 완성했던 점.
- 소규모 인테리어 중개 플랫폼이라는 아이디어 그 자체(?)

## 05. 돌이켜보니 아쉬웠던 점
- 완성도가 낮아 배포할 수 없었던 점.
- Java를 배우기도 전에 프로젝트 기획이 시작되어 프로젝트 규모가 실력에 비해 거대해진 점.
- 전체 개발기간 중 기획에 쓰인 시간이 약 50% 차지하여 프로그램 작성을 위한 시간이 턱없이 부족했던 점.
- index 페이지를 7명이 모두 만들고 투표를 통해 선택하는 비효율적 방식으로 진행한 점.
- 디자인과 색상을 정하지 않아 페이지 마다 천차만별인 디자인.
- 정보처리기사 시험기간을 고려하지 못하여 팀원 별 기여도 차이가 발생한 점.
