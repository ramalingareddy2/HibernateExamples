package com.ramu.hibernate.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@Entity
@Table(name = "category")
public class Category implements Serializable {
    @Id
    @Column(name = "category_id")
    protected int categoryId;
    @Column(name = "category_nm")
    protected String categoryName;
    protected String description;

}
