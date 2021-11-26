package pl.emilia.pizza_app.remote.rest.api;


import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.maciek.pizza_app.domain.model.OrderStatusType;
import pl.maciek.pizza_app.remote.rest.dto.request.AddOrderDto;
import pl.maciek.pizza_app.remote.rest.dto.request.UpdateOrderDto;
import pl.maciek.pizza_app.remote.rest.dto.response.OrderCollectionDto;
import pl.maciek.pizza_app.remote.rest.dto.response.OrderDto;
import pl.maciek.pizza_app.remote.rest.dto.response.OrderStatusDto;
import pl.maciek.pizza_app.remote.rest.dto.response.TokenDto;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RequestMapping( value = "/api/v1/orders", produces = APPLICATION_JSON_VALUE)
@RestController

public class OrderController {


    @PostMapping
    public RequestEntity<TokenDto> addOrder (@RequestBody AddOrderDto addOrderDto)
    { return RequestEntity.ok(null); }

    @GetMapping("/status/{token}")
    public RequestEntity<OrderStatusDto> getStatus(@PathVariable("token") String token)
    { return RequestEntity.ok(null); }

    @GetMapping
    public ResponseEntity<OrderCollectionDto> getOrder(@RequestParam("status")OrderStatusType orderStatusType,
                                                       @RequestHeader("Access-Token") String token)
    { return RequestEntity.ok(null); }

    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deleteOrder(@RequestHeader("Access-Token") String token,
                                            @PathVariable("order-id") Integer orderId)
    { return ResponseEntity.ok().build(); }

    @PutMapping("/{order-id}")
    public ResponseEntity<OrderDto> updateOrder(@PathVariable("order-id") Integer orderId,
                                                @RequestHeader("Access-Token") String token,
                                                @RequestBody UpdateOrderDto updateOrderDto)
    { return ResponseEntity.ok(null) }
}
