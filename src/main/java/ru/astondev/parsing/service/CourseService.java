package ru.astondev.parsing.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.astondev.parsing.model.CourseClient;
import ru.astondev.parsing.model.CourseDtoOnce;
import ru.astondev.parsing.repository.CourseEntityRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseEntityRepository courseEntityRepository;
    private final CourseClient courseClient;
    public List<CourseDtoOnce> findCourseInfo(){
        return courseEntityRepository.saveAll(courseClient.getCourses());
    }
}
