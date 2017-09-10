
package com.itn.studentdb.Controller;

import com.itn.studentdb.StudentDao.StudentDao;
import com.itn.studentdb.StudentDaoImpl.StudentDaoImpl;
import com.itn.studentdb.StudentDatabase.StudentDatabase;
import java.util.List;
import java.util.Scanner;


public class Controller {
   StudentDao studentdao = new StudentDaoImpl(); 
   Scanner read;
    public Controller(Scanner read) {
    this.read = read;
    
    }
    
   
   public void menu(){
        System.out.println("Choose your alternative:");
        System.out.println("1. Add new Student:");
        System.out.println("2. Remove chosen Student:");
        System.out.println("3. Show by ID:");
        System.out.println("4. Show all Students:");
        System.out.println("5. Exit");
    }
    public void add(){
        StudentDatabase p = new StudentDatabase();
             System.out.println("Enter student id:");
             int Id = read.nextInt();
             p.setId(Id);
             System.out.println("Enter Name:");
             String name = read.next();
             p.setName(name);
             System.out.println("Enter E-Mail:");
             String email= read.next();
             p.setEmail(email);
             System.out.println("Enter Subject:");
             String subject = read.next();
             p.setSubject(subject);
             studentdao.insert(p);
    }
    public void remove(){
        System.out.println("Enter the id to be deleted");
        int pid = read.nextInt();
        studentdao.delete(pid);
    }
    public void getbyId(){
        System.out.println("Enter thse id to be shown");
        int pid2 = read.nextInt();
        StudentDatabase q = studentdao.getbyId(pid2);
        System.out.println(q);
    }
    public void getbyId(int id){
        
    }
    public void showall(){
        List<StudentDatabase> studentlist = studentdao.showall();
        for(StudentDatabase stnt: studentlist){
            System.out.println(stnt);
        }
    }
    public void process(){
        int choice = read.nextInt();
        switch(choice){
            case 1:
                add();
            break;
            case 2:
                remove();
            break;
            case 3:
            getbyId();
                break;
            case 4:
                showall();
            break;
            case 5:
                System.exit(0);
            break;    
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

