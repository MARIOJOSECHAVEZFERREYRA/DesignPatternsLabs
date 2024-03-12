package org.example.LabsTP.LabN7.Hibernate;

import org.example.LabsTP.LabN7.Group.EntityManagerGroupDao;
import org.example.LabsTP.LabN7.Group.Group;
import org.example.LabsTP.LabN7.Group.GroupDao;
import org.example.LabsTP.LabN7.Hibernate.HibernateConfiguration;
import org.example.LabsTP.LabN7.Student.EntityManagerStudentDao;
import org.example.LabsTP.LabN7.Student.Student;
import org.example.LabsTP.LabN7.Student.StudentDao;
import org.hibernate.SessionFactory;

import java.util.List;

public class HibernateSessionService {
    private final GroupDao groupDao;
    private final StudentDao studentDao;

    public HibernateSessionService() {
        SessionFactory sessionFactory = HibernateConfiguration.getFactory();
        studentDao = new EntityManagerStudentDao(sessionFactory);
        groupDao = new EntityManagerGroupDao(sessionFactory);
    }

    public void exec() {
        Student student = studentDao.findById(1L);
        System.out.println(student);


        List<Student> students = studentDao.findAll();
        System.out.println(students);

        Group group = groupDao.findById(1L);
        Student newStudent = new Student();
        newStudent.setName("Илья");
        newStudent.setSurname("Епифанов");
        newStudent.setGroup(group);
        studentDao.save(newStudent);
    }
}