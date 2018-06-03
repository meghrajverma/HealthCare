package com.example.JdbcConn;

import org.springframework.data.repository.CrudRepository;
import com.example.JdbcConn.User;
public interface UserRepository extends CrudRepository<User , Long> {
}
