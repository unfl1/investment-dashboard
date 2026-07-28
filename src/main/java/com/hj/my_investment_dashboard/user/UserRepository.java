package com.hj.my_investment_dashboard.user;

import com.hj.my_investment_dashboard.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserId(String userId);

    boolean existsByUserId(String userId);

    boolean existsBtEmail(String email);

}
