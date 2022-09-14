package guru.springframework.jokesapp.controllers;

import guru.springframework.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Class JokeController Created on 14/09/2022
 *
 * @Author Iván Camilo Rincon Saavedra
 */
@Controller
@RequestMapping(value = "/")
public class JokeController {

    private final JokeService service;


    public JokeController(@Autowired JokeService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showJoke(Model model) {
        model.addAttribute("joke", service.getJoke());

        return "index";
    }

}
