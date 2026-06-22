package com.schoolms.schoolms.Security;

import com.schoolms.schoolms.Models.RegUsers;
import com.schoolms.schoolms.Repository.regUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class UsernamePwdAuthenticationProvider implements AuthenticationProvider {

    private Collection<? extends GrantedAuthority> getGrantedAuthorities(String role) {
        return List.of(
                new SimpleGrantedAuthority("ROLE_" + role)
        );
    }

    @Autowired
    regUserRepository RegUserRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email=authentication.getName();
        String pwd=authentication.getCredentials().toString();
        RegUsers regUsers = RegUserRepository.findById(email).orElse(null);
        if(null!=regUsers&&null!=regUsers.getRole()&&pwd.equals(regUsers.getPassword())){
            return new UsernamePasswordAuthenticationToken(regUsers,pwd,getGrantedAuthorities(regUsers.getRole().getRoleName()));
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication ){
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
