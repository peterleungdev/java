package com.peter.quickstart;

import com.peter.quickstart.model.HelloToday;
import com.peter.quickstart.model.MyUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private final MyUser myUser;
    private HelloToday helloToday;

    public HelloWorldController (MyUser myUser, HelloToday helloToday) {

        this.myUser = myUser;
        this.helloToday = helloToday;
    }


    @GetMapping(path = "/hello")
    public String helloWorld() {
        return String.format(
                "Hello %s\n%s\n",
                this.myUser.getUserInfo(),
                helloToday.sayTodayDate());
    }
}
