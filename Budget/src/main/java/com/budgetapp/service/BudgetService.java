package com.budgetapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.budgetapp.model.Budget;
import com.budgetapp.repository.BudgetRepository;

@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public Optional<Budget> getBudgetById(Long budgetId) {
        return budgetRepository.findById(budgetId);
    }

    public Budget createBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public Budget updateBudget(Long budgetId, Budget budgetDetails) {
        Budget budget = budgetRepository.findById(budgetId).orElseThrow();
        budget.setBudgetAssigned(budgetDetails.getBudgetAssigned());
        budget.setBudgetUtilized(budgetDetails.getBudgetUtilized());
        budget.setEventId(budgetDetails.getEventId());
        budget.setSponsorId(budgetDetails.getSponsorId());
        return budgetRepository.save(budget);
    }

    public void deleteBudget(Long budgetId) {
        budgetRepository.deleteById(budgetId);
    }
}
