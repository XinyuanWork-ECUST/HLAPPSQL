package com.xxx.demo.Service;

import com.xxx.demo.Entity.CourseClass;
import com.xxx.demo.Repository.CourseClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseclassService")
public class CourseClassService {
    @Autowired
    CourseClassRepository courseClassRepository;

    public List<CourseClass> getCourseClassByclassID(String classID){
        List<CourseClass> list=courseClassRepository.getCourseClassByclassID(classID);
        return list;
    }

    public List<CourseClass>getCourseClassList(){
        List<CourseClass> list=courseClassRepository.getCourseClassList();
        return list;
    }

    public boolean createCourseClass(String name,Float credit,String teacherID,String classID){
        try {
            courseClassRepository.createCourseClass(name,credit,teacherID,classID);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void updateCourseClass(int id,String name,Float credit,String teacherID,String classID){
        courseClassRepository.updateCourseClass(id,name,credit,teacherID,classID);
    }

    public void deleteCourseClass(int id){
        courseClassRepository.deleteById(id);
    }
    public void deleteSomeCourseClass(int []id){
        for(int i=0;i<id.length;i++)
            courseClassRepository.deleteById(id[i]);
    }
}
