package chapter6;

public class Student {
    private String name;
    private String id;
    
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Ghi đè phương thức toString để in ra thông tin chi tiết của đối tượng Student
    @Override
    public String toString() {
        return "Student{name='" + name + "', id='" + id + "'}";
    }

    // Getters và setters nếu cần
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
