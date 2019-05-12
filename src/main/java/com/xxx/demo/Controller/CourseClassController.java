package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.CourseClass;
import com.xxx.demo.Service.CourseClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class CourseClassController {
    @Autowired
    CourseClassService courseClassService;

    @PostMapping("/api/courseclass/createCourseClass")
    public Response createcourseclass(@RequestParam String name, @RequestParam Float credit, @RequestParam String teacherID, @RequestParam String classID){
        try{
            courseClassService.createCourseClass(name,credit,teacherID,classID);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败");
        }
    }

    @PostMapping("/api/courseclass/updateCourseClass")
    public Response updateCourseClass(@RequestParam int id,@RequestParam String name,@RequestParam Float credit,@RequestParam String teacherID, @RequestParam String classID){
        try{
            courseClassService.updateCourseClass(id,name,credit,teacherID,classID);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/courseclass/getCourseClassByclassID")
    public Response getCourseClassByclassID(@RequestParam String classID){
        List<CourseClass> thiscourseclass = courseClassService.getCourseClassByclassID(classID);
        if(thiscourseclass==null){
            return genFailResult("获取失败");
        }else{
            return genSuccessResult(thiscourseclass);
        }
    }

    @GetMapping("/api/courseclass/getCourseClassList")
    public Response getCourseClassList(){
        List<CourseClass> list=courseClassService.getCourseClassList();
        if(list.size()==0){
            return genFailResult("无记录或获取失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @PostMapping("/api/courseclass/deleteCourseClass")
    public Response deleteCourseClass(@RequestParam int id){
        try{
            courseClassService.deleteCourseClass(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

    @PostMapping("/api/courseclass/deleteSomeCourseClass")
    public Response deleteSomeCourseClass(@RequestParam(value = "id[]") int []id){
        try{
            courseClassService.deleteSomeCourseClass(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

}
