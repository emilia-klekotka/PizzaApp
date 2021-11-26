package pl.emilia.pizza_app.remote.rest.dto.response;

import pl.maciek.pizza_app.remote.rest.dto.request.PersonOrderDto;
import pl.maciek.pizza_app.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class OrderDto {

    private Integer id;
    private String status;
    private List<PizzaOrderDto> pizzas;
    private List<PersonOrderDto> person;

    public OrderDto(Integer id, String status, List<PizzaOrderDto> pizzas, List<PersonOrderDto> person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public List<PersonOrderDto> getPerson() {
        return person;
    }

    public void setPerson(List<PersonOrderDto> person) {
        this.person = person;
    }
}
