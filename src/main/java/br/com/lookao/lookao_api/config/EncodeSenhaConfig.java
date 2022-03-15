package br.com.lookao.lookao_api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class EncodeSenhaConfig {

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
