package com.backend.studycenter.common.model.studycenter;

//public class MainCenter {







import com.backend.studycenter.common.model.course.Lesson;
import com.backend.studycenter.common.model.education.Group;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "mainCenter")
public class MainCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 50, nullable = false)
    private String name;

    private String description;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "mainCenter_group",
            joinColumns = @JoinColumn(name = "mainCenter_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private List<Group> groups;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "mainCenter_filial",
            joinColumns = @JoinColumn(name = "mainCenter_id"),
            inverseJoinColumns = @JoinColumn(name = "filial_id"))
    private List<Filial> filials;


    public MainCenter() {
    }

    public MainCenter(Long id, String name, String description,List<Group> groups,List<Filial> filials) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.groups=groups;
        this.filials=filials;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Filial> getFilials() {
        return filials;
    }

    public void setFilials(List<Filial> filials) {
        this.filials = filials;
    }
}
