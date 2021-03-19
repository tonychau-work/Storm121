package com.job.storm121.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "VIDEO_META")
public class VideoMeta {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "VIEW_COUNT")
    private Long viewCount;

    @OneToOne
    @JoinColumn(name = "VIDEO_ID")
    @JsonBackReference
    private Video video;
}
