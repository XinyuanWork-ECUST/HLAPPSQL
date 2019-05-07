package com.xxx.demo.Repository;

import com.xxx.demo.Entity.Punish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PunishRepository extends JpaRepository<Punish,Integer> {
    @Transactional
    @Modifying
    @Query(value = "insert into punish set type=?1,description=?2,punishment_cpc=?3,moraleducationscore_deduct=?4,moraleducationscore_restrict=?5,recordin_file=?6",nativeQuery = true)
    public void createPunish(String type, String description,String punishmentCPC,int moralEducationScoreDeduct,String moralEducationScoreRestrict,boolean recordInFile);

    @Transactional
    @Modifying
    @Query(value = "update punish set type=?2,description=?3,punishment_cpc=?4,moraleducationscore_deduct=?5,moraleducationscore_restrict=?6,recordin_file=?7 where id=?1",nativeQuery = true)
    public void updatePunish(int id,String type, String description,String punishmentCPC,int moralEducationScoreDeduct,String moralEducationScoreRestrict,boolean recordInFile);

    @Query(value = "select * from punish where description=?1",nativeQuery = true)
    public Punish getPunishBydescription(String description);

    @Query(value = "select * from punish",nativeQuery = true)
    public List<Punish> getPunishList();
}
