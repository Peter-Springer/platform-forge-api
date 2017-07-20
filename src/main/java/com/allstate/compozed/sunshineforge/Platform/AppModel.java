package com.allstate.compozed.sunshineforge.Platform;

import javax.persistence.*;

@Entity
@Table(name = "app")
final class AppModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int disk_allocationmb;
    private int memory_allocationmb;
    private String name;
    @ManyToOne
    @JoinColumn(name = "space_id")
    private int space_id;

}
