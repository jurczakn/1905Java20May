package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {

}
