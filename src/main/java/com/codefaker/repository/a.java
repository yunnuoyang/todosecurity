package com.codefaker.repository;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class a {
    public static void main(String[] args) {
        BCryptPasswordEncoder encodere=new BCryptPasswordEncoder();
        String encode = encodere.encode("111111");
        System.out.println(encode+encode.length());
//        $2a$10$zELuKDSchFswuqOi.jF/YeO9TiM.TwvXiph0lctuS6IzhWbfS14R.60
//        $2a$10$QMLDHf0UqkCeLV60.yPe5Ot03eNgkiGAl3Q7HhvhcBjrXkmG9041S60
//        $2a$10$uo/JF1Lfohn4aNwriHt8neTC9MVsWUo5PKHCjCrGarHvzPWi.MPCK60
    }
}
