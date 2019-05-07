package com.xxx.demo.Service;

import com.xxx.demo.Entity.StuPunish;
import com.xxx.demo.Repository.StuPunishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("stupunishService")
public class StuPunishService {
    @Autowired
    StuPunishRepository stupunishRepository;

    public List<StuPunish> getStuPunishBystuID(String stuID){
        List<StuPunish> list=stupunishRepository.getStuPunishBystuID(stuID);
        return list;
    }

    public List<StuPunish>getStuPunishList(){
        List<StuPunish> list=stupunishRepository.getStuPunishList();
        return list;
    }

    public boolean createStuPunish(String stuID, String stuName, int punishID, String description, Date date,String note){
        try {
            stupunishRepository.createStuPunish(stuID,stuName,punishID,description,date,note);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void updateStuPunish(int id,String stuID, String stuName, int punishID, String description, Date date,String note){
        stupunishRepository.updateStuPunish(id,stuID,stuName,punishID,description,date,note);
    }

    public void deleteStuPunish(int id){
        stupunishRepository.deleteById(id);
    }
    public void deleteSomeStuPunish(int []id){
        for(int i=0;i<id.length;i++)
            stupunishRepository.deleteById(id[i]);
    }
}
