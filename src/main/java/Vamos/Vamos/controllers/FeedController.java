package Vamos.Vamos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"feed"})
public class FeedController {
    public FeedController() {
    }

    @RequestMapping({""})
    public String feed(Model model) {

        model.addAttribute("title", "Feed");

        return "history";
    }
}
