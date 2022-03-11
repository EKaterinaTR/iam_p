package com.example.demo.services;


import com.example.demo.DTO.PromotionDTO;
import com.example.demo.models.Promotion;
import com.example.demo.repositories.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PromotionServiceImpl implements PromotionService {
    @Autowired
    private PromotionRepository promotionRepository;


    @Override
    public Promotion addPromotion(PromotionDTO promotionDTO) {
        return promotionRepository.save(Promotion.builder()
                .name(promotionDTO.getName())
                .description(promotionDTO.getDescription())
                .build());
    }
}
