package ca.tetervak.universitydatademo.repo;

import ca.tetervak.universitydatademo.business.UniversityService;
import ca.tetervak.universitydatademo.dao.UniversityFactory;
import ca.tetervak.universitydatademo.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test queries that involve clauses and expressions
 */

@SpringBootTest
public class FindByPropertyExpressions {

    @Autowired
    private UniversityService universityService;

    @Autowired
    private StudentRepo studentRepo;

    @Test
    public void findByClausesAndExpressions() {
        // Test Create
        UniversityFactory.fillUniversity(universityService);
        List<Student> students = universityService.findAllStudents();
        Student firstStudent = students.get(0);

        assertTrue(studentRepo.findTopByOrderByAgeDesc().get().getAge() == 22);

        assertEquals(firstStudent, studentRepo.findByAttendeeFirstNameAndAttendeeLastName(firstStudent.getAttendee().getFirstName(),
                firstStudent.getAttendee().getLastName()).get(0));

        studentRepo.findByAgeLessThan(20).stream().forEach(s-> assertTrue(s.getAge() < 20));

        studentRepo.findByAttendeeLastNameLike("%o%")
                .stream().forEach(s->assertTrue(s.getAttendee().getLastName().contains("o")));

        assertTrue(studentRepo.findFirstByOrderByAttendeeLastNameAsc().get().getAttendee().getLastName().equals("Doe"));

        List<Student> students3 = studentRepo.findTop3ByOrderByAgeDesc();
        assertTrue(students3.size() == 3);
        students3.stream().forEach(s -> assertTrue(s.getAge() != 18));
    }
}
