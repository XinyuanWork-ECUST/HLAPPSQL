package com.xxx.demo.Repository;

import com.xxx.demo.Entity.CourseClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CourseClassRepository  extends JpaRepository<CourseClass,Integer> {
    @Transactional
    @Modifying
    @Query(value ="insert into courseclass set name=?1,credit=?2,teacherID=?3,classID=?4",nativeQuery = true)
    public void createCourseClass(String name,Float credit,String teacherID,String classID);

    @Transactional
    @Modifying
    @Query(value = "update courseclass set name=?2,credit=?3,teacherID=?4,classID=?5 where id=?1",nativeQuery = true)
    public void updateCourseClass(int id,String name,Float credit,String teacherID,String classID);

    @Query(value = "select * from courseclass where classID=?1",nativeQuery = true)
    public List<CourseClass> getCourseClassByclassID(String classID);

    @Query(value = "select * from courseclass",nativeQuery = true)
    public List<CourseClass> getCourseClassList();
}
