package com.example.customerslist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class CustomerslistController {

    private CustomerslistRepository customerslistRepository;

    @Autowired
    public CustomerslistController(CustomerslistRepository customerslistRepository) {
        this.customerslistRepository = customerslistRepository;
    }

    @RequestMapping(value = "/")
    public String index(Model model){
        List<Customer> customerList = customerslistRepository.findAll();
        model.addAttribute(customerList);
        return "customerlist";
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

    @RequestMapping(value = "/add-customer", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute Customer customer){
        customerslistRepository.save(customer);
        System.out.println(customer.getFirstName());
        return "redirect:/";
    }
}
