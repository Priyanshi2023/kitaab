package com.kitaab.kitaab.service;

import com.kitaab.kitaab.entity.Kitaab;

import java.util.List;


public interface kitaabservice {
    public String createKitaab(Kitaab kitaab);
    public String updateKitaab(Kitaab kitaab);
    public String deleteKitaab(String kitaabId);
    public Kitaab getKitaab(String kitaabId);
    public List<Kitaab>getAllKitaab();
}
