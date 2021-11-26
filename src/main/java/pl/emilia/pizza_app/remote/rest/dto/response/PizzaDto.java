package pl.emilia.pizza_app.remote.rest.dto.response;

import java.util.List;

public class PizzaDto {

    private Integer Id;
    private String Name;
    private List<SizeDto> Sizes;

    public PizzaDto(Integer id, String name, List<SizeDto> sizes) {
        Id = id;
        Name = name;
        Sizes = sizes;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public List<SizeDto> getSizes() {
        return Sizes;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSizes(List<SizeDto> sizes) {
        Sizes = sizes;
    }
}
