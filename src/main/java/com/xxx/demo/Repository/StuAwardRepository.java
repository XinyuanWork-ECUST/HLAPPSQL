package com.xxx.demo.Repository;

import com.xxx.demo.Entity.StuAward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StuAwardRepository  extends JpaRepository<StuAward,Integer> {
    @Transactional
    @Modifying
    @Query(value ="insert into stuaward set stu_id=?1,stu_name=?2,award_id=?3,award_name=?4,no=?5",nativeQuery = true)
    public void createStuAward(String stuID,String stuName,int awardID,String awardName,String no);

    @Transactional
    @Modifying
    @Query(value = "update stuaward set stu_id=?2,stu_name=?3,award_id=?4,award_name=?5,no=?6 where id=?1",nativeQuery = true)
    public void updateStuAward(int id,String stuID,String stuName,int awardID,String awardName,String no);

    @Query(value = "select * from stuaward where stu_id=?1",nativeQuery = true)
    public List<StuAward> getStuAwardBystuID(String stuID);

    @Query(value = "select * from stuaward",nativeQuery = true)
    public List<StuAward> getStuAwardList();
}
