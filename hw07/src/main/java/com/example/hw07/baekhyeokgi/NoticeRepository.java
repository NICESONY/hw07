package com.example.hw07.baekhyeokgi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("baekhyeokgiNoticeRepository")
public interface NoticeRepository extends JpaRepository<Notice, Integer> {

}
