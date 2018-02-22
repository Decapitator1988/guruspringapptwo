package com.decapitator.guruspringapptwo;

import com.decapitator.guruspringapptwo.controllers.ConstructorInjectedController;
import com.decapitator.guruspringapptwo.controllers.GetterInjectedController;
import com.decapitator.guruspringapptwo.controllers.MyController;
import com.decapitator.guruspringapptwo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;

import java.util.PrimitiveIterator;

@SpringBootApplication
public class GuruspringapptwoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GuruspringapptwoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");


		System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        	}
}
