package com.example.SRM.Backend.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
public class RegistrationController
{
    private RegistrationService registrationService;

    @PostMapping(path = "/signup")
    public String signUp(@RequestBody RegistrationRequest request)
    {
        return registrationService.register(request);
    }

    @GetMapping(path = "/confirm")
    public String confirm(@RequestParam("token") String token)
    {
        return registrationService.confirmToken(token);
    }
}
