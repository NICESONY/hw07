package com.example.hw07.leenakyeong;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("leenakyeongNoticeRepository1")
public interface NoticeRepository1 extends JpaRepository<Notice1, Integer> {

}
