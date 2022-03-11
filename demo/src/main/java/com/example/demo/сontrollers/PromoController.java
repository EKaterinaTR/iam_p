package com.example.demo.сontrollers;

import com.example.demo.DTO.PromotionDTO;
import com.example.demo.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraintvalidation.SupportedValidationTarget;


@RestController
@Validated
public class PromoController {
    @Autowired
    private PromotionService service;
    @PostMapping("/promo")
    public Long addCourse(@Valid @RequestBody PromotionDTO promotionDTO) {
        return service.addPromotion(promotionDTO).getId();
    }
}
