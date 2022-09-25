package com.peter.LearnSpringBoot.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column
    private String subtitle;
    @Column
    private String description;
    @Column
    private Double price;
    @Column
    private User author;
}
