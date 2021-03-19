package com.job.storm121.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "LANDING_PAGE")
public class LandingPage {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "URL")
    private String url;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToOne(mappedBy = "landingPage", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private LandingPageMeta landingPageMeta;

    @JsonManagedReference
    @ManyToMany
    @JoinTable(
            name = "LP_VIDEO_MAP",
            joinColumns = {@JoinColumn(name = "LANDING_PAGE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "VIDEO_ID")})
    private List<Video> videos;
}
