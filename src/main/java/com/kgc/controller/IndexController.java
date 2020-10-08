package com.kgc.controller;

import com.kgc.pojo.Bills;
import com.kgc.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author shkstart
 */
@Controller
public class IndexController {
    @Resource
    IndexService indexService;

    @RequestMapping("/")
    public String index(HttpServletRequest request, Model model) {
        /*Integer typeid = Integer.parseInt(request.getParameter("typeid"));
        if (typeid == 0) {*/
        List<Bills> selall = indexService.selall();
        model.addAttribute("list", selall);
        /*} else {
            List<Bills> bills = indexService.selBy(typeid);
            model.addAttribute("list", bills);
        }*/
        return "index";
    }

    @RequestMapping("/add")
    public String add(Bills bills) {
        bills.setId(null);
        indexService.add(bills);
        return "redirect:/";
    }
}
