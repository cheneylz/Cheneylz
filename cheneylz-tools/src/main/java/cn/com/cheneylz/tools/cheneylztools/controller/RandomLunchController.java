package cn.com.cheneylz.tools.cheneylztools.controller;

import cn.com.cheneylz.tools.cheneylztools.entity.Lunch;
import cn.com.cheneylz.tools.cheneylztools.service.LunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RandomLunchController {

    @Autowired
    LunchService lunchService;

    @GetMapping("/getRandomLunch")
    public String getRandomLunch(Model model){
        Lunch randomLunch = lunchService.getRandomLunch();
        model.addAttribute("randomLunch",randomLunch);

        return  "randomLunch";
    }

    @PostMapping("/addLunchInfo")
    public String saveLunchInfo(@RequestParam(name = "lunchName") String lunchName){
        Lunch lunch = new Lunch();
        lunch.setName(lunchName);
       lunchService.saveLunch(lunch);
        return "redirect:/getRandomLunch";
    }

    @DeleteMapping("/delLunchInfo/{LunchId}")
    public  String deleteLunchInfo(@PathVariable(name="LunchId")String id){
            lunchService.deleteLunch(id);
        return "redirect:/getRandomLunch";
    }

}
