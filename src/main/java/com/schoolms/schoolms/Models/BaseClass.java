package com.schoolms.schoolms.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseClass {

    @CreatedBy
    @Column(updatable = false)
    private String created_by;

    @Column(updatable = false)
    @CreatedDate
    private LocalDate created_at;

    @Column(insertable = false)
    @LastModifiedBy
    private String updated_by;

    @Column(insertable = false)
    @LastModifiedDate
    private LocalDate updated_at;
    private String status;

}