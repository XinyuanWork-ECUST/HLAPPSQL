package com.xxx.demo.Service;

import com.xxx.demo.Entity.StuCompetition;
import com.xxx.demo.Repository.StuCompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stucompetitionService")
public class StuCompetitionService {
    @Autowired
    StuCompetitionRepository stuCompetitionRepository;

    public List<StuCompetition>getStuCompetitionBystuID(String stuID){
        List<StuCompetition> list=stuCompetitionRepository.getStuCompetitionBystuID(stuID);
        return list;
    }

    public List<StuCompetition>getStuCompetitionList(){
        List<StuCompetition> list=stuCompetitionRepository.getStuCompetitionList();
        return list;
    }

    public boolean createStuCompetition(String stuID,String stuName,int competitionID,String competitionName,String no){
        try {
            stuCompetitionRepository.createStuCompetition(stuID,stuName,competitionID,competitionName,no);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void updateStuCompetition(int id,String stuID,String stuName,int competitionID,String competitionName,String no){
        stuCompetitionRepository.updateStuCompetition(id,stuID,stuName,competitionID,competitionName,no);
    }

    public void deleteStuCompetition(int id){
        stuCompetitionRepository.deleteById(id);
    }
    public void deleteSomeStuCompetition(int []id){
        for(int i=0;i<id.length;i++)
            stuCompetitionRepository.deleteById(id[i]);
    }
}
