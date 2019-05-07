package com.xxx.demo.Repository;

import com.xxx.demo.Entity.StuPunish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
public interface StuPunishRepository extends JpaRepository<StuPunish,Integer> {
    @Transactional
    @Modifying
    @Query(value ="insert into stupunish set stu_id=?1,stu_name=?2,punish_id=?3,description=?4,date=?5,note=?6",nativeQuery = true)
    public void createStuPunish(String stuID, String stuName, int punishID, String description, Date date,String note);

    @Transactional
    @Modifying
    @Query(value = "update stupunish set stu_id=?2,stu_name=?3,punish_id=?4,description=?5,date=?6,note=?7 where id=?1",nativeQuery = true)
    public void updateStuPunish(int id,String stuID, String stuName, int punishID, String description, Date date,String note);

    @Query(value = "select * from stupunish where stu_id=?1",nativeQuery = true)
    public List<StuPunish> getStuPunishBystuID(String stuID);

    @Query(value = "select * from stupunish",nativeQuery = true)
    public List<StuPunish> getStuPunishList();
}
