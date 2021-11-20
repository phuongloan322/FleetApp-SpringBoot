package com.loanttp.feetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loanttp.feetapp.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
