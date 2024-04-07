package co.simplon.davelooper.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.davelooper.dtos.AccountCreate;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/accounts")
class AccountController {

    @PostMapping
    void create(@RequestBody @Valid AccountCreate inputs) {
	System.out.println(inputs);
    }
}
