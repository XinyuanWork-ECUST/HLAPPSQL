package com.xxx.demo.Service;

import com.xxx.demo.Entity.Punish;
import com.xxx.demo.Repository.PunishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("punishService")
public class PunishService {
    @Autowired
    PunishRepository punishRepository;

    public boolean createPunish(String type, String description,String punishmentCPC,int moralEducationScoreDeduct,String moralEducationScoreRestrict,boolean recordInFile){
        try{
            punishRepository.createPunish(type,description,punishmentCPC,moralEducationScoreDeduct,moralEducationScoreRestrict,recordInFile);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Punish getPunishBydescription(String description){
        Punish Punish=punishRepository.getPunishBydescription(description);
        return Punish;
    }

    public List<Punish> getPunishList(){
        List<Punish> list=punishRepository.getPunishList();
        return list;
    }

    public void updatePunish(int id,String type, String description,String punishmentCPC,int moralEducationScoreDeduct,String moralEducationScoreRestrict,boolean recordInFile){
        punishRepository.updatePunish(id,type,punishmentCPC,moralEducationScoreRestrict,moralEducationScoreDeduct,moralEducationScoreRestrict,recordInFile);
    }

    public void deletePunish(int id){
        punishRepository.deleteById(id);
    }

    public void deleteSomePunish(int []id){
        for(int i=0;i<id.length;i++){
            punishRepository.deleteById(id[i]);
        }
    }
}
