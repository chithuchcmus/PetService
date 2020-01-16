package com.ktpm.pet.constant;

import java.util.HashMap;
import java.util.Map;

public enum  TransStatusEnum {
        CREATE_ACCESSORIES_SUCCESSFUL("CREATE_ACCESSORIES_SUCCESSFUL"),
        CREATE_ACCESSORIES_FAIL("CREATE_ACCESSORIES_FAIL"),
        GET_ACCESSORIES_SUCCESSFUL("GET_ACCESSORIES_SUCCESSFUL"),
        GET_ACCESSORIES_FAIL("GET_ACCESSORIES_FAIL"),

        CREATE_NEWS_TEASER_SUCCESSFUL("CREATE_NEWS_TEASER_SUCCESSFUL"),
        CREATE_NEWS_TEASER_FAIL("CREATE_NEWS_TEASER_FAIL"),
        GET_NEWS_TEASER_SUCCESSFUL("GET_NEWS_TEASER_SUCCESSFUL"),
        GET_NEWS_TEASER_FAIL("GET_NEWS_TEASER_FAIL"),

        CREATE_PET_FOOD_TIP_SUCCESSFUL("CREATE_PET_FOOD_TIP_SUCCESSFUL"),
        CREATE_PET_FOOD_TIP_FAIL("CREATE_PET_FOOD_TIP_FAIL"),
        GET_PET_FOOD_TIP_SUCCESSFUL("GET_PET_FOOD_TIP_SUCCESSFUL"),
        GET_PET_FOOD_TIP_FAIL("GET_PET_FOOD_TIP_FAIL"),

        CREATE_ADVERTISEMENT_SUCCESSFUL("CREATE_ADVERTISEMENT_SUCCESSFUL"),
        CREATE_ADVERTISEMENT_FAIL("CREATE_ADVERTISEMENT_FAIL"),
        GET_ADVERTISEMENT_SUCCESSFUL("GET_ADVERTISEMENT_SUCCESSFUL"),
        GET_ADVERTISEMENT_FAIL("GET_ADVERTISEMENT_FAIL"),

        INVALID_REQUEST("INVALID_REQUEST");

        private final String status;

        private TransStatusEnum(String status){
            this.status=status;
        }

        private static final Map<String, TransStatusEnum> nameToValueMap = new HashMap<>();

        static {
            for (TransStatusEnum value : TransStatusEnum.values()) {
                nameToValueMap.put(value.status, value);
            }
        }

        public String getStatus(){
            return status;
        }

        public static TransStatusEnum fromString(String status){
            return nameToValueMap.get(status);
        }
}
