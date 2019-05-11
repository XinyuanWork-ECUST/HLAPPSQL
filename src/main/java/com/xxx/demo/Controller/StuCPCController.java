package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.StuCPC;
import com.xxx.demo.Service.StuCPCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class StuCPCController {
    @Autowired
    StuCPCService stucpcService;

    @PostMapping("/api/stucpc/createStuCPC")
    public Response createStuCPC(@RequestParam int stuID, @RequestParam boolean isCCYL, @RequestParam Date CCYLJoinDate, @RequestParam boolean requisitionSubmitted, @RequestParam Date requisitionSubmitDate,@RequestParam boolean intermediatePartySchool,@RequestParam Date intermediatePartySchoolDate,@RequestParam int intermediatePartySchoolLead,@RequestParam double intermediatePartySchoolScore,@RequestParam boolean seniorPartySchool,@RequestParam Date seniorPartySchoolRequisitionSubmitDate,@RequestParam Date seniorPartySchoolDate,@RequestParam double seniorPartySchoolScore,@RequestParam int seniorPartySchoolNo,@RequestParam boolean haveJoin,@RequestParam Date joinDate,@RequestParam String condition){
        try{
            stucpcService.createStuCPC(stuID, isCCYL,CCYLJoinDate,requisitionSubmitted,requisitionSubmitDate,intermediatePartySchool,intermediatePartySchoolDate,intermediatePartySchoolLead,intermediatePartySchoolScore,seniorPartySchool,seniorPartySchoolRequisitionSubmitDate,seniorPartySchoolDate,seniorPartySchoolScore,seniorPartySchoolNo,haveJoin,joinDate,condition);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败");
        }
    }

    @PostMapping("/api/stucpc/updateStuCPC")
    public Response updateStuCPC(@RequestParam int id,@RequestParam int stuID, @RequestParam boolean isCCYL, @RequestParam Date CCYLJoinDate, @RequestParam boolean requisitionSubmitted, @RequestParam Date requisitionSubmitDate,@RequestParam boolean intermediatePartySchool,@RequestParam Date intermediatePartySchoolDate,@RequestParam int intermediatePartySchoolLead,@RequestParam double intermediatePartySchoolScore,@RequestParam boolean seniorPartySchool,@RequestParam Date seniorPartySchoolRequisitionSubmitDate,@RequestParam Date seniorPartySchoolDate,@RequestParam double seniorPartySchoolScore,@RequestParam int seniorPartySchoolNo,@RequestParam boolean haveJoin,@RequestParam Date joinDate,@RequestParam String condition){
        try{
            stucpcService.updateStuCPC(id,stuID, isCCYL,CCYLJoinDate,requisitionSubmitted,requisitionSubmitDate,intermediatePartySchool,intermediatePartySchoolDate,intermediatePartySchoolLead,intermediatePartySchoolScore,seniorPartySchool,seniorPartySchoolRequisitionSubmitDate,seniorPartySchoolDate,seniorPartySchoolScore,seniorPartySchoolNo,haveJoin,joinDate,condition);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/stucpc/getStuCPCByStuID")
    public Response getStuCPCByStuID(@RequestParam int StuID){
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
