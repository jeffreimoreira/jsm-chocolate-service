package moreira.jeffrei.jsmchocolateservice.web.controller;

import moreira.jeffrei.jsmchocolateservice.web.model.ChocolateDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by jeffr on 2023-11-15
 */
@RestController
@RequestMapping("/api/v1/chocolate")
public class ChocolateController {

    @GetMapping("/{chocolateId}")
    public ResponseEntity<ChocolateDto> getChocolateById(@PathVariable UUID chocolateId) {
        // todo impl
        return new ResponseEntity<>(ChocolateDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewChocolate(@RequestBody ChocolateDto dto) {
        // todo impl
        HttpHeaders headers = new HttpHeaders();
        // TODO add hostname to url
        headers.add("Location", "/api/v1/chocolate/" + UUID.randomUUID().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
        //return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{chocolateId}")
    public ResponseEntity updateChocolateById(@PathVariable UUID chocolateId,
                                              @RequestBody ChocolateDto dto) {

        // todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteChocolate(@PathVariable UUID id) {
        // todo impl
    }
}
