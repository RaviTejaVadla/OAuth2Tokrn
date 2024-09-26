package com.telusujo.springoAuth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
public class OAuthController {

    @GetMapping("/login")
    public String getOauth(){

        return " welcome to telusuko";
    }
}
