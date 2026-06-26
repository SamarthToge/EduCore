package com.schoolms.schoolms.Audit;

import com.schoolms.schoolms.Models.RegUsers;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.Optional;

@Component("auditAwareImpl")
public class auditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor(){
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        if(name.equals("anonymousUser")){
            return Optional.of(name);
        }
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        RegUsers user = (RegUsers) authentication.getPrincipal();

        return Optional.of(user.getSchoolemail());
    }

}
