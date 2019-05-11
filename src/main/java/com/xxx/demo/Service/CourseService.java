package com.xxx.demo.Service;


import com.xxx.demo.Entity.Course;
import com.xxx.demo.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public boolean createCourse(String name,Float credit,String school,String type){
        try{
            courseRepository.createCourse(name,credit,school,type);
            return true;
        }catch (Exception e){
            return false;
        }
    }


    public Course getcourseByname(String name){
        Course course=courseRepository.getCourseByname(name);
        return course;
    }

    public List<Course> getCourseList(){
        List<Course> list=courseRepository.getCourseList();
        return list;
    }

    public void updateCourse(int id,String name,Float credit,String school,String type){
        courseRepository.updateCourse(id,name,credit,school,type);
    }


    public void deleteCourse(int id){
        courseRepository.deleteById(id);
    }

    public void deleteSomeCourse(int []id){
        for(int i=0;i<id.length;i++){
            courseRepository.deleteById(id[i]);
        }
    }

}
