package employeemanagementsystem;

public class EmployeePromotionSystem {
    static void promoteEmployee(Employee employee){
        if(employee.getLevel() == Level.LEAD){
            return;
        }
        employee.setLevel(Level.values()[employee.getLevel().ordinal() + 1]);
        employee.setSalary(employee.getSalary() * employee.getLevel().getIncrement());
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(1,"Naman","Developer",500000.00,Level.JUNIOR);
        employees[1] = new Employee(2,"Talha","Developer",450000.00,Level.JUNIOR);
        employees[2] = new Employee(3,"Praveen","Developer",550000.00,Level.JUNIOR);
        employees[3] = new Employee(4,"Prashant","Developer",350000.00,Level.JUNIOR);
        employees[4] = new Employee(5,"Ankit","Developer",400000.00,Level.JUNIOR);

        for(Employee e:employees){
            System.out.println(e);
        }
        System.out.println("-----------------------------");

        promoteEmployee(employees[0]);
        System.out.println(employees[0]);

        promoteEmployee(employees[1]);
        System.out.println(employees[1]);

        promoteEmployee(employees[0]);
        System.out.println(employees[0]);
    }
}

