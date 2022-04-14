package kr.co.bblackhun.dockerbootmysql.Test.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Content {

    @Id
    @GeneratedValue
    private Long Id;

    private String content;

    public Content(String content) {
        this.content = content;
    }

}
