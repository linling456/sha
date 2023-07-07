package xianmu;

import java.util.Objects;

public class student {

    private String StudentNumber;
    private String password;
    private String petName;
    private String bookname;
    private int booknumber;

    public student(String studentNumber, String password, String petName, String bookname, int booknumber) {
        StudentNumber = studentNumber;
        this.password = password;
        this.petName = petName;
        this.bookname = bookname;
        this.booknumber = booknumber;
    }

    public student() {
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        StudentNumber = studentNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBooknumber() {
        return booknumber;
    }

    public void setBooknumber(int booknumber) {
        this.booknumber = booknumber;
    }

    @Override
    public String toString() {
        return "学生信息{" +
                "学号：'" + StudentNumber + '\'' +
                ", 密码：'" + password + '\'' +
                ", 昵称'" + petName + '\'' +
                ", 借阅图书'" + bookname + '\'' +
                ", 借阅数量" + booknumber +
                '}';
    }
}

//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        student student = (student) o;
//        return StudentNumber.equals(student.StudentNumber) ;
//    }
//}

//    @Override
//    public int hashCode() {
//        return Objects.hash(StudentNumber, password);
//    }
//


