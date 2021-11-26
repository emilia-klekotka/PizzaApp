package pl.emilia.pizza_app.remote.rest.dto.request;

public class PizzaOrderDto {

    private Integer Id;
    private Integer Size;
    private Integer Count;

    public PizzaOrderDto(Integer id, Integer size, Integer count) {
        Id = id;
        Size = size;
        Count = count;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getSize() {
        return Size;
    }

    public void setSize(Integer size) {
        Size = size;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }
}
