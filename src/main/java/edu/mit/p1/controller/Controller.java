package edu.mit.p1.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/test1")
    public void test1() {

    }

    @PostMapping("/test2")
    public void test2(int num1, int num2, Model model) {
        int num3 = 0;
        for (int i = num1; i <= num2; ++i) {
            num3 += i;
        }
        model.addAttribute("num3",num3);
    }
}
