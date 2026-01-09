package com.mansi.spring_boot_demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "<center><h1>Hello Developer...</h1></center>";
    }

    @GetMapping("/about")
    public String about(){
        return "<center><br><h2>Mansi Padia</h2>" +
                "<br>I am a passionate and detail-oriented Java Developer with a strong foundation in core Java, object-oriented programming, and backend development. I have hands-on experience building reliable applications using Java, Spring Boot, RESTful APIs, and SQL, with a focus on clean code, performance, and maintainability.\n" +
                "<br><br><br>" +
                "I enjoy solving problems, writing efficient code, and working on scalable systems. I value continuous learning, collaboration, and clear communication, and I adapt quickly to new technologies and project requirements. I am eager to grow as a developer and contribute meaningfully to impactful software solutions.</center>";
    }

}
