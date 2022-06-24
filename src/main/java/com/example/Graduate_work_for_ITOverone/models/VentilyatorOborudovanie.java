package com.example.Graduate_work_for_ITOverone.models;

import lombok.*;

import javax.persistence.*;

@Entity
public class VentilyatorOborudovanie {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "views")
    private int views;

    public VentilyatorOborudovanie(String name) {

    }

    public VentilyatorOborudovanie() {

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

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
