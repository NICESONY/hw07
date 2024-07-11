package com.example.hw07.leenakyeong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/notice1")
@Controller("leenakeyongNoticeController1")
public class NoticeController1 {

	@Autowired
	private NoticeService1 noticeService;
	
	@GetMapping("/nareadlist")
	public String nareadlist(Model model) {
		model.addAttribute("notices", noticeService.readlist1());
		return "nareadlist";
	}
	
	@GetMapping("/create1")
	public String create1() {
		return "create1";
	}
	
	@PostMapping("/create1")
	public String create1(@ModelAttribute Notice1 notice) {
		noticeService.creat(notice);
		return "redirect:/notice/nareadlist";
	}
	
	@GetMapping("/readdetail1/{id}")
	public String readdetail1(Model model, @PathVariable ("id") Integer id) {
		model.addAttribute("notice", noticeService.readdetail1(id));
		return "readdetail";
	}
	
	@GetMapping("/delete1/{id}")
	public String delete(@PathVariable ("id") Integer id) {
		noticeService.delete(id);
		return "redirect:/notice/readlist1";
	}
	
	@GetMapping("/update1")
	public String update1(Model model, @PathVariable ("id") Integer id) {
		model.addAttribute("notice", noticeService.readdetail1(id));
		return "update1";
	}
	
	@PostMapping("/update1")
	public String update1(@ModelAttribute Notice1 notice) {
		noticeService.update(notice);
		return "redirect:/notice/readlist1";
	}
}
