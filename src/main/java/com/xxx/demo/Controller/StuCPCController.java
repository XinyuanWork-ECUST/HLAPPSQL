package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Service.StuCPCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class StuCPCController {
    @Autowired
    StuCPCService stucpcService;

    @PostMapping("/api/stucpc/createStuCPC")
    public Response createstuCPC(@RequestParam String stuID,@RequestParam boolean isCCYL,@RequestParam String CCYLJoinDate,@RequestParam boolean requisitionSubmitted,@RequestParam String requisitionSubmitDate,@RequestParam boolean intermediatePartySchool, @RequestParam String intermediatePartySchoolDate,@RequestParam String intermediatePartySchoolLead,@RequestParam double intermediatePartySchoolScore,@RequestParam boolean seniorPartySchool,@RequestParam String seniorPartySchoolRequisitionSubmitDate,@RequestParam String seniorPartySchoolDate,@RequestParam double seniorPartySchoolScore, @RequestParam int seniorPartySchoolNo,@RequestParam boolean haveJoin,@RequestParam String joinDate,@RequestParam String condition) {
        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date ccylJoinDate=format.parse(CCYLJoinDate);
            Date requisitionsubmitDate=format.parse(requisitionSubmitDate);
            Date intermediatepartySchoolDate=format.parse(intermediatePartySchoolDate);
            Date seniorpartyschoolDate=format.parse(seniorPartySchoolDate);
            Date seniorpartyschoolrequisitionSubmitDate=format.parse(seniorPartySchoolRequisitionSubmitDate);
            Date joindate=format.parse(joinDate);
            stucpcService.createStuCPC(stuID,isCCYL,ccylJoinDate,requisitionSubmitted,requisitionsubmitDate,intermediatePartySchool,intermediatepartySchoolDate,intermediatePartySchoolLead,intermediatePartySchoolScore,seniorPartySchool,seniorpartyschoolrequisitionSubmitDate,seniorpartyschoolDate,seniorPartySchoolScore,seniorPartySchoolNo,haveJoin,joindate,condition);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败");
        }
    }

}
