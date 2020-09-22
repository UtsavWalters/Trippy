package com.trippy.back.services;

import com.trippy.back.entities.Account;
import com.trippy.back.repos.UserRepo;
import com.trippy.back.security.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    JwtGenerator jwtGenerator;
     private PasswordEncoder passwordEncoder;


    public String login(Account account){
       Account onFileAccount = userRepo.findByEmail(account.getEmail());
       if(onFileAccount != null){
           if(passwordEncoder.matches(account.getPassword(), onFileAccount.getPassword())){
               String token = jwtGenerator.generate(onFileAccount);
               onFileAccount.setToken(token);
               userRepo.save(onFileAccount);
               return token;
           }
       }
       //todo: delete this
        return "delete";
    }
    public List<Account> getAllUsers(){
        return userRepo.findAll();
    }
    //todo: potentially return http status or confirmation
    public void deleteUser(Long id){
        if(userRepo.existsById(id)){
            userRepo.deleteById(id);
        }
    }
    public String findEmail(Long id){
        //checking if user's id exist in the database table of "user". If it does then return the user's corresponding email. if not return null.
        String email = null;
        try{
            if(userRepo.existsById(id)){
                Account account = userRepo.getOne(id);
                email = account.getEmail();
            }
            else{
                email = null;
            }
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        return email;
    }

}
