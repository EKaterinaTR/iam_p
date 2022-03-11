package com.example.demo.services;

import com.example.demo.DTO.PromotionDTO;
import com.example.demo.models.Promotion;


public interface PromotionService {

    public Promotion addPromotion(PromotionDTO promotionDTO);
}
