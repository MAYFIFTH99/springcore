package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonServiceTest {
    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    public void singletonServiceTest(){
        // new SingletonService();

        //1. 조회 : 호출할 때마다 같은 객체 반환
        SingletonService singletonService1 = SingletonService.getInstance();
        //2. 조회 : 호출할 때마다 같은 객체 반환
        SingletonService singletonService2 = SingletonService.getInstance();

        //참조값 확인
        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);

        // singletonService1 == singletonService2
        Assertions.assertThat(singletonService1).isSameAs(singletonService2);

        singletonService1.logic();
    }
}