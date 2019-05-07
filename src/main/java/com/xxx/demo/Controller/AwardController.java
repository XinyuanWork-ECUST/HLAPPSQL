package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.Award;
import com.xxx.demo.Service.AwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class AwardController {
    @Autowired
    AwardService awardService;

    @PostMapping("/api/award/createAward")
    public Response createaward(@RequestParam String name, @RequestParam String rank, @RequestParam String level){
        try{
            awardService.createAward(name,rank,level);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败");
        }
    }

    @PostMapping("/api/award/updateAward")
    public Response updateAward(@RequestParam int id,@RequestParam String name,@RequestParam String rank,@RequestParam String level){
        try{
            awardService.updateAward(id,name,rank,level);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/award/getAwardByname")
    public Response getawardByname(@RequestParam String name){
        Award thisaward=awardService.getawardByname(name);
        if(thisaward==null){
            return genFailResult("获取失败");
        }else{
            return genSuccessResult(thisaward);
        }
    }

    @GetMapping("/api/award/getAwardList")
    public Response getawardList(){
        List<Award> list=awardService.getAwardList();
        if(list.size()==0){
            return genFailResult("无记录或获取失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @PostMapping("/api/award/deleteAward")
    public Response deleteAward(@RequestParam int id){
        try{
            awardService.deleteAward(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

    @PostMapping("/api/award/deleteSomeAward")
    public Response deleteSomeAward(@RequestParam(value = "id[]") int []id){
        try{
            awardService.deleteSomeAward(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }
}
