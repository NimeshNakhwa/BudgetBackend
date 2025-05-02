// package com.budgetapp.model;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "budget")
// public class Budget {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "budget_id")
//     private Long budgetId;

//     @Column(name = "budget_assigned")
//     private Double budgetAssigned;

//     @Column(name = "budget_utilized")
//     private Double budgetUtilized;

//     @Column(name = "event_id")
//     private Long eventId;

//     @Column(name = "sponsor_id")
//     private Long sponsorId;

//     // Constructors
//     public Budget() {}

//     public Budget(Double budgetAssigned, Double budgetUtilized, Long eventId, Long sponsorId,Long budgetId) {
//         this.budgetId = budgetId;
//         this.budgetAssigned = budgetAssigned;
//         this.budgetUtilized = budgetUtilized;
//         this.eventId = eventId;
//         this.sponsorId = sponsorId;
//     }

//     // Getters and Setters
//     public Long getBudgetId() {
//         return budgetId;
//     }

//     public void setBudgetId(Long budgetId) {
//         this.budgetId = budgetId;
//     }

//     public Double getBudgetAssigned() {
//         return budgetAssigned;
//     }

//     public void setBudgetAssigned(Double budgetAssigned) {
//         this.budgetAssigned = budgetAssigned;
//     }

//     public Double getBudgetUtilized() {
//         return budgetUtilized;
//     }

//     public void setBudgetUtilized(Double budgetUtilized) {
//         this.budgetUtilized = budgetUtilized;
//     }

//     public Long getEventId() {
//         return eventId;
//     }

//     public void setEventId(Long eventId) {
//         this.eventId = eventId;
//     }

//     public Long getSponsorId() {
//         return sponsorId;
//     }

//     public void setSponsorId(Long sponsorId) {
//         this.sponsorId = sponsorId;
//     }
// }

// package com.budgetapp.model;
package com.budgetapp.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "budget")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "budgetid") // Use lowercase to match the actual column name in the database
    private Long budgetId;

    @Column(name = "budgetassigned") // Use lowercase as the column in the database is in lowercase
    private Double budgetAssigned;

    @Column(name = "budgetutilized") // Use lowercase
    private Double budgetUtilized;

    @Column(name = "eventid") // Use lowercase
    private Long eventId;

    @Column(name = "sponsorid") // Use lowercase
    private Long sponsorId;


    // Constructors
    public Budget() {}

    public Budget(Double budgetAssigned, Double budgetUtilized, Long eventId, Long sponsorId, Long budgetId) {
        this.budgetId = budgetId;
        this.budgetAssigned = budgetAssigned;
        this.budgetUtilized = budgetUtilized;
        this.eventId = eventId;
        this.sponsorId = sponsorId;
    }

    // Getters and Setters
    public Long getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Long budgetId) {
        this.budgetId = budgetId;
    }

    public Double getBudgetAssigned() {
        return budgetAssigned;
    }

    public void setBudgetAssigned(Double budgetAssigned) {
        this.budgetAssigned = budgetAssigned;
    }

    public Double getBudgetUtilized() {
        return budgetUtilized;
    }

    public void setBudgetUtilized(Double budgetUtilized) {
        this.budgetUtilized = budgetUtilized;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(Long sponsorId) {
        this.sponsorId = sponsorId;
    }
}
