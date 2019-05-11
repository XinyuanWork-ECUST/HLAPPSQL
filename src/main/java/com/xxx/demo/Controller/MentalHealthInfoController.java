package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.MentalHealthInfo;
import com.xxx.demo.Service.MentalHealthInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class MentalHealthInfoController {
    @Autowired
    MentalHealthInfoService mentalHealthInfoService;

    @PostMapping("/api/mentalhealthinfo/createMentalHealthInfo")
    public Response createMentalHealthInfo(@RequestParam String stuID, @RequestParam String stuName,@RequestParam String securityThreatType,@RequestParam String unusualChangeReference,@RequestParam String concernLevel,@RequestParam String currentState,@RequestParam String schoolAction,@RequestParam String tutorID,@RequestParam String tutorPhone,@RequestParam String talkCondition){
        try{
            mentalHealthInfoService.createMentalHealthInfo(stuID,stuName,securityThreatType,unusualChangeReference,concernLevel, currentState,schoolAction, tutorID,tutorPhone,talkCondition);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败");
        }
    }

    @PostMapping("/api/mentalhealthinfo/updateMentalHealthInfo")
    public Response updateMentalHealthInfo(@RequestParam int id,@RequestParam String stuID, @RequestParam String stuName,@RequestParam String securityThreatType,@RequestParam String unusualChangeReference,@RequestParam String concernLevel,@RequestParam String currentState,@RequestParam String schoolAction,@RequestParam String tutorID,@RequestParam String tutorPhone,@RequestParam String talkCondition){
        try{
            mentalHealthInfoService.updateMentalHealthInfo(id,stuID,stuName,securityThreatType,unusualChangeReference,concernLevel, currentState,schoolAction, tutorID,tutorPhone,talkCondition);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/mentalhealthinfo/getMentalHealthInfoByStuID")
    public Response getMentalHealthInfoByStuID(@RequestParam String stuID){
        MentalHealthInfo thismentalhealthinfo=mentalHealthInfoService.getMentalHealthInfoByStuID(stuID);
        if(thismentalhealthinfo==null){
            return genFailResult("获取失败");
        }else{
            return genSuccessResult(thismentalhealthinfo);
        }
    }

    @GetMapping("/api/mentalhealthinfo/getMentalHealthInfoList")
    public Response getMentalHealthInfoList(){
        List<MentalHealthInfo> list=mentalHealthInfoService.getMentalHealthInfoList();
        if(list.size()==0){
            return genFailResult("无记录或获取失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @PostMapping("/api/mentalhealthinfo/deleteMentalHealthInfo")
    public Response deleteMentalHealthInfo(@RequestParam int id){
        try{
            mentalHealthInfoService.deleteMentalHealthInfo(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

    @PostMapping("/api/mentalhealthinfo/deleteSomeMentalHealthInfo")
    public Response deleteSomeMentalHealthInfo(@RequestParam(value = "id[]") int []id){
        try{
            mentalHealthInfoService.deleteSomeMentalHealthInfo(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }
}
