package com.xxx.demo.Repository;

import com.xxx.demo.Entity.Award;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AwardRepository extends JpaRepository<Award,Integer> {
    @Transactional
    @Modifying
    @Query(value = "insert into award set name=?1,rank=?2,level=?3",nativeQuery = true)
    public void createAward(String name, String rank,String level);

    @Transactional
    @Modifying
    @Query(value = "update award set name=?2,rank=?3,level=?4 where id=?1",nativeQuery = true)
    public void updateAward(int id,String name,String rank,String level);

    @Query(value = "select * from award where name=?1",nativeQuery = true)
    public Award getAwardByname(String name);

    @Query(value = "select * from award",nativeQuery = true)
    public List<Award> getAwardList();
}
