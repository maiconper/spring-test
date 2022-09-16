package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
@Repository
public interface ReaderRepository extends JpaRepository<Reader, String> {

    UserDetails findByUsername(String username);

}
