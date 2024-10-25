package com.example.mymoviebackend;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.mymoviebackend.movie;
@Service
public class movieserv {
    public MovieRepo s;
    private final Logger log= LoggerFactory.getLogger(movieserv.class);
    public movieserv(MovieRepo s) {
        this.s=s;
    }
    
    public movie save(movie n){
    log.info("save method");
    return s.save(n);
  } 
  public List<movie> saveAll(List<movie> n) {
    log.info("saveAll method");
    return s.saveAll(n);
  }
  @Cacheable(value = "movie", key = "#n")
  public movie findbyMovieName(String n) {
         return s.findByMovieName(n);
     }
  public List<movie> movieType(String n) {
    log.info("movieType method");
    return s.movieType(n);
  }
  // @Scheduled(fixedRate = 6000) 
  // public void scheduledSaveMovies() {
      // List<movie> moviesToSave = List.of(
          // new movie("The Shawshank Redemption", "Drama", "movie", 9.0, "https://www.imdb.com/title/tt0111161/"),
          // new movie("The Godfather", "Drama", "movie", 9.0, "https://www.imdb.com/title/tt0068646/")
      // );

      // log.info("Scheduled saveMovies method");
      // saveAll(moviesToSave);
  // }
}

