package com.sda.zd18.gr4.model;


import com.sda.zd18.gr4.utility.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private String login;
    private String password;
    private UserType userType;
    private Boolean isActive;

    @ManyToMany
    private Set<Course> courses;


}
