package com.example.kafkaconsumerdatabase.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="element")
@Getter
@Setter
public class BabouData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20000)
    private String BabouEventData;
}
