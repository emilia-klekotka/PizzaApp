package pl.emilia.pizza_app.remote.rest.dto.response;

import pl.maciek.pizza_app.domain.model.SizeType;

import java.math.BigDecimal;

public class SizeDto {

    private Integer Id;
    private SizeType size;
    private BigDecimal price;

    public SizeDto(Integer id, SizeType size, BigDecimal price) {
        Id = id;
        this.size = size;
        this.price = price;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public SizeType getSize() {
        return size;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

