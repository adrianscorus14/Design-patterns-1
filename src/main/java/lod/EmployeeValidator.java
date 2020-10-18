package lod;

public class EmployeeValidator {

    boolean isValid(Employee employee){
//        if(employee.getName()==null || employee.getName().isEmpty()){
//            return false;
//        }
//        Email email=employee.getEmail();
//        if(email==null){
//            return false;
//        }
//        if(email.getEmail()==null ||email.getEmail().isEmpty()){
//            return false;
//        }
//        return true;
        return employee.isValid();
    }

}
