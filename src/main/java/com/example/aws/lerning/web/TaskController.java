package com.example.aws.lerning.web;

import com.example.aws.lerning.dao.TaskRepository;
import com.example.aws.lerning.model.Task;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class TaskController {

    private TaskRepository taskRepository;

    @GetMapping("/task")
    public ResponseEntity<List<Task>> getTasks() {
        List<Task> taskList = taskRepository.findAll();
        return ResponseEntity.ok(taskList);
    }
}
