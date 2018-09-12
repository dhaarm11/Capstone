package Vamos.Vamos.controllers;

import Vamos.Vamos.models.Location;
import Vamos.Vamos.models.data.LocationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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

    @RequestMapping(value = "search/{classification}", method = RequestMethod.GET)
    public String getLocationsByCategory(@PathVariable("classification") String classification, Model model) {
        List<Location> locations = locationDao.findAllByClassification(classification);
        model.addAttribute("locations", locations);
        model.addAttribute("title", "Search");
        return "search";
    }

    @RequestMapping(value = "search/{classification}/{subcategory}", method = RequestMethod.GET)
    public String getLocationsBySubcategory(@PathVariable("subcategory") String subcategory, Model model) {
        List<Location> locations = locationDao.findAllBySubcategory(subcategory);
        model.addAttribute("locations", locations);
        model.addAttribute("title", "Search");
        return "search";
    }

    @RequestMapping(value = "/detail/{city}", method = RequestMethod.GET)
    public String getLocationsByCity(@PathVariable("city") String city, Model model) {
        List<Location> locations = locationDao.findAllByCity(city);
        model.addAttribute("locations", locations);
        model.addAttribute("title", "Search");
        return "search";
    }

}
