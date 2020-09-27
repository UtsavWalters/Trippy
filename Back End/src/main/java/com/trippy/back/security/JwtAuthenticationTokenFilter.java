package com.trippy.back.security;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtAuthenticationTokenFilter extends AbstractAuthenticationProcessingFilter {
    //specify endpoint pattern to know when a jwt is needed
    public JwtAuthenticationTokenFilter() {
        super("/*/secure/**");
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {
        //Request header needed
        String header = httpServletRequest.getHeader("secure");
        //header for request below needs to begin with "Token:"
        if (header == null || !header.startsWith("Token:")) {
            throw new RuntimeException("JWT Token is missing");
        }
        String authenticationToken = StringUtils.removeStart(header, "Token ").trim();
        JwtAuthenticationToken token = new JwtAuthenticationToken(authenticationToken);
        return getAuthenticationManager().authenticate(token);
    }
}
