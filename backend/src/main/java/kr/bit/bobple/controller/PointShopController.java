package kr.bit.bobple.controller;

import kr.bit.bobple.entity.PointShop;
import kr.bit.bobple.service.PointShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class PointShopController {
    @Autowired
    private final PointShopService pointShopService;

    public PointShopController(PointShopService pointShopService) {
        this.pointShopService = pointShopService;
    }

    @GetMapping("/PointMain")
    public List<PointShop> getAllPointShops() {
        return pointShopService.getAllPointShops();
    }

    @GetMapping("/PointGifticonDetail/{productIdx}")
    public PointShop getPointShopByProductIdx(@PathVariable Long productIdx) {
        return pointShopService.getPointShopByProductIdx(productIdx);
    }
}

