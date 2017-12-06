package com.lingyuntec.repositories;

import com.lingyuntec.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by xieyuxing on 2017/11/30.
 */
@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByName(String name);
}
