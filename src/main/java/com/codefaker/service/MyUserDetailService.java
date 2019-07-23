package com.codefaker.service;

import com.codefaker.pojo.Permission;
import com.codefaker.pojo.User;
import com.codefaker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class MyUserDetailService implements UserDetailsService {
//    PasswordEncoder
//    DateUtils
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(s);
        System.out.println(".........................." + user);
        System.out.println("..........................");
        System.out.println("..........................");
//        List<Permission> permissions= userRepository.findPermissionByUserName(s);
        List<GrantedAuthority> grantedAuthorities=new ArrayList<GrantedAuthority>();
        grantedAuthorities.add(new SimpleGrantedAuthority("admin"));
        grantedAuthorities.add(new SimpleGrantedAuthority("reader"));
        //将数据库中的权限查出来放入集合中
        user.setGrantedAuthorities(grantedAuthorities);

        System.out.println("..........................");
        return user;
    }

    public List<User> getUsers() {
        return userRepository.getAll();
    }
}
