package com.fryberg.baraban.repo;

import com.fryberg.baraban.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message,Long> {
}
