package com.peter.LearnSpringBoot.models;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Data
@Entity
@Audited
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false )
    private String email;
    @Column(nullable = false )
    private String firstName;
    @Column(nullable = false )
    private String lastName;
    @Column(name="full_name", updatable=false, insertable=false)
    private String fullName;
    @Column
    private String phone;
}
