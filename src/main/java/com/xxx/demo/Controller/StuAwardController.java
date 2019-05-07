package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.Award;
import com.xxx.demo.Entity.StuAward;
import com.xxx.demo.Service.AwardService;
import com.xxx.demo.Service.StuAwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class StuAwardController {
    @Autowired
    StuAwardService stuAwardService;
    @Autowired
    AwardService awardService;

    @PostMapping("/api/stuaward/createStuAward")
    public Response createStuAward(@RequestParam String stuID, @RequestParam String stuName, @RequestParam String awardName, @RequestParam String no){
        try{
            //get AwardID
            Award award=awardService.getawardByname(awardName);
            stuAwardService.createStuAward(stuID,stuName,award.getId(),awardName,no);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败");
        }
    }

    @PostMapping("/api/stuaward/updateStuAward")
    public Response updateStuAward(@RequestParam int id,@RequestParam String stuID,@RequestParam String stuName,@RequestParam String awardName,@RequestParam String no){
        try{
            //get AwardID
            Award award=awardService.getawardByname(awardName);
            stuAwardService.updateStuAward(id,stuID,stuName,award.getId(),awardName,no);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/stuaward/getStuAwardBystuID")
    public Response getStuAwardBystuID(@RequestParam String stuID){
        List<StuAward> list=stuAwardService.getStuAwardBystuID(stuID);
        if(list==null||list.size()==0){
            return genFailResult("无记录或查询失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @GetMapping("/api/stuaward/getStuAwardList")
    public Response getStuAwardList(){
        List<StuAward> list=stuAwardService.getStuAwardList();
        if(list==null||list.size()==0){
            return genFailResult("无记录或查询失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @PostMapping("/api/stuaward/deleteStuAward")
    public Response deleteStuAward(@RequestParam int id){
        try {
            stuAwardService.deleteStuAward(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

    @PostMapping("/api/stuaward/deleteSomeStuAward")
    public Response deleteSomeStuAward(@RequestParam(value = "id[]") int []id){
        try{
            stuAwardService.deleteSomeStuAward(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }
}
