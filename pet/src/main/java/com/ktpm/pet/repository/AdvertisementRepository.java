package com.ktpm.pet.repository;

import com.ktpm.pet.model.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement,Integer> {
     Advertisement findAdvertisementById(Integer id);

     @Override
     List<Advertisement> findAll();
}
