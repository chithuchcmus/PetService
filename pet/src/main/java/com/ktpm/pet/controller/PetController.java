package com.ktpm.pet.controller;


import com.ktpm.pet.model.Accessories;
import com.ktpm.pet.model.NewsTeaser;
import com.ktpm.pet.model.PetFoodTip;
import com.ktpm.pet.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PetController {

    @Autowired
    PetService petService;

    @PostMapping(path = "/accessories")
    public ResponseEntity<Object> createAccessories(@RequestBody Accessories accessories){
        return petService.createAccessories(accessories);
    }

    @PostMapping(path = "/news-teasers")
    public ResponseEntity<Object> createNewsTeaser(@RequestBody NewsTeaser newsTeaser){
        return petService.createNewsTeaser(newsTeaser);
    }

    @PostMapping(path = "/pet-food-tips")
    public ResponseEntity<Object> createPetFoodTip(@RequestBody PetFoodTip petFoodTip){
        return petService.createPetFoodTip(petFoodTip);
    }

    @GetMapping(path = "/accessories/{id}")
    public ResponseEntity<Object> findAccessoriesByID(@PathVariable Integer id){
        return petService.findAccessoriesById(id);
    }

    @GetMapping(path = "/news-teasers/{id}")
    public ResponseEntity<Object> findNewsTeaserByID(@PathVariable Integer id){
        return petService.findNewsTeaserById(id);
    }

    @GetMapping(path = "/pet-food-tips/{id}")
    public ResponseEntity<Object> findPetFoodTipByID(@PathVariable Integer id){
        return petService.findPetFoodTipById(id);
    }
}
