package br.com.wfaria.apiversioning;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = "application/vnd.user.api.v1+json")
    public @ResponseBody User getItem(@PathVariable("id") String id) {
        return new User(id, "Steve V1");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = "application/vnd.user.api.v2+json")
    public @ResponseBody User getItemSecondAPIVersion(@PathVariable("id") String id) {
        return new User(id, "Steve V2 ");
    }

}
