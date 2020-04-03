package com.example.customerslist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class CustomerslistController {

    private CustomerslistRepository customerslistRepository;

    @Autowired
    public CustomerslistController(CustomerslistRepository customerslistRepository) {
        this.customerslistRepository = customerslistRepository;
    }

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public ModelAndView index(Model model){
        List<Customer> customerList = customerslistRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("customerlist");
        modelAndView.addObject("customers",customerList);
        return modelAndView;
    }


    @GetMapping("/add-customer")
    public ModelAndView addCustomer(){
        return new ModelAndView("add");
    }

    @PostMapping("/add-customer")
    public ModelAndView addCustomerPost(Customer customer){
        customerslistRepository.save(customer);
        return new ModelAndView("redirect:/");
    }
//    @RequestMapping(value="/{customer}", method = RequestMethod.GET)
//    public String readersBooks(@PathVariable("customer") String customer, Model model){
//        List<Customer> readingList = customerslistRepository.findAll();
//        if(readingList != null){
//            model.addAttribute("books", readingList);
//        }
//        return "customerlist";
//    }
//
//    @RequestMapping(value = "/{customer}", method = RequestMethod.POST)
//    public String addToReadingList(@PathVariable String customer, Book book){
//        book.setReader(reader);
//        readingListRepository.save(book);
//        return "redirect:/{reader}";
//    }
}
