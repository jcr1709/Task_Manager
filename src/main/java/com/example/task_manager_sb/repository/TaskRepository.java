package com.example.task_manager_sb.repository;

import com.example.task_manager_sb.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
