package com.example.demo.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	// C
	
	// R
	
	List<User> findById(int user_id);
	
	@Query(value="SELECT * FROM user WHERE user LIKE %?1%", nativeQuery=true)
	List<User> findUserByUser(String User);
	
	@Query(value="SELECT * FROM user WHERE date_time BETWEEN ?1 AND ?2", nativeQuery=true)
	List<User> findUserByTime(Timestamp start, Timestamp end);
	
	// U
	
	// D
	
	// C

}
