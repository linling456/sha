package xianmu;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class yonghu {
    public void lookBook(booklist bookList) {
        List<book> books = bookList.getBooks();
        for (book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(studentlist StudentList, booklist bookList, String number) {


        Scanner scanner = new Scanner(System.in);
        boolean flag = false, flagg = false, falaggg = false;
        List<book> books = bookList.getBooks();
        List<student> students = StudentList.getUser();
        ListIterator<book> bookListIterator = books.listIterator();
        ListIterator<student> studentListIterator = students.listIterator();
        while (studentListIterator.hasNext()) {
            student student = studentListIterator.next();
            if (number.equals(student.getStudentNumber())) {
                if (student.getBookname().equals("无")) {
                    falaggg = true;
                }
            }
        }
        if (falaggg == true) {
            System.out.print("请输入要借阅书籍的名字 ");
            String Name = scanner.next();
            while (bookListIterator.hasNext()) {
                book book = bookListIterator.next();
                if (Name.equals(book.getName())) {
                    System.out.println(book);
                    flag = true;
                    System.out.println("请输入借阅数量");
                    int numbers = scanner.nextInt();
                    int shulaing = book.getNumber();
                    if (shulaing >= numbers) {
                        book.setNumber(shulaing - numbers);
                        flagg = true;
                        ListIterator<student> studentlistIterator = students.listIterator();
                        while (studentlistIterator.hasNext()) {
                            student stud = studentlistIterator.next();
                            if (number.equals(stud.getStudentNumber())) {
                                stud.setBookname(Name);
                                stud.setBooknumber(numbers);
                                System.out.println("借阅成功");
                            }

                        }
                    }
                }
            }
        }

        if (falaggg == false) {
            System.out.println("还有图书未归还，无法借阅");
        }
        if (flag == false && falaggg == true) {
            System.out.println("图书不存在");
        }
        if (flag == true && flagg == false) {
            System.out.println("图书数量不足");
        }
    }

    public void returnBook(studentlist StudentList, booklist bookList, String number) {
        Scanner scanner = new Scanner(System.in);
        int shu = 0, num;
        String Name;
        boolean flag = false;
        List<book> books = bookList.getBooks();
        List<student> students = StudentList.getUser();
        ListIterator<book> bookListIterator = books.listIterator();
        ListIterator<student> studentListIterator = students.listIterator();
        while (studentListIterator.hasNext()) {
            student student = studentListIterator.next();
            if (number.equals(student.getStudentNumber())) {
                Name = student.getBookname();
                shu = student.getBooknumber();
                System.out.println(student);
                System.out.println("归还中");
                while (bookListIterator.hasNext()) {
                    book book = bookListIterator.next();
                    if (Name.equals(book.getName())) {
                        num = book.getNumber();
                        book.setNumber(num + shu);
                        student.setBooknumber(0);
                        student.setBookname("无");
                        System.out.println("归还成功");
                        System.out.println(book);
                        flag = true;
                    }
                }
            }
        }


        if (flag == false) {
            System.out.println("归还失败");
        }
    }

    public void amend(studentlist StudentList, String number) {
        System.out.print("请输入想要修改密码的学号： ");
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        List<student> students = StudentList.getUser();
        ListIterator<student> studentListIterator = students.listIterator();
        while (studentListIterator.hasNext()) {
            student student = studentListIterator.next();
            if (number.equals(student.getStudentNumber())) {
                System.out.print("请输入新密码： ");
                String pass = scanner.next();
                student.setPassword(pass);
                flag = true;
                System.out.println("修改成功");
            }
        }
        if (flag == false) {
            System.out.println("修改失败信息");
        }
    }
    public void self(studentlist StudentList,String number){
        List<student> students = StudentList.getUser();
        for (student use : students) {
            if (use.getStudentNumber().equals(number)) {
                System.out.println(use);
                break;
            }
        }
    }
}
