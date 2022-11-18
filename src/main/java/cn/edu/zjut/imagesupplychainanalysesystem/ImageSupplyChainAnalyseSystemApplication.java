package cn.edu.zjut.imagesupplychainanalysesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
@EnableNeo4jRepositories
public class ImageSupplyChainAnalyseSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageSupplyChainAnalyseSystemApplication.class, args);
	}

}
