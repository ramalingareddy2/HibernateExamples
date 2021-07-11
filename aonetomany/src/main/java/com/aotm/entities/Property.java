package com.aotm.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "property")
public class Property implements Serializable{
	@Id
	@Column(name = "property_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int propertyNo;
	protected String title;
	protected String description;
	@Column(name="property_type")
	protected String propertyType;
	protected double amount;
	@OneToMany(mappedBy = "property")
	//@JoinColumn(name = "property_no",nullable = false)//This association is readonly , 
	protected Set<Enquiry> enquiries;
	
	@Override
	public String toString() {
		return "Property [propertyNo=" + propertyNo + ", title=" + title + ", description=" + description
				+ ", propertyType=" + propertyType + ", amount=" + amount + "]";
	}
	
	

}
