package com.job.storm121.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PHONE")
public class Phone {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PHONE")
    private String phone;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
