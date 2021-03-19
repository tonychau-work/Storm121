package com.job.storm121.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "VIDEO")
public class Video {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "URL")
    private String url;

    @OneToOne(mappedBy = "video", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private VideoMeta videoMeta;

    @ManyToMany(mappedBy = "videos")
    @JsonBackReference
    List<LandingPage> landingPages;
}
