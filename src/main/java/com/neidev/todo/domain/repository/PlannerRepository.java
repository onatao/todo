package com.neidev.todo.domain.repository;

import com.neidev.todo.domain.core.planner.entity.Planner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlannerRepository extends JpaRepository<Planner, String> {
}
