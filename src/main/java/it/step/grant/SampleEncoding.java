package it.step.grant;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SampleEncoding {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        String password  = encoder.encode("alex");
        System.out.println(password);
        System.out.println(encoder.matches("patrick", "password"));

    }
}
