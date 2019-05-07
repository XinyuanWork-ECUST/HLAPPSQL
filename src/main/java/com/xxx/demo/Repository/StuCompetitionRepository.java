package com.xxx.demo.Repository;

import com.xxx.demo.Entity.StuCompetition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StuCompetitionRepository extends JpaRepository<StuCompetition,Integer> {
    @Transactional
    @Modifying
    @Query(value ="insert into stucompetition set stu_id=?1,stu_name=?2,competition_id=?3,competition_name=?4,no=?5",nativeQuery = true)
    public void createStuCompetition(String stuID,String stuName,int competitionID,String competitionName,String no);

    @Transactional
    @Modifying
    @Query(value = "update stucompetition set stu_id=?2,stu_name=?3,competition_id=?4,competition_name=?5,no=?6 where id=?1",nativeQuery = true)
    public void updateStuCompetition(int id,String stuID,String stuName,int competitionID,String competitionName,String no);

    @Query(value = "select * from stucompetition where stu_id=?1",nativeQuery = true)
    public List<StuCompetition> getStuCompetitionBystuID(String stuID);

    @Query(value = "select * from stucompetition",nativeQuery = true)
    public List<StuCompetition> getStuCompetitionList();


}
