package com.example.hw07.baekhyeokgi;

import java.util.List;

public interface NoticeService {void create(Notice notice);
	
	List<Notice> readlist();
	
	Notice readdetail (Integer nid);
	
	void update(Notice notice);
	
	void delete(Integer nid);
}
