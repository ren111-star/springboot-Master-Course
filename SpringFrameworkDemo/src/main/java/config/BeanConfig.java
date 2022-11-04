package config;

import demo.Doctor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfig {
//    如果我们使用了其他的作用域，就不能如下定义
    @Bean(initMethod = "initMethod")
    public Doctor doctor () {
        return new Doctor();
    }
}
