package kr.co.bblackhun.dockerbootmysql.Test.repository;

import kr.co.bblackhun.dockerbootmysql.Test.dto.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Content, Long> {
}
