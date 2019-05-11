package com.xxx.demo.Service;


import com.xxx.demo.Entity.MentalHealthInfo;
import com.xxx.demo.Repository.MentalHealthInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mentalhealthinfoservice")
public class MentalHealthInfoService {
    @Autowired
    MentalHealthInfoRepository mentalHealthInfoRepository;

    public boolean createMentalHealthInfo(String stuID, String stuName, String securityThreatType, String unusualChangeReference, String concernLevel, String currentState, String schoolAction, String tutorID, String tutorPhone, String talkCondition){
        try{
            mentalHealthInfoRepository.createMentalHealthInfo(stuID,stuName,securityThreatType,unusualChangeReference,concernLevel, currentState,schoolAction, tutorID,tutorPhone,talkCondition);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public MentalHealthInfo getMentalHealthInfoByStuID(String stuID){
        MentalHealthInfo mentalHealthInfo=mentalHealthInfoRepository.getMentalHealthInfoByStuID(stuID);
        return mentalHealthInfo;
    }

    public List<MentalHealthInfo> getMentalHealthInfoList(){
        List<MentalHealthInfo> list=mentalHealthInfoRepository.getMentalHealthInfoList();
        return list;
    }

    public void updateMentalHealthInfo(int id,String stuID, String stuName, String securityThreatType, String unusualChangeReference, String concernLevel, String currentState, String schoolAction, String tutorID, String tutorPhone, String talkCondition){
        mentalHealthInfoRepository.updateMentalHealthInfo(id,stuID,stuName,securityThreatType,unusualChangeReference,concernLevel, currentState,schoolAction, tutorID,tutorPhone,talkCondition);
    }

    public void deleteMentalHealthInfo(int id){
        mentalHealthInfoRepository.deleteById(id);
    }

    public void deleteSomeMentalHealthInfo(int []id){
        for(int i=0;i<id.length;i++){
            mentalHealthInfoRepository.deleteById(id[i]);
        }
    }
}
