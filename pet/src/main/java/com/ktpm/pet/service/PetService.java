package com.ktpm.pet.service;

import com.ktpm.pet.model.Accessories;
import com.ktpm.pet.model.NewsTeaser;
import com.ktpm.pet.model.PetFoodTip;
import org.springframework.http.ResponseEntity;

public interface PetService {
    ResponseEntity<Object> createAccessories(Accessories accessories);
    ResponseEntity<Object> findAccessoriesById(Integer id);

    ResponseEntity<Object> createNewsTeaser(NewsTeaser newsTeaser);
    ResponseEntity<Object> findNewsTeaserById(Integer id);

    ResponseEntity<Object> createPetFoodTip(PetFoodTip petFoodTip);
    ResponseEntity<Object> findPetFoodTipById(Integer id);
}
