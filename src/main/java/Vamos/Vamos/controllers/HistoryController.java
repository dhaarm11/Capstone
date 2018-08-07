package Vamos.Vamos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"history"})
public class HistoryController {
    public HistoryController() {
    }

    @RequestMapping({""})
    public String history(Model model) {

        model.addAttribute("title", "Past Trips");

        return "history";
    }
}
