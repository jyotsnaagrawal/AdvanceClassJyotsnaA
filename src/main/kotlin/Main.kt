fun main() {
    // Creating instances of the Employee class with sample data
    val emp1 = Employee("Jane Doe", PositionTitle.ADMINISTRATION, true, 27.00, 1)
    val emp2 = Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2)
    val emp3 = Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.00, 3)

    // Displaying information for the first employee (Jane Doe)
    emp1.display()

    // Calculating and displaying earnings for the first employee based on 45 hours worked
    emp1.calculate(45)
    println("\n")

    // Displaying information for the second employee (Larry Jackson)
    emp2.display()

    // Calculating and displaying earnings for the second employee based on 50 hours worked
    emp2.calculate(50)
    println("\n")

    // Displaying information for the third employee (John Smith)
    emp3.display()

    // Calculating and displaying earnings for the third employee based on 35 hours worked
    emp3.calculate(35)
}
