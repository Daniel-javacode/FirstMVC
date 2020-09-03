package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.model.Autoservice;

@Controller
public class CarsController {

    @RequestMapping("/cars")
    public String viewCars(Model model, @RequestParam(value = "locale", required = false) String locale) {
        model.addAttribute("cars", new Autoservice().getCars());
        if ("ru".equals(locale)) {
            model.addAttribute("title", "МАШИНЫ");
        } else {
            model.addAttribute("title", "CARS");
        }
        return "/cars";
    }
}
