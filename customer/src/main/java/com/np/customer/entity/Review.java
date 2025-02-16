package com.np.customer.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity(name = "Reviews")
@Table(name = "Reviews")
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long reviewId;

    @Column(name = "NAME", nullable = false)
    private String customerName;

    @Column(name = "RATINGS", nullable = false)
    private float ratings;

    @Column(name = "COMMENT")
    private String comment;

    @CreationTimestamp
    private LocalDateTime reviewedDate;
}