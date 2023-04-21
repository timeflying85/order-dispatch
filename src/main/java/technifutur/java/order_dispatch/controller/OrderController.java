package technifutur.java.order_dispatch.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import technifutur.java.order_dispatch.model.dto.OrderDTO;
import technifutur.java.order_dispatch.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping("/{id:[0-9]+}")
    public OrderDTO getOne(@PathVariable long id){

        return orderService.getOne(id);

    }

    @GetMapping("/all")
    public List<OrderDTO> getAll() {

        return orderService.getAll();

    }


}
