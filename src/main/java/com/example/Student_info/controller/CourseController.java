package com.example.Student_info.controller;
import com.example.Student_info.model.Course;
import com.example.Student_info.service.CourseService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/add-course")
    public Course addBook(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @GetMapping("/get-course/{id}")
    public Course getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }

    @PutMapping("/update-course/{id}")
    public void updateCourse(@PathVariable int id,@RequestBody Course newCourse) {
        courseService.updateCourseById(id, newCourse);
    }

    @DeleteMapping("delete-course/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseService.deleteCourseById(id);
    }

    @GetMapping("/get-all-courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourse();
    }
}
