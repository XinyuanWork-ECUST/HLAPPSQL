package com.xxx.demo.Service;

import com.xxx.demo.Entity.Award;
import com.xxx.demo.Repository.AwardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("awardService")
public class AwardService {
    @Autowired
    AwardRepository awardRepository;

    public boolean createAward(String name,String rank,String level){
        try{
            awardRepository.createAward(name,rank,level);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Award getawardByname(String name){
        Award award=awardRepository.getAwardByname(name);
        return award;
    }

    public List<Award> getAwardList(){
        List<Award> list=awardRepository.getAwardList();
        return list;
    }

    public void updateAward(int id,String name,String rank,String level){
        awardRepository.updateAward(id,name,rank,level);
    }

    public void deleteAward(int id){
        awardRepository.deleteById(id);
    }

    public void deleteSomeAward(int []id){
        for(int i=0;i<id.length;i++){
            awardRepository.deleteById(id[i]);
        }
    }
}
