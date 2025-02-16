package com.np.products.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "Products")
@Table(name = "Products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long productId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE", nullable = false)
    private double price;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "STOCK_QUANTITY", nullable = false)
    private int stockQuantity;

    @Column(name = "RATINGS", nullable = false)
    private float ratings;

    @Column(name = "IMAGE_URL", nullable = false)
    private String[] imageUrls;

    @Column(name = "CATEGORY", nullable = false)
    private String category;

    @Column(name = "REVIEWS", nullable = false)
    private List<Review> reviews;

    @CreationTimestamp
    private LocalDateTime creationTime;

    @UpdateTimestamp
    private LocalDateTime updateTime;
}
