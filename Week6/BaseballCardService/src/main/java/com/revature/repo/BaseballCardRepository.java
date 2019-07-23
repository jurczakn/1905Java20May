package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.BaseballCard;

@Repository
public interface BaseballCardRepository extends JpaRepository<BaseballCard, Integer> {

}
