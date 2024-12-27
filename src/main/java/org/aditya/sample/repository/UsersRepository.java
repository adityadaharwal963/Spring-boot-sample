package org.aditya.sample.repository;

import org.aditya.sample.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
