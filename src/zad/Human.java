package zad;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {
    public Animal pet;
    public Car car;

    private Double salary = 5000.;
    private Double lastCheckSalary;
    private LocalDateTime lastCheckTime;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public Human() {
    }


    public double getSalary() {
        if (lastCheckTime == null){
            System.out.println("You checking your salary for the first time");
        }
        else {
            System.out.println("Last salary check: " + dtf.format(lastCheckTime) + " " + lastCheckSalary);
        }
        lastCheckTime = LocalDateTime.now();
        lastCheckSalary = this.salary;
        System.out.printf("Current salary: %s\n\n", this.salary);
        return this.salary;
    }

    public void setSalary(Double salary){
        if (salary < 0){
            System.out.println("You can't assign negative value to the salary.\n");
        }
        else {
            System.out.printf("Salary increase: %s\n", (salary - this.salary));
            this.salary = salary;
            System.out.println("Information about the new amount of salary has been sent to the accounting system.");
            System.out.println("Contact Mrs. Hania from HR about an annex to the contract");
            System.out.println("P.S. Hiding information about your new salary is pointless " +
                    "- Social Security and Tax Office were already informed\n");
        }
    }
}
