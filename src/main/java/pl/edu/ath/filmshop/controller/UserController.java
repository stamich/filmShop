package pl.edu.ath.filmshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.edu.ath.filmshop.model.User;
import pl.edu.ath.filmshop.serrvice.UserService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html; charset=utf-8")
    public String mainView(){
        return "index.html";
    }

    // READ

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "text/html; charset = utf-8")
    public String getAll(ModelMap modelMap){
        List<User> users = service.findAll();
        modelMap.addAttribute("users", users);
        return "allUsers.html";
    }

    // CREATE

    @RequestMapping(value = "/new", method = RequestMethod.GET, produces = "text/html; charset = utf-8")
    public String newUser(ModelMap modelMap){
        User user = new User();
        modelMap.addAttribute("newUser", user);
        modelMap.addAttribute("edit", false);
        return "createForm.html";
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST, produces = "text/html; charset = utf-8")
    public String saveNewUser(@Valid User user, BindingResult result, ModelMap modelMap){

        if(result.hasErrors()){
            return "createForm.html";
        }

        service.save(user);
        modelMap.addAttribute("success", "User: " + user.getFirstName() + " " + user.getLastName() + " " + "saved successfully!");
        return "createSuccess.html";
    }

    // UPDATE

    @RequestMapping(value = "/update{id}", method = RequestMethod.GET, produces = "text/html; charset = utf-8")
    public String editUser(@PathVariable String id, ModelMap modelMap){
        User user = service.findOneById(id);
        modelMap.addAttribute("user", user);
        modelMap.addAttribute("edit", true);
        return "updateForm.html";
    }

    @RequestMapping(value = "/update{id}", method = RequestMethod.POST, produces = "text/html; charset = utf-8")
    public String saveEditedUser(@Valid @ModelAttribute("user") User user, BindingResult result, @PathVariable String id, ModelMap modelMap){

        if (result.hasErrors()){
            return "updateForm.html";
        }

        service.update(user);
        //modelMap.addAttribute("user", user.getId());
        modelMap.addAttribute("success","User: " + user.getFirstName() + " " + user.getLastName() + " " + "saved successfully!");
        return "createSuccess.html";
    }

    // DELETE

    @RequestMapping(value = "/delete", method = RequestMethod.GET, produces = "text/html; charset = utf-8")
    public String deleteUser(User user){
        service.delete(user);
        return "redirect:/all";
    }
}
