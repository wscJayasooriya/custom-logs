package com.example.logs.controller;

import com.example.logs.dto.ItemDTO;
import com.example.logs.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

    private static final Logger LOGGER = LoggerFactory.getLogger("item");

    @Autowired
    private ItemService itemService;

    @PostMapping
    public void saveItem(@RequestBody ItemDTO itemDTO){
        LOGGER.info("request  - POST | customer | saveItem | payload : {}",itemDTO);
        itemService.saveItem(itemDTO);
        LOGGER.info("response - POST | customer | saveItem | success");
    }
}
