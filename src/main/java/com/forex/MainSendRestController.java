package com.forex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MainSendRestController {

    private SendMailComponent sendMailComponent;

    @Autowired
    public MainSendRestController(SendMailComponent sendMailComponent) {
        this.sendMailComponent = sendMailComponent;
    }

    @PostMapping()
    public HttpStatus send(@RequestBody PostForm postForm) {
        if (sendMailComponent.sendMail(postForm.getUserSubject(), "tormexalliance@gmail.com", "\r" +
                postForm.getUserMessage() + "\r Author: " + postForm.getUserName() + "\r Email: " +
                postForm.getUserEmail()) && postForm.getUserMessage() != null) {
            return HttpStatus.OK;
        }
        throw new NullPointerException();
    }

}
