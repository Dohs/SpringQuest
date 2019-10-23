package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<ul>" +
                "<li>" +
                "<a href='/doctor/1'>" + williamHartnell() + "</a>" +
                "</li>" +
                "<li>" +
                "<a href='/doctor/10'>" + davidTennan() + "</a>" +
                "</li>" +
                "<li>" +
                "<a href='/doctor/14'>" + jodieWhittaker() + "</a>" +
                "</li>" +
                "<li>" +
                "<a href='/doctor/28'>" + mattSmith() + "</a>" +
                "</li>"+
				"</ul>";
    }

    @RequestMapping("/doctor/1")
    @ResponseBody
    public String williamHartnell() {
        return "William Hartnell";
    }

    @RequestMapping("/doctor/10")
    @ResponseBody
    public String davidTennan() {
        return "David Tennan";
    }

    @RequestMapping("/doctor/14")
    @ResponseBody
    public String jodieWhittaker() {
        return "Jodie Whittaker";
    }

    @RequestMapping("/doctor/28")
    @ResponseBody
    public String mattSmith() {
        return "Matt Smith";
    }

}