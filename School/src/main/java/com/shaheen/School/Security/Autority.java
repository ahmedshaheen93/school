/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shaheen.School.Security;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author lts
 */
public class Autority implements GrantedAuthority{
    private final String authority ;

    public Autority(String authority) {
        this.authority = authority;
    }

    
    
    @Override
    public String getAuthority() {
        return authority ;
    }
    
}
