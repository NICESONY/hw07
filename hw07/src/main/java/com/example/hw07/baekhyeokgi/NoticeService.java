package com.example.hw07.baekhyeokgi;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NoticeService {

	
	@Autowired
	private NoticeRepository noticeRepository;   //리포지토리에 서비스 연결
		public void create(Notice notice) {
		
		notice.setDate(LocalDateTime.now());
		noticeRepository.save(notice);
	}
	
	public List <Notice> readlist()   {
		return noticeRepository.findAll();
	
	}
	
	public Notice readdetail(Integer id) {
		Optional<Notice> o = noticeRepository.findById(id);
		return o.get();
	}
	
	public void delete(Integer id) {
		noticeRepository.deleteById(id);
		
	}
	
	public void update(Notice notice) {
		noticeRepository.save(notice);
		
	}

}
