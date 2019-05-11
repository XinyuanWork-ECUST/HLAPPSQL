package com.xxx.demo.Repository;


//import com.xxx.demo.Entity.Award;
import com.xxx.demo.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    @Transactional
    @Modifying
    @Query(value = "insert into course set name=?1,credit=?2,school=?3, type=?4",nativeQuery = true)
    public void createCourse(String name, Float credit, String school, String type);

    @Transactional
    @Modifying
    @Query(value = "update course set name=?2,credit=?3,school=?4,type=?5 where id=?1",nativeQuery = true)
    public void updateCourse(int id,String name, Float credit, String school, String type);

    @Query(value = "select * from course where name=?1",nativeQuery = true)
    public Course getCourseByname(String name);

    @Query(value = "select * from course",nativeQuery = true)
    public List<Course> getCourseList();

}
