package com.hafdiserver;

import com.hafdiserver.dao.HafdiDao;
import com.hafdiserver.model.Schiffsname;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class HafdiServerApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		HafdiDao dao = (HafdiDao) ctx.getBean("mydao");
		Schiffsname ruderboot = new Schiffsname("Ruderboot 2");
		dao.saveSchiff(ruderboot);
		SpringApplication.run(HafdiServerApplication.class, args);
	}
}
