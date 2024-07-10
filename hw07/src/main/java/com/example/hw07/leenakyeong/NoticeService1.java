package com.example.hw07.leenakyeong;

<<<<<<< HEAD
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class NoticeService1 {

	@Autowired
	private NoticeRepository1 noticeRepository;
	
	public void creat(Notice1 notice) {
		notice.setDate(LocalDateTime.now());
		noticeRepository.save(notice);
	}
	
	public List<Notice1> readlist(){
		return noticeRepository.findAll();
	}
	
	public Notice1 readdetail(Integer id) {
		
		Optional <Notice1> o = noticeRepository.findById(id);
		return o.get();
	}
	
	public void delete(Integer id) {
		noticeRepository.deleteById(id);
	}
	
	public void update(Notice1 notice) {
		noticeRepository.save(notice);
	
	}
=======
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeService1 extends JpaRepository<Notice1, Integer> {

>>>>>>> 5b3c8f69d5c9c97960b640522ea56cb340344b81
}
