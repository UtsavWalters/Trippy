package com.trippy.back.security;

import com.trippy.back.entities.Account;
import com.trippy.back.repos.UserRepo;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtValidator {
    @Autowired
    UserRepo userRepo;

    private String secret = "P1o2t3A4t5O6";

    public Account validate(String token){
        Account jwtAccount = null;
        Date expirationDate = null;
        Date current = new Date();
        try{
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
            jwtAccount = new Account();
            jwtAccount.setId((Long) body.get("id"));
            jwtAccount.setEmail((String) body.get("email"));
            expirationDate = body.getExpiration();

            if(userRepo.findByToken(token) == null || current.after(expirationDate)){
                jwtAccount = null;
                throw new Exception("JWT does not exist or is expired");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
        return jwtAccount;
    }
}
