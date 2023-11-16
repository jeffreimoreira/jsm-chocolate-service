package moreira.jeffrei.jsmchocolateservice.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import moreira.jeffrei.jsmchocolateservice.web.model.ChocolateDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ChocolateController.class)
class ChocolateControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getChocolateById() throws Exception {
        mockMvc.perform(get("/api/v1/chocolate/" +
                UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewChocolate() throws Exception {

        ChocolateDto dto = ChocolateDto.builder().build();
        String dtoJson = objectMapper.writeValueAsString(dto);

        mockMvc.perform(post("/api/v1/chocolate")
                .contentType(MediaType.APPLICATION_JSON)
                .content(dtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateChocolateById() throws Exception {

        ChocolateDto dto = ChocolateDto.builder().build();
        String dtoJson = objectMapper.writeValueAsString(dto);

        mockMvc.perform(put("/api/v1/chocolate/" + UUID.randomUUID().toString())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(dtoJson))
                .andExpect(status().isNoContent());
    }
}