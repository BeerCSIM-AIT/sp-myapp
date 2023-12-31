package nvc.bcit.phakpoom.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class ProductController {
   // /product
  @GetMapping("")
  @ResponseBody
  public String product(){
    return "Product";
  }

  //product/{id}
  @GetMapping("/{id}")
  @ResponseBody
  public String product(@PathVariable int id){
    return "Product: " + id;
  }
}
