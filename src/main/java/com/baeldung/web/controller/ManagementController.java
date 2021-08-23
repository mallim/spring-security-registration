package com.baeldung.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class ManagementController {

    @GetMapping("/management")
    public String getLoggedUsers(final Locale locale, final Model model) {
        return "management";
    }
}
