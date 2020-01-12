package com.ktpm.pet.service;

import com.ktpm.pet.constant.TransStatusEnum;
import com.ktpm.pet.manager.ResponseManager;
import com.ktpm.pet.model.Accessories;
import com.ktpm.pet.model.NewsTeaser;
import com.ktpm.pet.model.PetFoodTip;
import com.ktpm.pet.repository.AccessoriesRepository;
import com.ktpm.pet.repository.NewsTeaserRepository;
import com.ktpm.pet.repository.PetFoodTipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    AccessoriesRepository accessoriesRepository;
    @Autowired
    NewsTeaserRepository newsTeaserRepository;
    @Autowired
    PetFoodTipRepository petFoodTipRepository;

    @Override
    public ResponseEntity<Object> createAccessories(Accessories accessories) {
        if(accessories == null)
            return ResponseManager.getResponse(TransStatusEnum.CREATE_ACCESSORIES_FAIL);
        try {
            Accessories accessoriesInDB = accessoriesRepository.save(accessories);
            return ResponseManager.getResponse(accessoriesInDB,TransStatusEnum.CREATE_ACCESSORIES_SUCCESSFUL);
        }
        catch (Exception e){
            return ResponseManager.getResponse(TransStatusEnum.CREATE_ACCESSORIES_FAIL);
        }
    }

    @Override
    public ResponseEntity<Object> findAccessoriesById(Integer id) {
        if(id == null || id < 0)
            return ResponseManager.getResponse(TransStatusEnum.GET_ACCESSORIES_FAIL);

        Accessories accessoriesInDB = accessoriesRepository.findAccessoriesById(id);
        if(accessoriesInDB == null)
            return ResponseManager.getResponse(TransStatusEnum.CREATE_ACCESSORIES_SUCCESSFUL);
        return ResponseManager.getResponse(accessoriesInDB,TransStatusEnum.GET_ACCESSORIES_SUCCESSFUL);
    }

    @Override
    public ResponseEntity<Object> createNewsTeaser(NewsTeaser newsTeaser) {
        if(newsTeaser == null)
            return ResponseManager.getResponse(TransStatusEnum.CREATE_NEWS_TEASER_FAIL);
        try {
            NewsTeaser newsTeaserInDB = newsTeaserRepository.save(newsTeaser);
            return ResponseManager.getResponse(newsTeaserInDB,TransStatusEnum.CREATE_NEWS_TEASER_SUCCESSFUL);
        }
        catch (Exception e){
            return ResponseManager.getResponse(TransStatusEnum.CREATE_NEWS_TEASER_FAIL);
        }    }

    @Override
    public ResponseEntity<Object> findNewsTeaserById(Integer id) {
        if(id == null || id < 0)
            return ResponseManager.getResponse(TransStatusEnum.GET_NEWS_TEASER_FAIL);

        NewsTeaser newsTeaserInDB = newsTeaserRepository.findNewsTeaserById(id);
        if(newsTeaserInDB == null)
            return ResponseManager.getResponse(TransStatusEnum.GET_NEWS_TEASER_FAIL);
        return ResponseManager.getResponse(newsTeaserInDB,TransStatusEnum.GET_NEWS_TEASER_SUCCESSFUL);
    }

    @Override
    public ResponseEntity<Object> createPetFoodTip(PetFoodTip petFoodTip) {
        if(petFoodTip == null)
            return ResponseManager.getResponse(TransStatusEnum.CREATE_PET_FOOD_TIP_FAIL);
        PetFoodTip petFoodTipInDB = petFoodTipRepository.save(petFoodTip);
        if(petFoodTipInDB == null)
            return ResponseManager.getResponse(TransStatusEnum.CREATE_PET_FOOD_TIP_FAIL);
        return ResponseManager.getResponse(petFoodTipInDB,TransStatusEnum.CREATE_PET_FOOD_TIP_SUCCESSFUL);
    }

    @Override
    public ResponseEntity<Object> findPetFoodTipById(Integer id) {
        if(id == null || id < 0){
            return ResponseManager.getResponse(TransStatusEnum.GET_PET_FOOD_TIP_FAIL);
        }
        try {
            PetFoodTip petFoodTip = petFoodTipRepository.findPetFoodTipById(id);
            return ResponseManager.getResponse(petFoodTip,TransStatusEnum.GET_PET_FOOD_TIP_SUCCESSFUL);
        }catch (Exception e){
            return ResponseManager.getResponse(TransStatusEnum.GET_PET_FOOD_TIP_FAIL);
        }
    }
}
