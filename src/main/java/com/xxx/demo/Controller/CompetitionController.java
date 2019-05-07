package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.Competition;
import com.xxx.demo.Service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class CompetitionController {
    @Autowired
    CompetitionService competitionService;

    @PostMapping("/api/competition/createCompetition")
    public Response createCompetition(@RequestParam String name,@RequestParam String rank,@RequestParam String level){
        try{
            competitionService.createCompetition(name,rank,level);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败");
        }
    }

    @PostMapping("/api/competition/updateCompetition")
    public Response updateCompetition(@RequestParam int id,@RequestParam String name,@RequestParam String rank,@RequestParam String level){
        try{
            competitionService.updateCompetition(id,name,rank,level);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/competition/getCompetitionByname")
    public Response getCompetitionByname(@RequestParam String name){
        Competition thisCompetition=competitionService.getCompetitionByname(name);
        if(thisCompetition==null){
            return genFailResult("获取失败");
        }else{
            return genSuccessResult(thisCompetition);
        }
    }

    @GetMapping("/api/competition/getCompetitionList")
    public Response getCompetitionList(){
        List<Competition> list=competitionService.getCompetitionList();
        if(list.size()==0){
            return genFailResult("无记录或获取失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @PostMapping("/api/competition/deleteCompetition")
    public Response deleteCompetition(@RequestParam int id){
        try{
            competitionService.deleteCompetition(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

    @PostMapping("/api/competition/deleteSomeCompetition")
    public Response deleteSomeCompetition(@RequestParam(value = "id[]") int []id){
        try{
            competitionService.deleteSomeCompetition(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }
}
