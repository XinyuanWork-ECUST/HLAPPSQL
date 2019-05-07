package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.Punish;
import com.xxx.demo.Entity.StuPunish;
import com.xxx.demo.Service.PunishService;
import com.xxx.demo.Service.StuPunishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class StuPunishController {
    @Autowired
    StuPunishService stupunishService;
    @Autowired
    PunishService punishService;

    @PostMapping("/api/stupunish/createStuPunish")
    public Response createStuPunish(@RequestParam String stuID, @RequestParam String stuName,@RequestParam String description, @RequestParam String date,@RequestParam String note){
        try{
            //get PunishID
            Punish punish=punishService.getPunishBydescription(description);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date dd=format.parse(date);
            stupunishService.createStuPunish(stuID,stuName,punish.getId(),description,dd,note);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败或惩罚表中不存在");
        }
    }

    @PostMapping("/api/stupunish/updateStuPunish")
    public Response updateStuPunish(@RequestParam int id,@RequestParam String stuID, @RequestParam String stuName,@RequestParam String description, @RequestParam String date,@RequestParam String note){
        try{
            //get PunishID
            Punish punish=punishService.getPunishBydescription(description);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date dd=format.parse(date);
            stupunishService.updateStuPunish(id,stuID,stuName,punish.getId(),description,dd,note);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/stupunish/getStuPunishBystuID")
    public Response getStuPunishBystuID(@RequestParam String stuID){
        List<StuPunish> list=stupunishService.getStuPunishBystuID(stuID);
        if(list==null||list.size()==0){
            return genFailResult("无记录或查询失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @GetMapping("/api/stupunish/getStuPunishList")
    public Response getStuPunishList(){
        List<StuPunish> list=stupunishService.getStuPunishList();
        if(list==null||list.size()==0){
            return genFailResult("无记录或查询失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @PostMapping("/api/stupunish/deleteStuPunish")
    public Response deleteStuPunish(@RequestParam int id){
        try {
            stupunishService.deleteStuPunish(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

    @PostMapping("/api/stupunish/deleteSomeStuPunish")
    public Response deleteSomeStuPunish(@RequestParam(value = "id[]") int []id){
        try{
            stupunishService.deleteSomeStuPunish(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

}
