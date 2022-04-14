package kr.co.bblackhun.dockerbootmysql.Test.repository;

import kr.co.bblackhun.dockerbootmysql.Test.dto.Content;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<Content, Long> {
}
