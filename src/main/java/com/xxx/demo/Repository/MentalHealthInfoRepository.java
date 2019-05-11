package com.xxx.demo.Repository;



import com.xxx.demo.Entity.MentalHealthInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface MentalHealthInfoRepository extends JpaRepository<MentalHealthInfo,Integer> {
    @Transactional
    @Modifying
    @Query(value = "insert into mentalhealthinfo set stu_id=?1,stu_name=?2,security_threat_type=?3,unusual_change_reference=?4,concern_level=?5,current_state?=6,school_action=?7,tutor_id=?8,tutor_phone=?9,talk_condition=?10",nativeQuery = true)
    public void createMentalHealthInfo(String stuID, String stuName, String securityThreatType, String unusualChangeReference, String concernLevel, String currentState, String schoolAction, String tutorID, String tutorPhone, String talkCondition);

    @Transactional
    @Modifying
    @Query(value = "update mentalhealthinfo set stu_id=?2,stu_name=?3,security_threat_type=?4,unusual_change_reference=?5,concern_level=?6,current_state?=7,school_action=?8,tutor_id=?9,tutor_phone=?10,talk_condition=?11 where id=?1",nativeQuery = true)
    public void updateMentalHealthInfo(int id,String stuID, String stuName, String securityThreatType, String unusualChangeReference, String concernLevel, String currentState, String schoolAction, String tutorID, String tutorPhone, String talkCondition);

    @Query(value = "select * from mentalhealthinfo where stu_id=?1",nativeQuery = true)
    public MentalHealthInfo getMentalHealthInfoByStuID(String stuID);

    @Query(value = "select * from mentalhealthinfo",nativeQuery = true)
    public List<MentalHealthInfo> getMentalHealthInfoList();
}
