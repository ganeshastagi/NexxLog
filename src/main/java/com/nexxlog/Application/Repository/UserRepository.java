package com.nexxlog.Application.Repository;

import com.nexxlog.Application.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
