package controller;

import model.dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    dictionary dic = new dictionary() ;
@GetMapping("/translate")
public String dictionary() {
    return "translate";
}
@GetMapping("/a")
    public String translate(@RequestParam String search, Model model){

    String result = dic.findById(search);
    model.addAttribute("result",result);
    return "translate";
}
}
