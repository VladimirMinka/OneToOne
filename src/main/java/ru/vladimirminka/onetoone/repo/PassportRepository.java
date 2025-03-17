package ru.vladimirminka.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vladimirminka.onetoone.Entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long> {

}
