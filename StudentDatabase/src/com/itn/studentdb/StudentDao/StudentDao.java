
package com.itn.studentdb.StudentDao;

import com.itn.studentdb.StudentDatabase.StudentDatabase;
import java.util.List;


public interface StudentDao {
    int insert(StudentDatabase p);
    int delete(int id);
    StudentDatabase getbyId(int id);
    List<StudentDatabase> showall();
}
