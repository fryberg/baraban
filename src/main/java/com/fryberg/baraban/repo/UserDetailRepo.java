package com.fryberg.baraban.repo;

import com.fryberg.baraban.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepo extends JpaRepository<User,String> {
}
