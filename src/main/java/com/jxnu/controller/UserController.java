package com.jxnu.controller;

import com.jxnu.pojo.Users;
import com.jxnu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class UserController {
    @Autowired
    @Qualifier("UserServiceImp")
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(HttpSession session, String username, String password) {
        Boolean b = userService.userLogin(username, password);
        System.out.println(b);
        if (b == true) {
            session.setAttribute("userid", username);
            return "forward:main";
        } else {
            return "redirect:index.jsp";
        }
    }

    @RequestMapping("/toAdduser")
    public String toAddPaper() {
        return "adduser";

    }

    @RequestMapping("/adduser")
    public String addPaper(Users user) {
        System.out.println(user);
        userService.adduser(user);
        return "redirect:index.jsp";

    }

    @RequestMapping("/alluser")
    public String list(HttpSession session,String username) {
        List<Users> list = userService.queryAllUser(username);
        session.setAttribute("list", list);
        System.out.println(list);
        return "alluser";
    }
    @RequestMapping("/toUpdateuser")
    public String toUpdateBook(Model model, int id) {
        Users user=userService.
        System.out.println(user);
        model.addAttribute("book",books );
        return "updateuser";
    }

    @RequestMapping("/updateuser")
    public String updateBook(Model model, Users user) {
        System.out.println(book);
        bookService.updateBook(book);
        Books books = bookService.queryBookById(book.getBookID());
        model.addAttribute("books", books);
        return "redirect:/book/allBook";

}
