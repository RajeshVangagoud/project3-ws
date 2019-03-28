package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.entity.UserLogin;

public interface LoginDAO extends JpaRepository<UserLogin, String> {

	// @Query("select chequeIssue from com.netspay.echeque.entity.ChequeIssue
	// chequeIssue where chequeIssue.issuerMobileNumber= :mobileNumber")

	

}
