package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.NationalityEntity;

public interface NationalitiesDAO extends JpaRepository<NationalityEntity, String>{

}
