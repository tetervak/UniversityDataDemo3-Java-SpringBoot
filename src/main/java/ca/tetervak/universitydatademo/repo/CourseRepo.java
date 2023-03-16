package ca.tetervak.universitydatademo.repo;

import ca.tetervak.universitydatademo.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Integer> {
}
