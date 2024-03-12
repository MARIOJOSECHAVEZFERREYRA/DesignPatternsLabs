package org.example.LabsTP.LabN7.Group;


import org.example.LabsTP.LabN7.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "groups")
public class Group extends BaseEntity<Long> {

    private String title;
    private Integer startYear;
    private Integer endYear;
    private Long departmentId;

    public String getTitle() {
        return title;
    }

    public Group setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public Group setStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public Group setEndYear(Integer endYear) {
        this.endYear = endYear;
        return this;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public Group setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }


}
