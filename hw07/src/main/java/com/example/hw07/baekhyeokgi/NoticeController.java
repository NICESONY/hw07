package com.example.hw07.baekhyeokgi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/notice")
@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/create")
	public String create() {
		return "notice/create";
	}
	
	@PostMapping("/create")
	public String create(Notice notice) {
		noticeService.create(notice);
		return "redirect:/notice/readlist";
	}
	
	@GetMapping("/readlist")
	public String readlist(Model model) {
		model.addAttribute("notices", noticeService.readlist());
		return "notice/readlist";
	}
	
	@GetMapping("/readdetail/{bid}")
	public String readdetail(@PathVariable("nid") Integer nid,
							Model model) {
		model.addAttribute("notice", noticeService.readdetail(nid));
		return "notice/readdetail";
	}
	
	@GetMapping("/update/{nid}")
	public String update(@PathVariable("nid") Integer nid, Model model) {
			model.addAttribute("notice", noticeService.readdetail(nid));
		return "notice/update";
	}
	
	@PostMapping("/update")
	public String update(Notice notice) {
		noticeService.update(notice);
		return "redirect:/notice/readlist";
	}
}