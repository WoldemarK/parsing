package ru.astondev.parsing.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.astondev.parsing.service.CourseService;

@RestController
@RequiredArgsConstructor
public class CourseParsingController {
    private final CourseService courseService;
    @GetMapping(value = "/getCourse")
    public String getListInformation() {
        return courseService.findCourseInfo().toString();
    }
}
