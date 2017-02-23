package com.borloz.multipart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

    @GetMapping("/")
    public String display() {

        return "form";
    }

    @PostMapping("/upload")
    public String process(final MultipartFile file, final Model model) {

        model.addAttribute("fileName", file.getOriginalFilename());

        return "form";
    }

}
