package com.example.demo.controller;

import com.example.demo.entity.Orders;
import com.example.demo.service.OrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * controller
 *
 * @author Steve on 2019/3/11
 */
@Controller
public class OrdersController {
  // 注入service接口
  @Resource private OrdersService ordersService;

  @GetMapping(value = "/findAll")
  public ModelAndView findAll() {
    ModelAndView modelAndView = new ModelAndView();
    List<Orders> list = ordersService.findAll();
    modelAndView.addObject("ord", list);
    modelAndView.setViewName("list");
    return modelAndView;
  }

  @PostMapping(value = "/add")
  public String add(@ModelAttribute Orders orders) {
    ordersService.add(orders);
    return "redirect:/findAll";
  }
}
