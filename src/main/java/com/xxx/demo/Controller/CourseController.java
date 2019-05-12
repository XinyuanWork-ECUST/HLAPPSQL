package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.Course;
import com.xxx.demo.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("/api/course/createCourse")
    public Response createcourse(@RequestParam String name, @RequestParam Float credit, @RequestParam String school, @RequestParam String type){
        try{
            courseService.createCourse(name,credit,school,type);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败");
        }
    }

    @PostMapping("/api/course/updateCourse")
    public Response updateCourse(@RequestParam int id,@RequestParam String name,@RequestParam Float credit,@RequestParam String school, @RequestParam String type){
        try{
            courseService.updateCourse(id,name,credit,school,type);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/course/getCourseByname")
    public Response getcourseByname(@RequestParam String name){
        Course thiscourse=courseService.getcourseByname(name);
        if(thiscourse==null){
            return genFailResult("获取失败");
        }else{
            return genSuccessResult(thiscourse);
        }
    }

    @GetMapping("/api/course/getCourseList")
    public Response getcourseList(){
        List<Course> list=courseService.getCourseList();
        if(list.size()==0){
            return genFailResult("无记录或获取失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @PostMapping("/api/course/deleteCourse")
    public Response deleteCourse(@RequestParam int id){
        try{
            courseService.deleteCourse(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

    @PostMapping("/api/course/deleteSomeCourse")
    public Response deleteSomeCourse(@RequestParam(value = "id[]") int []id){
        try{
            courseService.deleteSomeCourse(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

}
