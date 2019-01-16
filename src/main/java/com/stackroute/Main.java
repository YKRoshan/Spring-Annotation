package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

 public static void main(String [] args){
     //AnnotationConfigApplicationContext context1 =new AnnotationConfigApplicationContext(AppConfig.class);
    AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
     context.register(AppConfig.class);
     context.refresh();
     Movie movie1 = (Movie) context.getBean("movie1");
     System.out.println(movie1.getActor());

     /*Movie movie = (Movie) context.getBean("getMovieBean1");
     System.out.println(movie.getActor());
     Movie movie1 = (Movie) context.getBean("movie2");
     System.out.println(movie1.getActor());
//   */  Movie movie = (Movie) context.getBean("movie");
//     System.out.println(movie.getActor().getAge());
 }

}
