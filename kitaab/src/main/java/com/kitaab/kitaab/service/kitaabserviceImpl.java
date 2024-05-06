package com.kitaab.kitaab.service;

import com.kitaab.kitaab.entity.Kitaab;
import com.kitaab.kitaab.repository.kitaabRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class kitaabserviceImpl implements kitaabservice{
    kitaabRepository KitaabRepository;
    public kitaabserviceImpl(kitaabRepository KitaabRepository){
        this.KitaabRepository = KitaabRepository;
    }
    @Override
    public String createKitaab(Kitaab kitaab){
        KitaabRepository.save(kitaab);
        return "Success";
    }

    @Override
    public String updateKitaab(Kitaab kitaab){
        KitaabRepository.save(kitaab);
        return "Success";
    }
    @Override
    public String deleteKitaab(String kitaabId){
        KitaabRepository.deleteById(kitaabId);
        return "Success";
    }
    @Override
    public Kitaab getKitaab(String kitaabId){
        return KitaabRepository.findById(kitaabId).get();
    }

    public List<Kitaab> getAllKitaab(){
        return (List<Kitaab>) KitaabRepository.findAll();
    }
}
