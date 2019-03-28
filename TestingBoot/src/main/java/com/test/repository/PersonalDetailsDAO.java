package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.entity.Person;

@Repository
public interface PersonalDetailsDAO extends JpaRepository<Person, String> {

	
	@Query(value="from com.test.entity.Person  where email =:email  and password=:password")
	Person loginValidation(@Param("email") String email, @Param("password") String password);
	
	@Query(value="from com.test.entity.Person where email =:email")
	Person getByEmail(@Param("email") String email);
}
