package com.xxx.demo.Controller;

import com.xxx.demo.Common.Response;
import com.xxx.demo.Entity.FilesInfo;
import com.xxx.demo.Service.FilesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.xxx.demo.Common.ResultGenerator.genFailResult;
import static com.xxx.demo.Common.ResultGenerator.genSuccessResult;

@RestController
@CrossOrigin
public class FilesInfoController {
    @Autowired
    FilesInfoService filesInfoService;

    @PostMapping("/api/filesinfo/createFilesInfo")
    public Response createFilesInfo(@RequestParam String stuID, @RequestParam String stuName, @RequestParam boolean seniorHighSchoolFileExist,boolean CCYLApplicationFormExist,boolean CCYLCertificateExist){
        try{
            filesInfoService.createFilesInfo(stuID,stuName,seniorHighSchoolFileExist,CCYLApplicationFormExist,CCYLCertificateExist);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("添加失败");
        }
    }

    @PostMapping("/api/filesinfo/updateFilesInfo")
    public Response updateFilesInfo(@RequestParam int id,@RequestParam String stuID, @RequestParam String stuName, @RequestParam boolean seniorHighSchoolFileExist,boolean CCYLApplicationFormExist,boolean CCYLCertificateExist){
        try{
            filesInfoService.updateFilesInfo(id,stuID,stuName,seniorHighSchoolFileExist,CCYLApplicationFormExist,CCYLCertificateExist);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("更新失败");
        }
    }

    @GetMapping("/api/filesinfo/getFilesInfoByStuID")
    public Response getFilesInfoByStuID(@RequestParam String stuID){
        FilesInfo thisfilesinfo=filesInfoService.getFilesInfoByStuID(stuID);
        if(thisfilesinfo==null){
            return genFailResult("获取失败");
        }else{
            return genSuccessResult(thisfilesinfo);
        }
    }

    @GetMapping("/api/filesinfo/getFilesInfoList")
    public Response getFilesInfoList(){
        List<FilesInfo> list=filesInfoService.getFilesInfoList();
        if(list.size()==0){
            return genFailResult("无记录或获取失败");
        }else{
            return genSuccessResult(list);
        }
    }

    @PostMapping("/api/filesinfo/deleteFilesInfo")
    public Response deleteFilesInfo(@RequestParam int id){
        try{
            filesInfoService.deleteFilesInfo(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }

    @PostMapping("/api/filesinfo/deleteSomeFilesInfo")
    public Response deleteSomeFilesInfo(@RequestParam(value = "id[]") int []id){
        try{
            filesInfoService.deleteSomeFilesInfo(id);
            return genSuccessResult(true);
        }catch (Exception e){
            return genFailResult("删除失败");
        }
    }
}
