package org.springboot.api.controller;

import lombok.RequiredArgsConstructor;
import org.springboot.api.service.impl.AccountServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/view")
@RequiredArgsConstructor
public class MVCController {
    private final AccountServiceImpl accountServiceImpl;

    @GetMapping("/accounts")
    public String listAccounts(Model model) {
        model.addAttribute("accounts", accountServiceImpl.getAllAccounts());
        return "accounts";
    }
}