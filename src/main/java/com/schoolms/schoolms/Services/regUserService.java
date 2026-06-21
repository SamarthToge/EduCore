package com.schoolms.schoolms.Services;

import com.schoolms.schoolms.Models.RegUsers;
import com.schoolms.schoolms.Repository.regUserRepository;
import org.springframework.stereotype.Service;

@Service
public class regUserService {
    private final regUserRepository RegUserRepository;
    public regUserService(regUserRepository RegUserRepository){
        this.RegUserRepository=RegUserRepository;
    }
    public boolean saveReguser(RegUsers regUsers){
        RegUserRepository.save(regUsers);
        return true;
    }

}
