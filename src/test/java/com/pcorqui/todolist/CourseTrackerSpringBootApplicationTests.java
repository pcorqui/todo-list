package com.pcorqui.todolist;

import com.pcorqui.todolist.entity.Course;
import com.pcorqui.todolist.persistence.CourseRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class CourseTrackerSpringBootApplicationTests {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private DataSource dataSource;

    @Test
    public void whenCountAllcoursesThenExpectFiveCourses() throws SQLException {
        ResultSet rs = null;
        int noOfCourses = 0;
        try(PreparedStatement ps = dataSource.getConnection().prepareStatement("SELECT COUNT(1) FROM " +
                "COURSES")){
            rs = ps.executeQuery();
            while(rs.next()){
                noOfCourses = rs.getInt(1);
            }
            assertThat(noOfCourses).isEqualTo(5L);
        }
        finally {
            if(rs != null){
                rs.close();
            }
        }
    }

    @Test
    public void givenCreateCourseWhenLoadTheCourseThenExpectSameCourse(){
        Course course = new Course("Rapid Spring Boot Appliccation Development","Spring", 4 ,"Spring Boot " +
                "gives all the power of the Spring Framework without all of the complexities");
        Course savedCourse = courseRepository.save(course);
        Assertions.assertThat(courseRepository.findById(savedCourse.getId()).get()).isEqualTo(course);
    }
}
