package cn.zkgamelife.gameshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurkaServerApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurkaServerApplication_7001.class,args);
    }
}
