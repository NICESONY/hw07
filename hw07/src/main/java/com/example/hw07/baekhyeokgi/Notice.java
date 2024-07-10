package com.example.hw07.baekhyeokgi;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="baekhyeokgiNotice")
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;           //게시물 번호

	private String title;         //게시물 제목
	
	private String content;       //게시물 내용
	
	private LocalDateTime date;   //게시물 작성일
	
}