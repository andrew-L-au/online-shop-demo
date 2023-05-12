package com.example.artservice.controller;

import com.example.artservice.model.art.Art;
import com.example.artservice.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/art")
public class ArtController {
    @Autowired
    private ArtService artService;

    @PostMapping("/add-one-art")
    public void addOneArt(@RequestBody Art art){
        artService.addOneArt(art);
    }

    @PostMapping("/delete-one-art")
    public void deleteOneArt(@RequestBody Art art){
        artService.deleteOneArt(art);
    }
}
