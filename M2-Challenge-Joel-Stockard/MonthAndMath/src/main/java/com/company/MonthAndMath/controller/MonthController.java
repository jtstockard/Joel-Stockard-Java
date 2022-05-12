package com.company.MonthAndMath.controller;

import com.company.MonthAndMath.model.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MonthController {
    //   https://www.geeksforgeeks.org/arrays-aslist-method-in-java-with-examples/

    private static List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month(1, "January"),
            new Month(2, "February"),
            new Month(3, "March"),
            new Month(4, "April"),
            new Month(5, "May"),
            new Month(6, "June"),
            new Month(7, "July"),
            new Month(8, "August"),
            new Month(9, "September"),
            new Month(10, "October"),
            new Month(11, "November"),
            new Month(12, "December")
    ));

    @RequestMapping(value = "/month/{number}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonth(@PathVariable int number) {
        Month foundMonth = null;
        for (Month month : monthList) {
            if (month.getNumber() == number) {
                foundMonth = month;
                break;
            } else {
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Invalid Month Number Specified");
            }
        }return foundMonth;
    }

    @RequestMapping(value = "/randomMonth", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month getRandomMonth() {
        Random rand = new Random();
        int randomMonthNumber = rand.nextInt(12) + 1;
        Month randomMonth = null;

        for (Month month : monthList) {
            if (month.getNumber() == randomMonthNumber){
                randomMonth = month;
                break;
            }

        }
        return randomMonth;
    }
}