package com.neidev.todo.domain.core.user.entity;

import com.neidev.todo.domain.core.planner.entity.Planner;
import jakarta.persistence.*;

@Entity(name = "USER")
@Table(name = "TB_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;

    // one to one
    private Planner planner;
}
