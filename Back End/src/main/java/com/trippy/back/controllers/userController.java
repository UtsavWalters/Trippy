package com.trippy.back.controllers;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.trippy.back.entities.Account;
import com.trippy.back.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping(value = "/user")
public class userController {
    @Autowired
    UserService userService = new UserService();

    @JsonFormat
    @ResponseBody
    @PostMapping(value = "/login")
    public ResponseEntity login(@RequestBody Account account){
        String token = userService.login(account);

        if(token.isEmpty()){
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        else{
            return new ResponseEntity<>(
                    token, HttpStatus.OK
            );
        }
    }

    @PostMapping(value = "/create")
    public ResponseEntity create(@RequestBody Account account){


        userService.createUser(account);

        return new ResponseEntity<>(HttpStatus.OK);
    }


}
