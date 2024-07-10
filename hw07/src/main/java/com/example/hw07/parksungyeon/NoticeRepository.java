package com.example.hw07.parksungyeon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("parksungyeonNoticeRepository")
public interface NoticeRepository extends JpaRepository<Notice, Integer>  {

}
