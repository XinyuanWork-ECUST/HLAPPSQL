package com.xxx.demo.Service;

import com.xxx.demo.Entity.StuAward;
import com.xxx.demo.Repository.StuAwardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stuawardService")
public class StuAwardService {
    @Autowired
    StuAwardRepository stuAwardRepository;

    public List<StuAward> getStuAwardBystuID(String stuID){
        List<StuAward> list=stuAwardRepository.getStuAwardBystuID(stuID);
        return list;
    }

    public List<StuAward>getStuAwardList(){
        List<StuAward> list=stuAwardRepository.getStuAwardList();
        return list;
    }

    public boolean createStuAward(String stuID,String stuName,int AwardID,String AwardName,String no){
        try {
            stuAwardRepository.createStuAward(stuID,stuName,AwardID,AwardName,no);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void updateStuAward(int id,String stuID,String stuName,int AwardID,String AwardName,String no){
        stuAwardRepository.updateStuAward(id,stuID,stuName,AwardID,AwardName,no);
    }

    public void deleteStuAward(int id){
        stuAwardRepository.deleteById(id);
    }
    public void deleteSomeStuAward(int []id){
        for(int i=0;i<id.length;i++)
            stuAwardRepository.deleteById(id[i]);
    }
}
