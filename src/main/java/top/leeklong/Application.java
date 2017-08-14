package top.leeklong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by pc on 2017/5/4.
 */
@SpringBootApplication
//@ComponentScan(basePackages ={"top.leeklong"} )
public class Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.run(args);
    }
}
