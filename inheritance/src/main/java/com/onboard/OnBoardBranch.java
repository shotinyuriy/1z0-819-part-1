package com.onboard;

class Employee {
    private String type;
    private String name;

    public Employee(String type, String name) {
        this.type = type;
        this.name = name;
    }
}

class Company {
    public static int branchCount;
    public static int employeeCount;

    public void addEmployee(Employee e) {
        employeeCount++;
    }

    public void addBranch(Branch e) {
        branchCount++;
    }

    static {
        System.out.println("Company Static Initializer");
        branchCount = 10;
    }
}

class Branch extends Company {
    public int branchCount;
    public int employeeCount;
    private String branchName = "unspecified";

    Branch(String branchName) {
        this.branchName = branchName;
    }

    {
        System.out.println("Branch Static Initializer");
        employeeCount = 200;
    }

    public void addEmployee(Employee e) {
        employeeCount++;
    }
}

public class OnBoardBranch {
    public static void main(String[] args) {
        Branch b = new Branch("RedBranch");
        Employee e1 = new Employee("Carol", "President");
        Employee e2 = new Employee("Ralph", "Vice President");
        Company main = new Company();

        main.addBranch(b);
        b.addEmployee(e1);
        b.addEmployee(e2);

        System.out.println("Number of Branches = " + Company.branchCount);
        System.out.println("Number of Employees = " + Company.employeeCount);

        System.out.println("Call from Branches: Number of Branches = " + b.branchCount);
        System.out.println("Call from Branches: Number of Employees = " + b.employeeCount);
    }
}
