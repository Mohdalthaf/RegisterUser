package com.example.RegisterLogin.Repo;


import com.example.RegisterLogin.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    //   Optional<User> findOneByUsernameAndPassword(String userName, String password);
    User findByUserName(String userName);
}

