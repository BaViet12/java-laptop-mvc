package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.hoidanit.laptopshop.service.UseService;

@Controller
public class UserController {

    private UseService useService;

    public UserController(UseService useService) {
        this.useService = useService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = this.useService.handleHello();
        model.addAttribute("viet", test);
        model.addAttribute("hoidanit", "from controller with model");
        return "hello";
    }
}

// @RestController
// public class UserController { 

//     private UseService useService;
    
//     public UserController(UseService useService) {
//         this.useService = useService;
//     }

//     @GetMapping("/")
//     public String getHomePage() {
//         return this.useService.handleHello();
//     }
// }