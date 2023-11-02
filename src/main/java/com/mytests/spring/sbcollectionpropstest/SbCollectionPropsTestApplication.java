package com.mytests.spring.sbcollectionpropstest;


import com.mytests.spring.sbcollectionpropstest.data.Person;
import com.mytests.spring.sbcollectionpropstest.data.TestEnum;
import com.mytests.spring.sbcollectionpropstest.props.CustomProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbCollectionPropsTestApplication {

    public static void main(String[] args) {
		final ConfigurableApplicationContext context = SpringApplication.run(SbCollectionPropsTestApplication.class, args);
		final CustomProperties customProperties = context.getBean(CustomProperties.class);
		for (Person person : customProperties.getPeople()) {
			System.out.println(person);
		}
		for (TestEnum anEnum : customProperties.getEnums()) {
			System.out.println(anEnum);
		}
		System.out.println(customProperties.getTask());
	}

}
