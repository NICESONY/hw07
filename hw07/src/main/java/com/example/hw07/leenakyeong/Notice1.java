package com.example.hw07.leenakyeong;

import java.time.LocalDateTime;
import java.util.List;

import com.example.hw07.leenakyeong.Reply;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Notice1 {
	
	@Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY) // 자동 증가 
	   private Integer id;
	   
	   
	   private String title;
	   
	   @Column(columnDefinition="TEXT")
	   private String content;
	   
	   
	   private LocalDateTime date;
	   
	   @OneToMany(mappedBy="board", cascade=CascadeType.REMOVE)
	   private List<Reply> replyList;
	

}
