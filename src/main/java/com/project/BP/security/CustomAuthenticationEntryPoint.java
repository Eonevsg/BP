package com.project.BP.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException authException) throws IOException, ServletException {
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        if (req.getMethod().equalsIgnoreCase("POST")) {
//            res.sendError(HttpStatus.FORBIDDEN.value(),
//                    HttpStatus.FORBIDDEN.getReasonPhrase());
            res.setStatus(403);
            res.getWriter().write("{ \"timestamp\": \"" + LocalDateTime.now() +
                    "\", \"status\": " + 403 + "," + "\"error\": " + "\"Forbidden\"," +
                    "\"message\": " + "\"Forbidden\"}");
        } else {
//        res.sendError(HttpStatus.UNAUTHORIZED.value(),
//                HttpStatus.UNAUTHORIZED.getReasonPhrase());
            res.setStatus(401);
            res.getWriter().write("{ \"timestamp\": \"" + LocalDateTime.now() +
                    "\", \"status\": " + 401 + "," + "\"error\": " + "\"Unauthorized\"," +
                    "\"message\": " + "\"Unauthorized\"}");
        }
    }
}
