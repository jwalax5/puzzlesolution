package com.puzzlesolution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Main {

    static Board board;

    public static void main(String[] args) {
        System.out.println("Start over here");

        SpringApplication.run(Main.class, args);
        /*todo 1. create enum for orb , shape ,
               2. create solution
               -> bfs( 4 direction)
               -> swap
               -> check if iscancelable(if same color with neigbor -> dfs -> check sharp) -> yes : cancel -> drop -> check
                                                                                              no : loop bfs


        * */

        //board = new Board(Board.Size.NORMAL);
    //    List<com.puzzlesolution.Result> results = new com.puzzlesolution.Solution().run();
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}
