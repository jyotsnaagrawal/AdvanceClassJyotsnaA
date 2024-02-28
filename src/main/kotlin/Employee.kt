// Enumeration representing different positions an employee can have
enum class PositionTitle {
    ADMINISTRATION,
    PRODUCTION,
    MAINTENANCE
}

// Class representing an Employee
class Employee(
    private val employeeName: String,         // Employee's name
    private val positionTitle: PositionTitle, // Employee's position title (from the enum)
    private val isSalary: Boolean,            // Indicates if the employee is on salary
    private val rateOfPay: Double,            // Rate of pay per hour
    private val shift: Int                     // Employee's shift
) {
    // Display method to print employee information
    fun display() {
        println("$employeeName\n${positionTitle} Is salary: $isSalary shift: $shift")
        println("Rate of pay is: $$rateOfPay per hour")
    }

    // Calculate method to determine earnings based on hours worked
    fun calculate(hoursWorked: Int) {
        // Calculate earnings based on whether the employee is salaried or hourly
        val earnings = if (isSalary) {
            rateOfPay * 40  // Assuming a standard workweek of 40 hours for salaried employees
        } else {
            rateOfPay * hoursWorked
        }
        println("$employeeName earned $$${String.format("%.2f", earnings)} this week\n")
    }
}
