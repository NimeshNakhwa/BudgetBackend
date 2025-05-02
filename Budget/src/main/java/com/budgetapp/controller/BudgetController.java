package com.budgetapp.controller;

import java.util.List;

import org.slf4j.Logger; // Import Logger
import org.slf4j.LoggerFactory; // Import LoggerFactory
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin; // Import CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budgetapp.model.Budget;
import com.budgetapp.service.BudgetService;

@RestController
@RequestMapping("/api/budgets")
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from the frontend
public class BudgetController {

    // Create a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(BudgetController.class);

    @Autowired
    private BudgetService budgetService;

    @GetMapping
    public List<Budget> getAllBudgets() {
        logger.info("Fetching all budgets");
        return budgetService.getAllBudgets();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Budget> getBudgetById(@PathVariable Long id) {
        logger.info("Fetching budget with id: {}", id);
        return budgetService.getBudgetById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

   @PostMapping
public Budget createBudget(@RequestBody Budget budget) {
    // Log the incoming payload
    logger.info("Incoming payload: {}", budget);

    // Save the budget
    return budgetService.createBudget(budget);
}

    @PutMapping("/{id}")
    public ResponseEntity<Budget> updateBudget(@PathVariable Long id, @RequestBody Budget budgetDetails) {
        logger.info("Updating budget with id: {}", id);
        return ResponseEntity.ok(budgetService.updateBudget(id, budgetDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBudget(@PathVariable Long id) {
        logger.info("Deleting budget with id: {}", id);
        budgetService.deleteBudget(id);
        return ResponseEntity.noContent().build();
    }
}