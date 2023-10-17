package com.neidev.todo.domain.core.planner.entity;

import com.neidev.todo.domain.core.task.entity.Task;
import com.neidev.todo.domain.core.user.entity.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "PLANNER")
@Table(name = "TB_PLANNER")
public class Planner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(nullable = false, length = 20)
    private String title;

    // one to one
    private User user;

    // one to many
    private List<Task> tasks;

}
