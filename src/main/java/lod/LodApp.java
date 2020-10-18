package lod;

public class LodApp {
    public static void main(String[] args) {
        Employee employee=new Employee();

        Email email=new Email();
        email.setEmail("adrian@gmail.com");

        employee.setName("Alex");
        employee.setEmail(email);

        EmployeeValidator employeeValidator=new EmployeeValidator();

        System.out.println(employeeValidator.isValid(employee));




    }


}
