package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.StuCPC;
import com.xxx.demo.Service.StuCPCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import java.text.SimpleDateFormat;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class StuCPCController {
    @Autowired
    StuCPCService stucpcService;

    @PostMapping("/api/stucpc/createStuCPC")
    public Response createStuCPC(@RequestParam String stuID, @RequestParam boolean isCCYL, @RequestParam String CCYLJoinDate, @RequestParam boolean requisitionSubmitted, @RequestParam String requisitionSubmitDate,@RequestParam boolean intermediatePartySchool,@RequestParam String intermediatePartySchoolDate,@RequestParam int intermediatePartySchoolLead,@RequestParam double intermediatePartySchoolScore,@RequestParam boolean seniorPartySchool,@RequestParam String seniorPartySchoolRequisitionSubmitDate,@RequestParam String seniorPartySchoolDate,@RequestParam double seniorPartySchoolScore,@RequestParam int seniorPartySchoolNo,@RequestParam boolean haveJoin,@RequestParam String joinDate,@RequestParam String condition){
        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d1=format.parse(CCYLJoinDate);
            Date d2=format.parse(requisitionSubmitDate);
            Date d3=format.parse(intermediatePartySchoolDate);
            Date d4=format.parse(seniorPartySchoolRequisitionSubmitDate);
            Date d5=format.parse(seniorPartySchoolDate);
            Date d6=format.parse(joinDate);
            stucpcService.createStuCPC(stuID, isCCYL,d1,requisitionSubmitted,d2,intermediatePartySchool,d3,intermediatePartySchoolLead,intermediatePartySchoolScore,seniorPartySchool,d4,d5,seniorPartySchoolScore,seniorPartySchoolNo,haveJoin,d6,condition);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败");
        }
    }

    @PostMapping("/api/stucpc/updateStuCPC")
    public Response updateStuCPC(@RequestParam int id,@RequestParam String stuID, @RequestParam boolean isCCYL, @RequestParam String CCYLJoinDate, @RequestParam boolean requisitionSubmitted, @RequestParam String requisitionSubmitDate,@RequestParam boolean intermediatePartySchool,@RequestParam String intermediatePartySchoolDate,@RequestParam int intermediatePartySchoolLead,@RequestParam double intermediatePartySchoolScore,@RequestParam boolean seniorPartySchool,@RequestParam String seniorPartySchoolRequisitionSubmitDate,@RequestParam String seniorPartySchoolDate,@RequestParam double seniorPartySchoolScore,@RequestParam int seniorPartySchoolNo,@RequestParam boolean haveJoin,@RequestParam String joinDate,@RequestParam String condition){
        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d1=format.parse(CCYLJoinDate);
            Date d2=format.parse(requisitionSubmitDate);
            Date d3=format.parse(intermediatePartySchoolDate);
            Date d4=format.parse(seniorPartySchoolRequisitionSubmitDate);
            Date d5=format.parse(seniorPartySchoolDate);
            Date d6=format.parse(joinDate);
            stucpcService.updateStuCPC(id,stuID, isCCYL,d1,requisitionSubmitted,d2,intermediatePartySchool,d3,intermediatePartySchoolLead,intermediatePartySchoolScore,seniorPartySchool,d4,d5,seniorPartySchoolScore,seniorPartySchoolNo,haveJoin,d6,condition);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/stucpc/getStuCPCByStuID")
    public Response getStuCPCByStuID(@RequestParam String StuID){
        StuCPC thisStuCPC=stucpcService.getStuCPCByStuID(StuID);
        if(thisStuCPC==null){
            return genFailResult("获取失败");
        }else{
            return genSuccessResult(thisStuCPC);
        }
    }

    @GetMapping("/api/stucpc/getStuCPCList")
    public Response getStuCPCList(){
        List<StuCPC> list=stucpcService.getStuCPCList();
        if(list.size()==0){
            return genFailResult("无记录或获取失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @PostMapping("/api/stucpc/deleteStuCPC")
    public Response deleteStuCPC(@RequestParam int id){
        try{
            stucpcService.deleteStuCPC(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

    @PostMapping("/api/stucpc/deleteSomeStuCPC")
    public Response deleteSomeStuCPC(@RequestParam(value = "id[]") int []id){
        try{
            stucpcService.deleteSomeStuCPC(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }
}
