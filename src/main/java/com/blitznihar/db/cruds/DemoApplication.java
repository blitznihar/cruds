package com.blitznihar.db.cruds;

import com.blitznihar.db.services.AppProperties;
import com.blitznihar.db.services.EmployeeService;
import com.blitznihar.db.services.IEmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = "com.blitznihar.db")
@PropertySource("classpath:app.properties")
public class DemoApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		IEmployeeService employeeService = (EmployeeService)ctx.getBean(EmployeeService.class);
		AppProperties appProperties = (AppProperties)ctx.getBean(AppProperties.class);
		int empId = appProperties.returnEmployeeId();
		LOGGER.info("Some Info {}",empId);
		employeeService.updateCalls(empId);
	}

}
