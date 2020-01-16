package com.ktpm.pet.manager;

import com.google.gson.Gson;
import com.ktpm.pet.constant.TransStatusEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ResponseManager {
    private static Gson gson= new Gson();

    public static ResponseEntity<Object> getResponse(Object object, TransStatusEnum transStatusEnum){
        if(object == null ){
            return new ResponseEntity<>("something wrong",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(gson.toJson(object),HttpStatus.OK);
    }
    public static ResponseEntity<Object> getResponse(TransStatusEnum transStatusEnum){
        switch (transStatusEnum) {
            case INVALID_REQUEST:
                return new ResponseEntity<>("Invalid request", HttpStatus.BAD_REQUEST);
            case GET_ACCESSORIES_FAIL:
                return new ResponseEntity<>(TransStatusEnum.GET_ACCESSORIES_FAIL.getStatus(), HttpStatus.BAD_REQUEST);
            case GET_NEWS_TEASER_FAIL:
                return new ResponseEntity<>(TransStatusEnum.GET_NEWS_TEASER_FAIL.getStatus(), HttpStatus.BAD_REQUEST);
            case GET_PET_FOOD_TIP_FAIL:
                return new ResponseEntity<>(TransStatusEnum.GET_PET_FOOD_TIP_FAIL.getStatus(), HttpStatus.BAD_REQUEST);
            case CREATE_ACCESSORIES_FAIL:
                return new ResponseEntity<>(TransStatusEnum.CREATE_ACCESSORIES_FAIL.getStatus(), HttpStatus.BAD_REQUEST);
            case CREATE_PET_FOOD_TIP_FAIL:
                return new ResponseEntity<>(TransStatusEnum.CREATE_PET_FOOD_TIP_FAIL.getStatus(), HttpStatus.BAD_REQUEST);
            case CREATE_NEWS_TEASER_FAIL:
                return new ResponseEntity<>(TransStatusEnum.CREATE_NEWS_TEASER_FAIL.getStatus(), HttpStatus.BAD_REQUEST);
        }
        return null;
    }
}
