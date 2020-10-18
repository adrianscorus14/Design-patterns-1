package lod;

public class Employee {
    private String name;
    private Email email;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(Email email) {
        this.email = email;
    }



    public String getName() {
        return name;
    }

    public boolean isValid(){
        if(this.name==null|| this.name.isEmpty()){
            return false;
        }

        if(this.email.getEmail()==null||this.email.getEmail().isEmpty()){
            return false;
        }
        return true;
    }
}

