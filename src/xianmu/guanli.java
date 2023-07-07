package xianmu;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class guanli {

    public void lookAllBook(booklist booklist) {
        List<book> books = booklist.getBooks();
        for (book book : books) {
            System.out.println(book);
        }
    }

    public void lookBook(booklist booklist) {
        System.out.println("请输入要查询书籍的名字！");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        List<book> books = booklist.getBooks();
        boolean flag = false;
        for (book book : books) {
            //如果书籍存在，则输出书籍的信息
            if(book.getName().equals(bookName)) {
                System.out.println(book);
                flag = true;
            }
        }
        //如果不存在就输出不存在
        if(flag == false) {
            System.out.println("查询的书籍不存在！");
        }
    }


    public void deleteBook(booklist booklist) {
        System.out.print("请输入想要删除书籍的名字： ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        boolean flag = false;
        List<book> books = booklist.getBooks();
        ListIterator<book> bookListIterator = books.listIterator();
        while (bookListIterator.hasNext()) {
            book book = bookListIterator.next();
            if(bookName.equals(book.getName())) {
                bookListIterator.remove();
                flag = true;
                System.out.println("删除成功");
            }
        }
        if(flag == false) {
            System.out.println("书籍不存在，无法删除信息");
        }
    }


    public void addBook(booklist booklist) {
        System.out.println("请按照 书籍名 作者 数量 的顺序输入增加书籍的信息！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书籍名");
        String name = scanner.next();
        System.out.println("请输入书籍作者");
        String author = scanner.next();
        System.out.println("请输入书籍数量");
        int num = scanner.nextInt();
        boolean flag = false;
        List<book> books = booklist.getBooks();
        ListIterator<book> bookListIterator = books.listIterator();
        while (bookListIterator.hasNext()) {
            book book = bookListIterator.next();
            if(name.equals(book.getName())) {
              book.setNumber(book.getNumber()+num);
                flag = true;
                System.out.println("添加成功");
            }
        }
        if(flag == false) {
            book book = new book(name, author,num);
            booklist.getBooks().add(book);
            System.out.println("添加成功");
        }

    }


    public void chang(studentlist StudentList) {
        System.out.print("请输入想要修改密码的学号： ");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.next();
        boolean flag = false;
        List<student> students = StudentList.getUser();
        ListIterator<student> studentListIterator = students.listIterator();
        while (studentListIterator.hasNext()) {
            student student = studentListIterator.next();
            if(Name.equals(student.getStudentNumber())) {
                System.out.print("请输入新密码： ");
                String pass= scanner.next();
                student.setPassword(pass);
                flag = true;
                System.out.println("修改成功");
            }
        }
        if(flag == false) {
            System.out.println("用户不存在，无法修改信息");
        }
    }

    public void deleteuser(studentlist StudentList) {
        List<student> students = StudentList.getUser();
        for (student student:students) {
            System.out.println(student);
        }
    }

    public void deleteAUser(studentlist StudentList) {
        System.out.print("请输入想要删除的学号： ");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.next();
        boolean flag = false;
        List<student> students = StudentList.getUser();
        ListIterator<student> studentListIterator = students.listIterator();
        while (studentListIterator.hasNext()) {
            student student = studentListIterator.next();
            if(Name.equals(student.getStudentNumber())) {
                studentListIterator.remove();
                flag = true;
                System.out.println("删除成功");
            }
        }
        if(flag == false) {
            System.out.println("用户不存在，无法删除信息");
        }
    }
     public void  viewing(studentlist StudentList){
         System.out.println("请输入要查询的学号");
         Scanner scanner = new Scanner(System.in);
         String xue = scanner.next();
         List<student> students = StudentList.getUser();
         boolean flag = false;
         for (student student:students) {
             //如果书籍存在，则输出书籍的信息
             if(student.getStudentNumber().equals(xue)) {
                 System.out.println(student);
                 flag = true;
             }
         }
         //如果不存在就输出不存在
         if(flag == false) {
             System.out.println("查询的用户不存在！");
         }
     }
}
