package com.hackeru.demo.controller;

import com.hackeru.demo.bean.User;
import com.hackeru.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Copyright: Copyright (c) 2021 Asiainfo
 *
 * @className: com.hackeru.demo.controller.UserController
 * @description:
 * @version: v1.0.0
 * @author: liangyl
 * @date: 2021/11/24
 * <p>
 * Modification History:
 * Date         Author         Version          Description
 * -----------------------------------------------------------------------*
 * 2021/11/24		liangyl        v1.0.0		    创建
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public String getUserInfo(Model model, @PathVariable("id") Long userId) {
        Optional<User> optional = userRepository.findById(userId);
        User user = optional.orElseGet(User::new);
        model.addAttribute(user);
        return "user";
    }

    @PostMapping
    @ResponseBody
    public User saveUserInfo(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping
    @ResponseBody
    public void updateUserInfo(@RequestBody User user) {
        Long userId = user.getId();
        Optional<User> optional = userRepository.findById(userId);
        if (optional.isPresent()){
            userRepository.save(user);
        }
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteUserInfo(@PathVariable("id") Long userId) {
        userRepository.deleteById(userId);
    }

}
