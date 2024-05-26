package com.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRespository itemRespository;

    @GetMapping("/list")
    String list(Model model) {
        List<Item> result = itemRespository.findAll();

        model.addAttribute("items", result);

        Item a = new Item();
        System.out.println(a.toString());
        return "list.html";
    }
}
