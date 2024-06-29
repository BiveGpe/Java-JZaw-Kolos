package com.example.jaz_s27275_nbp.models;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "nbp_data")
public class NbpData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "start_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private String startDate;

    @Column(name = "end_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private String endDate;

    @Column(name = "code", nullable = false, length = 4)
    private String code;

    @Column(name = "created_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "avg_rate", nullable = false)
    private Double avgRate;

    public NbpData(String startDate, String endDate, String code, Double avgRate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.code = code;
        this.avgRate = avgRate;
        this.createdAt = new Date();
    }

    public NbpData() {
    }
}
