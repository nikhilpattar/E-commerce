package com.np.seller.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity(name = "Seller")
@Table(name = "Sellers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long sellerId;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "USERNAME", nullable = false, unique = true)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @CreationTimestamp
    private LocalDateTime creationTime;

    @UpdateTimestamp
    private LocalDateTime updateTime;

    @Column(name = "ADDRESSES", nullable = true)
    private Address[] address;

    @Column(name = "ABOUT", nullable = true, unique = false)
    private String about;
}
