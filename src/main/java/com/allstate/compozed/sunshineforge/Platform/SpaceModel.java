package com.allstate.compozed.sunshineforge.Platform;

import javax.persistence.*;

@Entity
@Table(name = "space")
final class SpaceModel {

    @OneToMany
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int disk_quotamb;
    private boolean memory_quotamb;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDisk_quotamb() {
        return disk_quotamb;
    }

    public void setDisk_quotamb(int disk_quotamb) {
        this.disk_quotamb = disk_quotamb;
    }

    public boolean isMemory_quotamb() {
        return memory_quotamb;
    }

    public void setMemory_quotamb(boolean memory_quotamb) {
        this.memory_quotamb = memory_quotamb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
