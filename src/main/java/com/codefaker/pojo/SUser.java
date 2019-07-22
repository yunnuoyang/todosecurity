package com.codefaker.pojo;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import java.nio.channels.SocketChannel;
import java.util.Collection;
import java.util.Set;
/**
 * security的user类
 */
public class SUser implements CredentialsContainer, UserDetails {
//    HandlerInterceptor
//    SocketChannel
//    Coo
    private String username;
    //授权的角色
    private Set<GrantedAuthority> authorities;
    private boolean accountNonExpired;  //帐户是否过期
    private boolean accountNonLocked; //帐户是否锁定
    private boolean credentialsNonExpired; //认证是否过期
    private boolean enabled; //帐户是否可用
    private String password;

    @Override
    public void eraseCredentials() {

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
