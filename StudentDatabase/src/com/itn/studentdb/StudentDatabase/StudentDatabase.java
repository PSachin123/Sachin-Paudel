
package com.itn.studentdb.StudentDatabase;


public class StudentDatabase {
    int id;
    String name;
    String email;
    String subject;
    public StudentDatabase(){
    
}   

    public StudentDatabase(int id, String name, String email, String subject) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentDatabase{" + "id=" + id + ", name=" + name + ", email=" + email + ", subject=" + subject + '}';
    }

  

}
