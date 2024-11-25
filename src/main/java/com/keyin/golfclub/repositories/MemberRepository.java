package com.keyin.golfclub.repositories;

import com.keyin.golfclub.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
