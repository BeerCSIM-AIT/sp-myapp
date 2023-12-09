package nvc.bcit.phakpoom.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
  private String path = "pages/";

  @GetMapping("/")
  public String index(ModelMap model){
    String name = "Phakpoom";
    model.addAttribute("loginName", name);
    model.addAttribute("age", 18);
    return path + "/index";
  }

  @GetMapping("/about")
  public String about(){
    
    return path + "/about";
  }

  @GetMapping("/contact")
  public String contact(ModelMap model){
    // tel, e-mail, address
    model.addAttribute("tel", "0809999999");
    model.addAttribute("email", "beerbc16@gmail.com");
    model.addAttribute("address", "Thailand");
    return path + "contact";
  }

 
}
