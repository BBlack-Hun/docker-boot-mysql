package kr.co.bblackhun.dockerbootmysql.Test.controller;

import kr.co.bblackhun.dockerbootmysql.Test.dto.Content;
import kr.co.bblackhun.dockerbootmysql.Test.repository.TestRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    @GetMapping("/")
    public String home() {
        return "form";
    }

    @PostMapping("/")
    public String form(@ModelAttribute Content content) {
        testRepository.save(new Content(content.getContent()));
        return "redirect:/";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Content> contents = new ArrayList<>();
        Iterable<Content> contentsIterable = testRepository.findAll();
        contentsIterable.forEach(contents::add);

        return "list";
    }

}
