package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.Competition;
import com.xxx.demo.Entity.StuCompetition;
import com.xxx.demo.Service.CompetitionService;
import com.xxx.demo.Service.StuCompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class StuCompetitionController {

    @Autowired
    StuCompetitionService stuCompetitionService;
    @Autowired
    CompetitionService competitionService;

    @PostMapping("/api/stucompetition/createStuCompetition")
    public Response createStuCompetition(@RequestParam String stuID,@RequestParam String stuName,@RequestParam String competitionName,@RequestParam String no){
        try{
            //get competitionID
            Competition competition=competitionService.getCompetitionByname(competitionName);
            stuCompetitionService.createStuCompetition(stuID,stuName,competition.getId(),competitionName,no);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败或竞赛表中不存在该竞赛");
        }
    }

    @PostMapping("/api/stucompetition/updateStuCompetition")
    public Response updateStuCompetition(@RequestParam int id,@RequestParam String stuID,@RequestParam String stuName,@RequestParam String competitionName,@RequestParam String no){
        try{
            //get competitionID
            Competition competition=competitionService.getCompetitionByname(competitionName);
            stuCompetitionService.updateStuCompetition(id,stuID,stuName,competition.getId(),competitionName,no);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/stucompetition/getStuCompetitionBystuID")
    public Response getStuCompetitionBystuID(@RequestParam String stuID){
        List<StuCompetition> list=stuCompetitionService.getStuCompetitionBystuID(stuID);
        if(list==null||list.size()==0){
            return genFailResult("无记录或查询失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @GetMapping("/api/stucompetition/getStuCompetitionList")
    public Response getStuCompetitionList(){
        List<StuCompetition> list=stuCompetitionService.getStuCompetitionList();
        if(list==null||list.size()==0){
            return genFailResult("无记录或查询失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @PostMapping("/api/stucompetition/deleteStuCompetition")
    public Response deleteStuCompetition(@RequestParam int id){
        try {
            stuCompetitionService.deleteStuCompetition(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

    @PostMapping("/api/stucompetition/deleteSomeStuCompetition")
    public Response deleteSomeStuCompetition(@RequestParam(value = "id[]") int []id){
        try{
            stuCompetitionService.deleteSomeStuCompetition(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

}
