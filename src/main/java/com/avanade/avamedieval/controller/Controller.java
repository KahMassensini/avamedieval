package com.avanade.avamedieval.controller;

import com.avanade.avamedieval.service.GameService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/avaMedieval")
@Api(value = "RPG medieval")
@CrossOrigin(origins = "*")
public class Controller {
    @Autowired
    private GameService service;


}
