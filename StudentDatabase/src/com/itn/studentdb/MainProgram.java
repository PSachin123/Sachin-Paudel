
package com.itn.studentdb;

import com.itn.studentdb.Controller.Controller;
import com.itn.studentdb.StudentDao.StudentDao;
import com.itn.studentdb.StudentDaoImpl.StudentDaoImpl;
import java.util.Scanner;


public class MainProgram {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller pc = new Controller(sc);
        
        while(true){
            pc.menu();
            pc.process();
            
            
            System.out.println("Do you wish to continue?[y/n]");
            String input = sc.next();
            if(input.equalsIgnoreCase("n"))
                break;
        }
    }
    
}
