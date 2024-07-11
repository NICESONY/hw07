package com.example.hw07.baekhyeokgi;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService {
	@Autowired
	private ReplyRepository replyRepository;
	
	@Autowired
	private NoticeRepository noticeRepository;
	
	@Override
	public void create(String rcontent, Integer nid) {
		Reply reply = new Reply();
		
		reply.setRcontent(rcontent);
		
		reply.setRdate(LocalDateTime.now());
		
		Optional<Notice> tr = noticeRepository.findById(nid);
		reply.setRnotice(tr.get());
				
		replyRepository.save(reply);
	}
}
