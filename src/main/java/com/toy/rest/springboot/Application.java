package com.toy.rest.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    앞으로 이 클래스는 메인 클래스가 된다.
    @SpringBootApplication으로 인해 스프링 부트의 자동설정 ,스프링 Bean 읽기와 생성을 모두 자동을 설정된다.
    특히 @SpringBootApplication이 있는 위치부터 설정을 읽어가기 때문에 항상 프로젝트 최상단에 위치해야한다.

    SpringBootApplication.run으로 인해 내장 WAS를 실행한다.
*/
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
