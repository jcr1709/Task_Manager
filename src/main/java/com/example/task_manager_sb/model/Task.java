package com.example.task_manager_sb.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String task;
    private boolean completed;
    private String priority;

    public Task() {
    }

    public Task(String task, boolean completed, String priority) {
        this.task = task;
        this.completed = completed;
        this.priority=priority;
    }

    public Long getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
