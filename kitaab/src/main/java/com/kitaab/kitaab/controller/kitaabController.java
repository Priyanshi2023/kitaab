package com.kitaab.kitaab.controller;

import com.kitaab.kitaab.entity.Kitaab;
import com.kitaab.kitaab.service.kitaabservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kitaab")
public class kitaabController {
    kitaabservice KitaabService;

    @Autowired
    public kitaabController(kitaabservice kitaabservice) {
        this.KitaabService = kitaabservice;
    }

    @GetMapping("/{kitaabId}")
    public Kitaab getKitaabDetails(@PathVariable("kitaabId") String kitaabId) {
        return KitaabService.getKitaab(kitaabId);
    }

    @GetMapping("/getall")
    public List<Kitaab> getAllKitaabDetails() {
        return KitaabService.getAllKitaab();
    }

    @PostMapping("/add")
    public String createKitaabDetails(@RequestBody Kitaab kitaab) {
        KitaabService.createKitaab(kitaab);
        return "Kitaab created Successfully";
    }

    @PutMapping("/updatekitaab")
    public String updateKitaabDetails(@RequestBody Kitaab kitaab) {
        KitaabService.updateKitaab(kitaab);
        return "Kitaab updated Successfully";
    }

    @DeleteMapping("delete/{kitaabId}")
    public String deleteKitaabDetails(@PathVariable("kitaabId") String kitaabId) {
        KitaabService.deleteKitaab(kitaabId);
        return " kitaab deleted successfully";

    }
}