package com.company.MonthAndMath.controller;

import com.company.MonthAndMath.model.MathSolution;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MathController.class)
public class MathControllerTest {

    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper = new ObjectMapper();



    @Test
    public void shouldReturnAddSolutionObject() throws Exception {
        MathSolution solution = new MathSolution(13,38,"add", 51);

        String inputJson = mapper.writeValueAsString(solution);
        String outputJson = mapper.writeValueAsString(solution);

        mockMvc.perform(
                        post("/add").content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print()).andExpect(status().isCreated()
                ).andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422ErrorForHttpMessageNotReadableExceptionAddMethod() throws Exception {
        Map<String, String> input = new HashMap<>();
        input.put("operand1", "ten");
        input.put("operand2", "10");

        String inputAdd = mapper.writeValueAsString(input);

        mockMvc.perform(
                        MockMvcRequestBuilders.post("/add")
                                .content(inputAdd)
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    public void shouldReturn422ErrorForMethodArgumentNotValidExceptionAddMethod() throws Exception {
        Map<String, String> input = new HashMap<>();
        input.put("operand2", "10");

        String inputAdd = mapper.writeValueAsString(input);

        mockMvc.perform(
                        MockMvcRequestBuilders.post("/add")
                                .content(inputAdd)
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }


    @Test
    public void shouldReturnSubtractSolutionObject() throws Exception {
        MathSolution output = new MathSolution(40,38,"subtract", 2);

        String inputJson = mapper.writeValueAsString(output);
        String outputJson = mapper.writeValueAsString(output);

        mockMvc.perform(
                        post("/subtract").content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print()).andExpect(status().isCreated()
                ).andExpect(content().json(outputJson));
    }


    @Test
    public void shouldReturn422ErrorForHttpMessageNotReadableExceptionSubtractMethod() throws Exception {
        Map<String, String> input = new HashMap<>();
        input.put("operand1", "ten");
        input.put("operand2", "10");

        String inputSubtract = mapper.writeValueAsString(input);

        mockMvc.perform(
                        MockMvcRequestBuilders.post("/subtract")
                                .content(inputSubtract)
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422ErrorForMethodArgumentNotValidExceptionSubtractMethod() throws Exception {
        Map<String, String> input = new HashMap<>();
        input.put("operand1", "ten");

        String inputSubtract = mapper.writeValueAsString(input);

        mockMvc.perform(
                        MockMvcRequestBuilders.post("/subtract")
                                .content(inputSubtract)
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnMultiplySolutionObject() throws Exception {
        MathSolution output = new MathSolution(4,5,"multiply", 20);

        String inputJson = mapper.writeValueAsString(output);
        String outputJson = mapper.writeValueAsString(output);

        mockMvc.perform(
                        post("/multiply").content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print()).andExpect(status().isCreated()
                ).andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422ErrorForHttpMessageNotReadableExceptionMultiplyMethod() throws Exception {
        Map<String, String> input = new HashMap<>();
        input.put("operand1", "ten");
        input.put("operand2", "10");

        String inputMultiply = mapper.writeValueAsString(input);

        mockMvc.perform(
                        MockMvcRequestBuilders.post("/multiply")
                                .content(inputMultiply)
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422ErrorForMethodArgumentNotValidExceptionMultiplyMethod() throws Exception {
        Map<String, String> input = new HashMap<>();
        input.put("operand1", "ten");
        input.put("operand2", "9");

        String inputMultiply = mapper.writeValueAsString(input);

        mockMvc.perform(
                        MockMvcRequestBuilders.post("/multiply")
                                .content(inputMultiply)
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }


    @Test
    public void shouldReturnDivideSolutionObject() throws Exception  {
        MathSolution output = new MathSolution(10,5,"divide", 2);

        String inputJson = mapper.writeValueAsString(output);
        String outputJson = mapper.writeValueAsString(output);

        mockMvc.perform(
                        post("/divide").content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print()).andExpect(status().isCreated()
                ).andExpect(content().json(outputJson));
    }


    @Test
    public void shouldReturn422ErrorForHttpMessageNotReadableExceptionDivideMethod() throws Exception {
        Map<String, String> input = new HashMap<>();
        input.put("operand1", "ten");
        input.put("operand2", "10");

        String inputDivide = mapper.writeValueAsString(input);

        mockMvc.perform(
                        MockMvcRequestBuilders.post("/add")
                                .content(inputDivide)
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422ErrorForMethodArgumentNotValidExceptionDivideMethod() throws Exception {
        Map<String, String> input = new HashMap<>();
        input.put("operand1", "nine");


        String inputDivide = mapper.writeValueAsString(input);

        mockMvc.perform(
                        MockMvcRequestBuilders.post("/add")
                                .content(inputDivide)
                                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }


    @Test
    public void shouldReturn422ErrorForDivideByZero() throws Exception {
        MathSolution output = new MathSolution(10,0,"divide", 0);

        String inputJson = mapper.writeValueAsString(output);

        mockMvc.perform(
                        post("/divide").content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print()).andExpect(status().isUnprocessableEntity());

    }

}