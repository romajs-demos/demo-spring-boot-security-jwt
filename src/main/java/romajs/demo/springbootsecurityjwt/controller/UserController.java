package romajs.demo.springbootsecurityjwt.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/details", method = RequestMethod.GET)
    @ResponseBody
    public String details(Authentication authentication) {
        String userDetails = (String) authentication.getPrincipal();
        return userDetails;
    }
}
