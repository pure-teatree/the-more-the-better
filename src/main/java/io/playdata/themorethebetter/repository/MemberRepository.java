package io.playdata.themorethebetter.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.playdata.themorethebetter.domain.Member;

// 회원 객체를 저장하는 저장소
public interface MemberRepository extends JpaRepository<Member, Long>
{	
	public Optional<Member> findByNo(Long mem_no); // 고유번호로 회원을 찾는 것
	
	public Optional<Member> findById(String mem_id); // 아이디로 회원으로 찾는 것
	
	public Optional<Member> findByName(String mem_name); // 이름으로 회원을 찾는 것
	
	public List<Member> findAll(); // 전체 회원을 다 찾아주는 것

	//public void clearStore(); // 테스트가 끝나고 repository를 지움
}