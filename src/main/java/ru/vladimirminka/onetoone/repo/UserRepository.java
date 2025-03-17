package ru.vladimirminka.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vladimirminka.onetoone.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
