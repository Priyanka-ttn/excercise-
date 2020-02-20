package librarymanagement;

public abstract class Librarian {
    private int emp_id;
    private String emp_name;


    public Librarian(int emp_id, String emp_name) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public abstract void addMember();
    public abstract void deleteUpdateMember();
    public void addBook(){
        //Book added
    }

}

