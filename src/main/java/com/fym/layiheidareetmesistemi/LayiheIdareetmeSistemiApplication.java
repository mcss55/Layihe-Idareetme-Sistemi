package com.fym.layiheidareetmesistemi;

import com.fym.layiheidareetmesistemi.View.LoginScreen;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.awt.*;


@SpringBootApplication
@EntityScan(basePackages = "com.fym.layiheidareetmesistemi.Models")
@EnableJpaRepositories(basePackages = "com.fym.layiheidareetmesistemi.Repositories")
@EnableTransactionManagement
public class LayiheIdareetmeSistemiApplication {

    static ConfigurableApplicationContext ctx;

    public static void main(String... args) {
        ctx = new SpringApplicationBuilder(LayiheIdareetmeSistemiApplication.class)
                .headless(false).run(args);

        EventQueue.invokeLater(() -> {
            var ex = ctx.getBean(LoginScreen.class);
            ex.setVisible(true);
        });

    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
