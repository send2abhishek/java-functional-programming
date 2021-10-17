package functionalInterface.stream;

public class Employee {

    private String name;
    private String gender;
    private String work;


    public Employee(String name, String gender, String work) {
        this.name = name;
        this.gender = gender;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}
