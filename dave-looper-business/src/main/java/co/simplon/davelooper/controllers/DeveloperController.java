package co.simplon.davelooper.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.davelooper.dtos.DeveloperView;
import co.simplon.davelooper.services.DeveloperService;

@RestController
@RequestMapping("/developers")
class DeveloperController {

    private final DeveloperService service;

    public DeveloperController(DeveloperService service) {
	this.service = service;
    }

    @GetMapping("/{number}")
    DeveloperView getOne(@PathVariable("number") String number) {
	return service.getOne(number);
    }
//    @GetMapping("/{number}")
//    Developer oneByRegistrationNumber(@PathVariable("number") String number) {
//	Developer entity = service.oneByRegistrationNumber(number);
//	// System.out.println(entity);
//	return entity;
//    }

    @DeleteMapping("/{id}")
    void deleteOne(@PathVariable("id") Long id) {
	service.deleteOne(id);
    }
}
