package com.example.the_bank.repository;

import com.example.the_bank.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Long> {
    Boolean existsByEmail(String email);

    @Query("select case when count(a)> 0 THEN true else false end from User a where a.accountNumber = :accountNumber")
    boolean existAccountNumber(@Param("accountNumber") String accountNumber);

    @Query("select u from User u where u.accountNumber = :accountNumber")
    User findAccountNumber(String accountNumber);

    @Query("SELECT u FROM User u WHERE u.accountNumber = :accountNumber")
    User findByAccountNumber(String accountNumber);
}
