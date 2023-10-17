package com.neidev.todo.domain.core.task.entity;

import com.neidev.todo.domain.core.planner.entity.Planner;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "TASK")
@Table(name = "TB_TASK")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false, length = 20)
    private String title;
    @Column(nullable = false)
    private String shortDescription;
    @Column(nullable = true)
    private String description;

    // many to one
    private Planner planner;

}
