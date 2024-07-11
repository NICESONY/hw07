package com.example.hw07.baekhyeokgi;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Reply {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rid;
	
	@Column(columnDefinition = "TEXT")
	private String rcontent;
		
	@ManyToOne
	private Notice rnotice; 
	
	private LocalDateTime rdate;
}