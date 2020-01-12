package com.ktpm.pet.repository;

import com.ktpm.pet.model.Accessories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessoriesRepository extends JpaRepository<Accessories, Integer> {
    Accessories findAccessoriesById(Integer id);
}
