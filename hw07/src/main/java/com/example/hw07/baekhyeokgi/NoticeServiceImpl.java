package com.example.hw07.baekhyeokgi;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeRepository noticeRepository;
	
	@Override
	public void create(Notice notice) {
		notice.setNdate(LocalDateTime.now());
		noticeRepository.save(notice);
	}
	@Override
	public List<Notice> readlist() {
		return noticeRepository.findAll();
	}
	@Override
	public Notice readdetail(Integer nid) {
		Optional<Notice> tb = noticeRepository.findById(nid);
		return tb.get();
	}
	@Override
		public void update(Notice notice) {
		noticeRepository.save(notice);
	}
	@Override
	public void delete(Integer nid) {
		Optional<Notice> tb = noticeRepository.findById(nid);
		noticeRepository.delete(tb.get());
	}
}
