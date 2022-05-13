package com.company.MonthAndMath.controller;

import com.company.MonthAndMath.model.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
public class MathController {

        @RequestMapping(value="/add", method= RequestMethod.POST)
        @ResponseStatus(value = HttpStatus.CREATED)
        public MathSolution createAddNumber(@RequestBody @Valid MathSolution mathSolution) {
            mathSolution.setOperation("add");
            Integer answer = mathSolution.getOperand1() + mathSolution.getOperand2();
            mathSolution.setAnswer(answer);
            if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Must be a number");
            } else {
                return mathSolution;
            }

        }//Props to adam and discord friends for helping on this!
        @RequestMapping(value="/subtract", method= RequestMethod.POST)
        @ResponseStatus(value = HttpStatus.CREATED)
        public MathSolution createSubtractNumber(@RequestBody @Valid MathSolution mathSolution) {
            mathSolution.setOperation("subtract");
            Integer answer = mathSolution.getOperand1() - mathSolution.getOperand2();
            mathSolution.setAnswer(answer);
            if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Must be a number");
            } else {
                return mathSolution;
            }
        }

        @RequestMapping(value="/multiply", method= RequestMethod.POST)
        @ResponseStatus(value = HttpStatus.CREATED)
        public MathSolution createMultiplyNumber(@RequestBody @Valid MathSolution mathSolution) {
            mathSolution.setOperation("multiply");
            Integer answer = mathSolution.getOperand1() * mathSolution.getOperand2();
            mathSolution.setAnswer(answer);
            if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Must be a number");
            } else {
                return mathSolution;
            }
        }

        @RequestMapping(value="/divide", method= RequestMethod.POST)
        @ResponseStatus(value = HttpStatus.CREATED)
        public MathSolution createDivideNumber(@RequestBody @Valid MathSolution mathSolution) {
            mathSolution.setOperation("divide");
            Integer answer = mathSolution.getOperand1() / mathSolution.getOperand2();
            mathSolution.setAnswer(answer);
            if (mathSolution.getOperand2() == 0) {
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Cannot divide by 0");
            } else if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Must be a number");
            } else {
                return mathSolution;
            }

    }
}
