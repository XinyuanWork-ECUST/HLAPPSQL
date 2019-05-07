package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.Punish;
import com.xxx.demo.Service.PunishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class PunishController {
    @Autowired
    PunishService punishService;

    @PostMapping("/api/punish/createPunish")
    public Response createPunish(@RequestParam String type, @RequestParam String description,@RequestParam String punishmentCPC,@RequestParam int moralEducationScoreDeduct,@RequestParam String moralEducationScoreRestrict,@RequestParam boolean recordInFile){
        try{
            punishService.createPunish(type,description,punishmentCPC,moralEducationScoreDeduct,moralEducationScoreRestrict,recordInFile);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败");
        }
    }

    @PostMapping("/api/punish/updatePunish")
    public Response updatePunish(@RequestParam int id,@RequestParam String type,@RequestParam String description,@RequestParam String punishmentCPC,@RequestParam int moralEducationScoreDeduct,@RequestParam String moralEducationScoreRestrict,@RequestParam boolean recordInFile){
        try{
            punishService.updatePunish(id,type,description,punishmentCPC,moralEducationScoreDeduct,moralEducationScoreRestrict,recordInFile);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/punish/getPunishBydescription")
    public Response getPunishByname(@RequestParam String description){
        Punish thisPunish=punishService.getPunishBydescription(description);
        if(thisPunish==null){
            return genFailResult("获取失败");
        }else{
            return genSuccessResult(thisPunish);
        }
    }

    @GetMapping("/api/punish/getPunishList")
    public Response getPunishList(){
        List<Punish> list=punishService.getPunishList();
        if(list.size()==0){
            return genFailResult("无记录或获取失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @PostMapping("/api/punish/deletePunish")
    public Response deletePunish(@RequestParam int id){
        try{
            punishService.deletePunish(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

    @PostMapping("/api/punish/deleteSomePunish")
    public Response deleteSomePunish(@RequestParam(value = "id[]") int []id){
        try{
            punishService.deleteSomePunish(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }
}
