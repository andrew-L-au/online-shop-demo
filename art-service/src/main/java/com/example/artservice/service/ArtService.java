package com.example.artservice.service;

import com.example.artservice.mapper.ArtMapper;
import com.example.artservice.model.art.Art;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtService {
    @Autowired
    private ArtMapper artMapper;

    public void addOneArt(Art art){
        if(artMapper.selectOneWithAllInfoByName(art.getName()) != null){
            return;
        }
        artMapper.insert(art);
    }

    public void deleteOneArt(Art art){
        if(artMapper.selectById(art.getArtId()) != null){
            return;
        }
        artMapper.deleteById(art.getArtId());
    }
}
