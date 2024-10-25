package com.example.mymoviebackend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MovieRepo  extends JpaRepository<movie,Integer> {

   @Query("select m from movie m where m.movieName =:name")
   movie findByMovieName(@Param("name")String name);
   @Query("select m from movie m where m.movieType =:type")
   List<movie> movieType(@Param("type")String type);
    
}
