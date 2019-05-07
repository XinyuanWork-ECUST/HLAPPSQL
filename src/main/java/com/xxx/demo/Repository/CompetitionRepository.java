package com.xxx.demo.Repository;

import com.xxx.demo.Entity.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition,Integer> {

    @Transactional
    @Modifying
    @Query (value = "insert into competition set name=?1,rank=?2,level=?3",nativeQuery = true)
    public void createCompetiton(String name, String rank,String level);

    @Transactional
    @Modifying
    @Query(value = "update competition set name=?2,rank=?3,level=?4 where id=?1",nativeQuery = true)
    public void updateCompetition(int id,String name,String rank,String level);

    @Query(value = "select * from competition where name=?1",nativeQuery = true)
    public Competition getCompetitionByname(String name);

    @Query(value = "select * from competition",nativeQuery = true)
    public List<Competition> getCompetitionList();

}
