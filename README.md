# design-pattern

**J2EE pattern**

![](http://www.corej2eepatterns.com/images/CJP2Catalog.gif)

J2EE 패턴을 기반으로 스프링 프레임워크가 만들어졌다고 한다.

핵심 패턴들을 공부해보며 다음 단계인 스프링 core에 다가가 보도록 하자.

참고

[Java J2EE Design Patterns](https://stackabuse.com/java-j2ee-design-patterns/)

위 사이트에선 8개의 패턴을 소개하고 있다.

1. MVC Pattern
2. Business Delegate Pattern
3. Composite Entity Pattern
4. Data Access Object Pattern
5. Front Controller Pattern
6. Intercepting Filter Pattern
7. Service Locator Pattern
8. Transfer Object Pattern

### 1. MVC Pattern

Model-View-Controller 의 약자.

**Model** 은 POJO 객체이다.

**Views** 는 Model에 있는 정보를 표현한다.

user-friendly way 하게 정보를 표현해줄 책임이 있다.

**Controller**는 Model과 View 사이의 연결고리 역할이다. Model을 업데이트하거나 지우거나 View로 데이터를 전달하는 등의 역할을 한다.

### 2. Business Delegate Pattern

이 패턴은 비즈니스 계층으로부터 표현 계층과의 의존성을 떨어뜨리기 위해 사용되며 이는 클라이언트와 비즈니스 관계에서 요청 수를 최소화 할 수 있다.

샘플 코드보면 Client는 비즈니스 로직이 달라지는 상황에서도 BusinessDelegate에게 일관된 방식으로 처리를 요청한다. 

BusinessDelegate는 LookUp이란 클래스로부터 세부 구현체를 찾아 로직을 위임한다.

### 3. Composite Entity Pattern

이 패턴은 엔티티의 그래프를 표현한다. 그것은 업데이트되거나 그래프 상에서 의존된 엔티티들의 변경을 트리거링한다.

지금은 Spring Framework으로 대체된 EJB 에서 주로 쓰였다.

### 4. Data Access Object Pattern

DAO 패턴이라 주로 불리며, Data Layer와 커뮤니케이션하는 객체가 있다.

DAO 객체들은 이러한 목적으로 종종 SessionFactories를 인스턴스화 하여 데이터베이스와 통신하는 로직을 처리한다.

스탠다드 프랙티스로는 DAO interface를 만들고 구현체를 만드는 것이다.

### 5. Front Controller Pattern

요청에 대해서 프론트 컨트롤러는 가장 처음에 도달하는 컨트롤러이다. 요청에 대해 어떤 컨트롤러가 핸들링 할지 결정하며 선택된 컨트롤러로 요청을 전달한다.

Dispatcher Servlet 이라는 이름으로 웹 어플리케이션에서 사용되고 있다. (spring mvc)

로깅이나 인증 처리 과정도 집중적으로 처리할 수 있으니 장점이 있다.

### 6. Intercepting Filter Pattern

요청이 처리를 위해 적절한 컨트롤러로 전달되기 전에 필터가 사용됩니다. 이러한 필터는 필터 체인 형식으로 존재할 수 있으며 여러 필터를 포함하거나 단순히 하나의 필터로 존재할 수 있습니다.

그럼에도 불구하고 인증, 인가, 브라우저 지원이나 요청 패스가 어느 제한이나 제약 사항에 위배되는지 검사한다.

### 7. Service Locator Pattern

웹 어플리케이션에서 종종 보여진다. Service Consumer와 DAO 구현체 등과 같은 구체 클래스들과의 의존을 낮춘다.

패턴은 적절한 서비스를 찾고, 요청 수를 줄이기 위해 캐시 스토리지에 저장하여 서버의 부담을 줄이고 애플리케이션에 인스턴스를 제공합니다.

구현체를 보니깐 ApplicationContext 랑 비슷한 것 처럼 보인다.

### 8. Transfer Object Pattern

데이터를 전송하는 목적으로만 사용되는 객체를 만들어 사용한다. 따라서 serializable POJOs 이다.

getter, setter 가 있고 no other logic 이다.

포스트를 공부하며 Spring MVC를 사용할 때 당연시 여겼던 것들이 오래 전 패턴으로 제시되던 것들이었다는 게 새삼 신기했다.

스프링의 내부를 이해하는 것은 먼 길일 것 같았는데 초기의 J2EE 패턴들을 살펴보니 친숙해 질 수 있을 것 같다. 

다음엔 본격적으로 spring core 에서 사용된 디자인 패턴들을 학습해 볼 예정이다.