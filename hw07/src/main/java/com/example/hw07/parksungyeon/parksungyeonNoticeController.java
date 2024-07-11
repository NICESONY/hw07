package com.example.hw07.parksungyeon;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller("parksungyeonNoticeController")
public class parksungyeonNoticeController {
	@Autowired
	parksungyeonNoticeService noticeService;
	
	@Value("${cloud.aws.s3.endpoint}")
	private String downpath;
	

		
	@GetMapping("/parksungyeonindex")
	public String parksungyeonindex() {
		return "parksungyeonindex";
		
		}
	
	@GetMapping("/parksungyeoncreate")
	public String parksungyeoncreate() {
		return "parksungyeoncreate";
		
		}
	
	
	@PostMapping("/parksungyeoncreate")
	public String parksungyeoncreate(@ModelAttribute parksungyeonNotice notice,
						 @RequestParam("file") MultipartFile file
			) throws IOException {
		
		noticeService.create(notice, file);
		return "redirect:/parksungyeonindex";
		
		}
	
	
	@GetMapping("/readlist")
	public String readlist(Model model) {
		model.addAttribute("notices", noticeService.readlist());
		model.addAttribute("downpath", "https://" + downpath);
		return "readlist";
		
	}
	
	
	}