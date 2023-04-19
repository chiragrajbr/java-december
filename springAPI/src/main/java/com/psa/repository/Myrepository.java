package com.psa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psa.api.Api;

@Repository
public interface Myrepository extends JpaRepository<Api, Integer> {
 
}
