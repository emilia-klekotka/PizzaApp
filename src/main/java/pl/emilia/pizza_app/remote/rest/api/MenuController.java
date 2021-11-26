package pl.emilia.pizza_app.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.emilia.pizza_app.domain.model.OrderStatusType;
import pl.emilia.pizza_app.remote.rest.dto.response.MenuDto;
import pl.maciek.pizza_app.domain.model.OrderStatusType;
import pl.maciek.pizza_app.remote.rest.dto.response.MenuDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping( value = "/api/v1/menu", produces = APPLICATION_JSON_VALUE)
@RestController

public class MenuController {

    @GetMapping
    public ResponseEntity<MenuDto> getMenu((@RequestParam("id") OrderStatusType orderStatusType,
                                           @RequestHeader("Access-Token") String token))
    { return ResponseEntity.ok(null); }

}