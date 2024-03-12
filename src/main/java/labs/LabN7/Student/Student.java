package org.example.LabsTP.LabN7.Student;

import org.example.LabsTP.LabN7.BaseEntity;
import org.example.LabsTP.LabN7.Group.Group;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "student")
public class Student extends BaseEntity<Long> {
    private String name;
    private String surname;
    @Column(name = "group_id", insertable = false, updatable = false)
    private Long groupId;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    private Long id;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Student setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Long getGroupId() {
        return groupId;
    }

    public Student setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    public Group getGroup() {
        return group;
    }

    public Student setGroup(Group group) {
        this.group = group;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", groupId=" + groupId +
                ", group=" + group +
                ", id=" + id +
                "} " + super.toString();
    }

}