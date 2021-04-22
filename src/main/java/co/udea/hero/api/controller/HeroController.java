package co.udea.hero.api.controller;

import co.udea.hero.api.model.Hero;
import co.udea.hero.api.service.HeroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/heroes")
public class HeroController {

    HeroService heroService;

    public HeroController(HeroService heroService){
        this.heroService=heroService;
    }

    @GetMapping("{id}")
    public ResponseEntity<List<Hero>> getHero(@PathVariable Integer id){
        return ResponseEntity.ok(heroService.getHeroes());
    }

    @GetMapping()
    public ResponseEntity<List<Hero>> getHeros(){
        return ResponseEntity.ok(heroService.getHeroes());
    }

}
