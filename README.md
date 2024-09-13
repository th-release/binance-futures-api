# Binance-futures-api

## 목차
1. [기능 소개](#기능-소개)
2. [설치 방법](#설치-방법)
3. [사용 방법](#사용-방법)
4. [문서 참고](#문서-참고)

## 기능 소개

이 라이브러리는 다음과 같은 주요 기능들을 제공합니다:

- **accountInformation**: 계정 정보 조회
- **getOrder**: 단일 주문 정보 조회
- **getOrderAll**: 모든 주문 정보 조회
- **newOrder**: 새 주문 생성
- **setLeverage**: 레버리지 설정
- **setMarginType**: 마진 타입 설정
- **setPositionMode**: 포지션 모드 설정 (단일/헤지 모드)

이 모든 기능은 Java JDK 17을 사용하여 구현되었습니다.

## 설치 방법

### 필수 사항
- Java JDK 17 이상
- Maven 또는 Gradle

### 설치

1. 프로젝트를 클론한 후 필요한 라이브러리를 설치하세요.

```bash
git clone https://github.com/th-release/binance-futures-api.git
cd binance-futures-api
```

### 중요: 
`binance-futures-api/src/main/java/com/binance
/utils/`에서 파일을 가져가주세요.
```gradle
    implementation "io.github.binance:binance-futures-connector-java:3.0.4"
    implementation 'com.google.code.gson:gson:2.10.1'
    compileOnly 'org.projectlombok:lombok:1.18.30'
```
해당 패키지를 모두 설치해주세요.

## 사용 방법

```java
public class Main {
    public static void main(String[] args) {
        // client 생성
        Client client = new Client("api", "secret");

        System.out.println(client.getBaseUrl());
    }
}
```

## 문서 참고
https://developers.binance.com/docs/derivatives/usds-margined-futures/general-info
