package com.example.logs.controller;

import com.example.logs.dto.ItemDTO;
import com.example.logs.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public void saveItem(@RequestBody ItemDTO itemDTO){
        itemService.saveItem(itemDTO);
    }
}
