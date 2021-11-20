package com.loanttp.feetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loanttp.feetapp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
