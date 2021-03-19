package com.job.storm121.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "LANDING_PAGE_META")
public class LandingPageMeta {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "HIT_COUNT")
    private Long hitCount;

    @OneToOne
    @JoinColumn(name = "LANDING_PAGE_ID")
    @JsonBackReference
    private LandingPage landingPage;
}
