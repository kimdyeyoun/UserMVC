package com.kedu.user;

import com.kedu.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/join")
    public void join(){};

    @PostMapping("/join")
    public String joinUser(UserEntity entity, RedirectAttributes reAttr){
        int result = service.joinUser(entity);
        if (result == 0){
            reAttr.addFlashAttribute("msg", "회원가입 실패");
            return "redirect:/user/join";
        }
        return "redirect:/board/list";
    }

    @GetMapping("/login")
    public void login(){};

    @PostMapping("/login")
    public String loginUser(UserEntity entity, RedirectAttributes reAttr){
        int result = service.loginUser(entity);
        switch (result){
            case 0:
                reAttr.addFlashAttribute("msg", "로그인 실패");
                return "redirect:/user/login";
        }
        return "redirect:/board/list";
    };
}
