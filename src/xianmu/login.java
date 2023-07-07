package xianmu;

import javax.swing.plaf.metal.MetalIconFactory;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class login {
    public void studentlogin(studentlist StudentList, booklist bookList) {
        yonghu yong = new yonghu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号");
        String xue = scanner.next();
        List<student> users = StudentList.getUser();
        System.out.println("请输入密码");
        String mi = scanner.next();
        boolean flag = true;
        for (student use : users) {
            if (use.getStudentNumber().equals(xue) && use.getPassword().equals(mi)) {
                System.out.println("登录成功");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("账号或密码错误");
        } else {
            System.out.println("欢迎进入用户界面");
            while (true) {
                boolean flagg = false;
                yonghu yonghu = new yonghu();
                System.out.println("请输入需要操作的编号：\n1.查阅书籍信息  \n2.借阅书籍  \n3.归还书籍  \n4.修改密码  \n5.查看个人信息 \n6.退出  \n7.退出体统");
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        //1.查阅书籍信息
                        yonghu.lookBook(bookList);
                        break;
                    case 2:
                        //2.借阅书籍
                        yonghu.borrowBook(StudentList, bookList, xue);
                        break;
                    case 3:
                        //3.归还书籍
                        yonghu.returnBook(StudentList, bookList, xue);
                        break;
                    case 4:
                        yonghu.amend(StudentList, xue);
                        break;
                    case 5:
                        yonghu.self(StudentList,xue);
                        break;
                    case 6:
                        //6.退出
                        flagg = true;
                        break;
                    case 7:
                        //7.退出体统
                        System.exit(0);

                    default:
                        System.out.println("输入的数据有误, 请重新输入1-7进行选择");
                        break;
                }
                if (flagg == true) {
                    break;
                }
            }
        }

    }

    public void managementlogin(booklist booklist, studentlist StudentList) {
        Scanner scaner = new Scanner(System.in);
        int ma = 123456;
        System.out.println("请输入密码");
        int mima = scaner.nextInt();
        if (mima == ma) {
            System.out.println("管理员登录成功");
            System.out.println("欢迎进入管理员后台");
            guanli guanli = new guanli();
            while (true) {
                boolean flag = false;
                System.out.println("请输入需要操作的编号：\n1.查看书籍列表  \n2.查询书籍信息  \n3.删除书籍信息  \n4.添加书籍  \n5.修改用户密码  \n6.查看所有用户借阅信息  \n7.查看用户信息  \n8.删除用户  \n9.退出系统  \n10.退出");
                int number = scaner.nextInt();
                switch (number) {
                    case 1:
                        //1.查看书籍列表
                        guanli.lookAllBook(booklist);
                        break;
                    case 2:
                        //2.查询书籍信息
                        guanli.lookBook(booklist);
                        break;
                    case 3:
                        //3.删除书籍信息
                        guanli.deleteBook(booklist);
                        break;
                    case 4:
                        //4.添加书籍
                        guanli.addBook(booklist);
                        break;
                    case 5:
                        //5.修改用户密码
                        guanli.chang(StudentList);
                        break;
                    case 6:
                        //6.查看所有用户借阅信息
                        guanli.deleteuser(StudentList);
                        break;
                    case 7:
                        //7.查看用户信息
                        guanli.viewing(StudentList);
                        break;
                    case 8:
                        //8.删除用户
                        guanli.deleteAUser(StudentList);
                        break;
                    case 9:
                        //9.退出体统
                        System.exit(0);
                    case 10:
                        //10.退出
                        flag = true;
                        break;
                    default:
                        System.out.println("输入的数据有误, 请重新输入1-10进行选择");
                        break;
                }
                if (flag) {
                    break;
                }
            }
        } else {
            System.out.println("密码错误");
        }

    }

    public void signIn(studentlist StudentList) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号");
        String xue = scanner.next();
        List<student> users = StudentList.getUser();


        boolean flag = true;
        for (student use : users) {
            if (use.getStudentNumber().equals(xue)) {
                System.out.println("该用户已存在");
                flag = false;
            }
        }
        while (flag) {
            System.out.println("请输入密码");
            String mi = scanner.next();
            System.out.println("请再次确定输入密码");
            String ma = scanner.next();
            if (mi.equals(ma)) {
                System.out.println("请输入昵称");
                String ni = scanner.next();
                student yonghu = new student(xue, mi, ni, "无", 0);
                users.add(yonghu);
                System.out.println("添加成功");
                break;
            } else {
                System.out.println("两次密码不相同");
                break;
            }
        }
    }
}