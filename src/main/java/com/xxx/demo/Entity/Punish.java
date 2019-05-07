package com.xxx.demo.Entity;

import javax.persistence.*;

@Entity(name = "punish")
public class Punish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column
    String type;

    @Column
    String description;

    @Column(name = "punishment_cpc")
    String punishmentCPC;

    @Column(name = "moraleducationscore_deduct")
    int   moralEducationScoreDeduct;

    @Column(name = " moraleducationscore_restrict")
    String  moralEducationScoreRestrict;

    @Column(name = "recordin_file")
    boolean recordInFile;

    public Punish(){}
    public Punish(String type, String description, String punishmentCPC, int moralEducationScoreDeduct, String moralEducationScoreRestrict, boolean recordInFile) {
        this.type = type;
        this.description = description;
        this.punishmentCPC = punishmentCPC;
        this.moralEducationScoreDeduct = moralEducationScoreDeduct;
        this.moralEducationScoreRestrict = moralEducationScoreRestrict;
        this.recordInFile = recordInFile;
    }

    @Override
    public String toString() {
        return "Punish{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", punishmentCPC='" + punishmentCPC + '\'' +
                ", moralEducationScoreDeduct=" + moralEducationScoreDeduct +
                ", moralEducationScoreRestrict='" + moralEducationScoreRestrict + '\'' +
                ", recordInFile=" + recordInFile +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPunishmentCPC() {
        return punishmentCPC;
    }

    public void setPunishmentCPC(String punishmentCPC) {
        this.punishmentCPC = punishmentCPC;
    }

    public int getMoralEducationScoreDeduct() {
        return moralEducationScoreDeduct;
    }

    public void setMoralEducationScoreDeduct(int moralEducationScoreDeduct) {
        this.moralEducationScoreDeduct = moralEducationScoreDeduct;
    }

    public String getMoralEducationScoreRestrict() {
        return moralEducationScoreRestrict;
    }

    public void setMoralEducationScoreRestrict(String moralEducationScoreRestrict) {
        this.moralEducationScoreRestrict = moralEducationScoreRestrict;
    }

    public boolean isRecordInFile() {
        return recordInFile;
    }

    public void setRecordInFile(boolean recordInFile) {
        this.recordInFile = recordInFile;
    }
}
