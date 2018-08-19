package Vamos.Vamos.controllers;

import Vamos.Vamos.models.data.LocationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({""})
public class DetailsController {

    @Autowired
    private LocationDao locationDao;

    @RequestMapping({"search"})
    public String index(Model model) {
            model.addAttribute("locations", locationDao.findAll());
            model.addAttribute("title", "Search");

            return "search";
        }
}
