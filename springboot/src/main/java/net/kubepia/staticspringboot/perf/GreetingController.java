package net.kubepia.staticspringboot.perf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/")
    public String index(@RequestParam(required = false, defaultValue = "50") int num, Model model){
        model.addAttribute("title","Perf Application");
        model.addAttribute("count", num);
        return "index";
    }
}