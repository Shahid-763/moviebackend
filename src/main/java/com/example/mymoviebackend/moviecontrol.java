package com.example.mymoviebackend;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
// @RequiredArgsConstructor
public class moviecontrol {
    public movieserv s;
    public moviecontrol(movieserv s) {
        this.s=s;   
    }
    @PostMapping("/save")
    public movie save(@Valid @RequestBody movie b){
        return s.save(b);
    }
    @PostMapping("/saveAll")
    public List<movie> saveAll(@RequestBody List<movie> b){
        return s.saveAll(b);
    }
    @PostMapping("/findByName/{n}")
    public movie findByMovieName(@PathVariable String n){
        return s.findbyMovieName(n);
    }
    @GetMapping("/movieType/{n}")
    public List<movie> movieType(@PathVariable String n){
        return s.movieType(n);
    }
    
}
