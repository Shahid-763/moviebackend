package com.example.mymoviebackend;
// import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movies")

public class movie {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int movieId;
     @NotNull(message = "movie name is required")
     private String movieName;
     @NotNull(message = "movie genre is required")
     private String movieGenre;
     @NotNull(message = "movie type is required")
     private String movieType;
     @Column(name = "movie_rating")
     private int movieRating;
     private String movieimage;

}
