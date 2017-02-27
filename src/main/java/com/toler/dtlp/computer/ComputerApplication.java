package com.toler.dtlp.computer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.toler.dtlp.computer.dao.ComputerDao;
import com.toler.dtlp.computer.domain.Computer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ComputerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputerApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(ComputerDao computerDao) {
		return args -> {
			computerDao.save(new Computer(1l, "Storm Trooper", 1199.99, "High performance gaming PC with a GTX 1070 graphics card, 8GB of Ram, an Intel i5 7600k, and Windows 10.", "https://www.sideshowtoy.com/wp-content/uploads/2015/09/star-wars-first-order-stormtrooper-sixth-scale-hot-toys-feature-902536.jpg", 1l));
			computerDao.save(new Computer(2l, "Jedi Master", 1999.99, "High performance gaming PC with a GTX 1080 graphics card, 16GB of Ram, an Intel i7 7700k, and Windows 10.", "http://vignette2.wikia.nocookie.net/starwars/images/d/df/Masterobiwan.jpg/revision/latest/scale-to-width-down/220?cb=20080719000305", 2l));
		};
	}
}
