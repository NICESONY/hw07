package com.example.hw07.baekhyeokgi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/reply")
@Controller
public class ReplyController {
	@Autowired
	private ReplyService replyService;
	
	@PostMapping("/create")
	public String create(@RequestParam ("rcontent") String rcontent, 
						 @RequestParam ("nid") Integer nid) {
		
		replyService.create(rcontent, nid);
		
		return "redirect:/notice/readdetail/" + nid;
	}
}