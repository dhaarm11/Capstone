<<<<<<< HEAD
package Vamos.Vamos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({""})
public class HomeController {
    public HomeController() {
    }

    @RequestMapping({""})
    public String index(Model model) {
        return "home";
    }
}
=======
package Vamos.Vamos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({""})
public class HomeController {
    public HomeController() {
    }

    @RequestMapping({""})
    public String index(Model model) {
        return "home";
    }
}
>>>>>>> 13c6c43dcb55c5de08e683019dcf66c921966fe6
