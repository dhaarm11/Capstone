package Vamos.Vamos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({""})
public class DetailsController {
    public DetailsController() {
    }

    @RequestMapping({"search"})
    public String index(Model model) {



        return "search";
    }
}
