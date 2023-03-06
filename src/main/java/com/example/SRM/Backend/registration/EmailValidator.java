package com.example.SRM.Backend.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String>
{
    @Override
    public boolean test(String test)
    {
//        To Do:Validate Regex
        return true;
    }
}
