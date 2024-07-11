package com.example.hw07.SON;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public void create(Member member) {
		
		member.setEnabled(true);
		// 일반 유저를 나타낸다.
		member.setRole("ROLE_USER"); //ROLE_ADMIN, ROLE_MANAGER, ROLE_PAID...
		member.setMdate(LocalDateTime.now());
		
		// 암호화 하는 것을 강제하는 것이다. 그래서 복호화 불가능하다.
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		member.setPassword(passwordEncoder.encode(member.getPassword()));
		// 이후 DB에 넣는다.
		memberRepository.save(member);
	}
}