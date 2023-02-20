package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService,
                          OrderService orderService,
                          OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isBought = orderService.order(orderRequest.getUser(), orderRequest.getOrderDate(),
                orderRequest.getProductId(), orderRequest.getQuantity(), orderRequest.getPrice());

        if (isBought) {
            informationService.inform(orderRequest.getUser(), orderRequest.getQuantity()*orderRequest.getPrice());
            orderRepository.makeOrder(orderRequest.getUser(), orderRequest.getOrderDate(), orderRequest.getProductId(),
                    orderRequest.getQuantity(), orderRequest.getPrice());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}

