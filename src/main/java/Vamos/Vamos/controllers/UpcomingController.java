package Vamos.Vamos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"upcoming"})
public class UpcomingController {
    public UpcomingController() {
    }

    @RequestMapping({""})
    public String upcoming(Model model) {

        model.addAttribute("title", "Upcoming/Wishlist");

        return "history";
    }
}
