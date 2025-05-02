package com.budgetapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.budgetapp.model.Budget;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {
    // Custom query methods can be added here if needed
}
