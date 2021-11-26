package pl.emilia.pizza_app.remote.rest.dto.response;

import java.util.List;

public class MenuDto {

    private List<PizzaDto> Pizzas;

    public MenuDto(List<PizzaDto> pizzas) {
        Pizzas = pizzas;
    }

    public List<PizzaDto> getPizzas() {
        return Pizzas;
    }

    public void setPizzas(List<PizzaDto> pizzas) {
        Pizzas = pizzas;
    }
}
