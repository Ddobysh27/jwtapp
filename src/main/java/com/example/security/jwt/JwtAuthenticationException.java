package com.example.security.jwt;

import org.springframework.security.core.AuthenticationException;

/**
 * Authetication exception for JwtAppDemo application.
 *
 * @author D D
 * @version 1.0
 */

public class JwtAuthenticationException extends AuthenticationException {
    public JwtAuthenticationException(String msg, Throwable t) {
        super(msg, t);
    }

    public JwtAuthenticationException(String msg) {
        super(msg);
    }
}
