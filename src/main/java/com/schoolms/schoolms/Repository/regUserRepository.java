package com.schoolms.schoolms.Repository;

import com.schoolms.schoolms.Models.RegUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface regUserRepository extends JpaRepository<RegUsers,String> {

}
