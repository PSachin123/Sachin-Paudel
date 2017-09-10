
package com.itn.studentdb.StudentDaoImpl;

import com.itn.studentdb.StudentDao.StudentDao;
import com.itn.studentdb.StudentDatabase.StudentDatabase;
import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpl implements StudentDao{
    List<StudentDatabase> studentlist;

    public StudentDaoImpl() {
    studentlist = new ArrayList<>();
    }

    @Override
    public int insert(StudentDatabase p) {
        studentlist.add(p);
        return 1;
    }

    @Override
    public int delete(int id) {
        StudentDatabase todeletestudent = null;
    for(StudentDatabase s : studentlist){
        if(s.getId() == id){
            todeletestudent = s;
        }
    }
    studentlist.remove(todeletestudent);
    return 1;
    }

    @Override
    public StudentDatabase getbyId(int id) {
        return studentlist.get(id);
    }

    @Override
    public List<StudentDatabase> showall() {
     return studentlist;   
    }
}
