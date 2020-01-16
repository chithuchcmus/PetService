package com.ktpm.pet.repository;

import com.ktpm.pet.model.PetFoodTip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetFoodTipRepository  extends JpaRepository<PetFoodTip,Integer> {
    PetFoodTip findPetFoodTipById(Integer Id);

    @Override
    List<PetFoodTip> findAll();
}
