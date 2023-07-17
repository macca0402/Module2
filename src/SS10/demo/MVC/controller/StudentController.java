package SS10.demo.MVC.controller;

import SS10.demo.MVC.service.IStudentService;
import SS10.demo.MVC.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public static void menu(){
        IStudentService iStudentService= new StudentService();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("1.Thêm mới");
            System.out.println("2.Chỉnh sửa");
            System.out.println("3.Hiển thị danh sách");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iStudentService.addStudent();
                    break;
                case 2:
                    break;
                case 3:
                    iStudentService.displayAllStudent();
                    break;
            }
        }
    }

}
