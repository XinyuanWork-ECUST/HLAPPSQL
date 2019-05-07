package com.xxx.demo.Service;

import com.xxx.demo.Entity.Competition;
import com.xxx.demo.Repository.CompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("competitionservice")
public class CompetitionService {
    @Autowired
    CompetitionRepository competitionRepository;

    public boolean createCompetition(String name,String rank,String level){
        try{
            competitionRepository.createCompetiton(name,rank,level);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Competition getCompetitionByname(String name){
        Competition competition=competitionRepository.getCompetitionByname(name);
        return competition;
    }

    public List<Competition>getCompetitionList(){
        List<Competition> list=competitionRepository.getCompetitionList();
        return list;
    }

    public void updateCompetition(int id,String name,String rank,String level){
        competitionRepository.updateCompetition(id,name,rank,level);
    }

    public void deleteCompetition(int id){
        competitionRepository.deleteById(id);
    }

    public void deleteSomeCompetition(int []id){
        for(int i=0;i<id.length;i++){
            competitionRepository.deleteById(id[i]);
        }
    }

}
