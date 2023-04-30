package ru.astondev.parsing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.astondev.parsing.model.CourseDtoOnce;
@Repository
public interface CourseEntityRepository extends JpaRepository<CourseDtoOnce, Long> {

}
