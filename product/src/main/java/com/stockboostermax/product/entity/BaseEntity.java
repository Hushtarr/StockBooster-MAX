package com.stockboostermax.product.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @CreatedDate
    @Column(name = "created_at",updatable = false)
    private LocalDateTime createdAt;

    @CreatedBy
    @Column(name = "created_by", nullable = false, updatable = false)
    private String createdBy;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @LastModifiedBy
    @Column(name = "updated_by", nullable = false)
    private String updatedBy;

    @Column(name = "is_deleted")
    private Boolean isDeleted=false;

//    private String getLoginUser(){
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        return (authentication == null) ? "anonymousUser" : authentication.getName();
//    }


    @PrePersist
    protected void onPrePersist() {
//        LocalDateTime now = LocalDateTime.now();
//        this.createdAt = now;
//        this.updatedAt = now;

//        handle by  @EnableJpaAuditing with @
//        this.createdBy = getLoginUser();
//        this.updatedBy = getLoginUser();
    }

    @PreUpdate
    protected void onPreUpdate() {
//        this.updatedAt = LocalDateTime.now();
//        this.updatedBy = getLoginUser();
    }
}
