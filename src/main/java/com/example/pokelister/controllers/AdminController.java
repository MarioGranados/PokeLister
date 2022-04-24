package com.example.pokelister.controllers;

import com.example.pokelister.models.Product;
import com.example.pokelister.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    private ProductRepository productDao;
    public AdminController(ProductRepository productDao) {
        this.productDao = productDao;
    }

    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin";
    }

/*    @GetMapping("/admin/create")
    public String showCreateProduct(){
        return "admin";
    }*/

    @PostMapping("/admin/create")
    public String createProduct(@RequestParam(name = "title") String title,
                                @RequestParam (name = "description") String desc,
                                @RequestParam(name = "price") long price,
                                @RequestParam(name = "quantity") long quantity,
                                @RequestParam(name = "image") String image,
                                Model model) {

        model.addAttribute(title);
        model.addAttribute(desc);
        model.addAttribute(price);
        model.addAttribute(quantity);
        model.addAttribute(image);

        productDao.save(new Product(title, desc, price, quantity, image));
        return "admin";
    }
    @PostMapping("/admin/delete")
    public String deleteProduct(@RequestParam long id ,Model model) {
        productDao.deleteById(id);
        return "admin";
    }

/*    @PostMapping("admin/pricing")
    public String editPricing() {
        return "admin";
    }*/
/*    @PostMapping("/admin/quantity")
    public String editQuantity() {
        return "admin";
    }*/

    @PostMapping("admin/create/admin")
    public String postAdmin() {
        return "admin";
    }
}
