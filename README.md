# quick_draw 프로젝트 -> BE 파트

### ➡️ 개요 
- quick_draw의 BackEnd 서버 기동을 위한 프로그램
- 외부 프로그램(Python)에서 사용자가 그린 그림을 보고 예측한 내용을 결과로서 반환한다

### ➡️ 기능 설명
- **환경 변수 설정** : [외부 프로그램의 위치 | 이미지 파일을 저장할 위치]
- 외부 프로그램(Python)을 실행시켜 예측 결과를 받아온다
- 사용자가 제출한 이미지 파일을 저장한다.

### ➡️ 코드 리뷰
- **PredictService** : 외부 프로그램(Python)을 실행시키고 결과 값을 받아옵니다
- **TruncateService** : 매일 자정을 기준으로 저장한 모든 이미지 파일 삭제 -> 서버 메모리 부족 현상을 방지

#### ✅ Simple 코드 리뷰 이미지
![Class](https://github.com/KimMarinet/quick_draw_be/blob/master/img/Class%20Diagram.png)

#### ✅ 업로드된 이미지 파일
<p align="center"><img src="https://github.com/KimMarinet/quick_draw_be/blob/master/img/uploads.png" width="800"/></p>
