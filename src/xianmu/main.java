package xianmu;
import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        studentlist StudentList = new studentlist();
        booklist booklist =new booklist();
        login Login = new login();
        booklist BookList = new booklist();
        while (true) {
            System.out.println("\t图书管理系统");
            System.out.println("请选择：\n 1.学生登录\n 2.管理员登录\n 3.新用户注册 \n 4.退出");
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> Login.studentlogin(StudentList, booklist);
                case 2 -> Login.managementlogin(booklist, StudentList);
                case 3 -> Login.signIn(StudentList);
                case 4 -> System.exit(0);
                default -> System.out.println("输入的数据有误, 请重新输入1-5进行选择");
            }
        }
    }
}