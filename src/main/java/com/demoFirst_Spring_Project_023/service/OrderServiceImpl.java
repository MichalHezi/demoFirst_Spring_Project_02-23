import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerService customerService;

    @Override
    public OrderResponse createOrder(OrderRequest orderRequest) {
        Customer customer = orderRequest.getCustomer();
        Order order = orderRequest.getOrder();
        OrderResponse orderResponse;
        if(customer.getCustomerId() != null && customerService.getCustomerById(customer.getCustomerId()) != null){
            order.setCustomerId(customer.getCustomerId());
            orderRepository.createOrder(order);
            orderResponse = new OrderResponse(
                    customerService.getCustomerById(customer.getCustomerId()),
                    orderRepository.getOrdersByCustomerId(customer.getCustomerId())
            );
        }else{
            Integer newCustomerId = customerService.createCustomer(customer);
            order.setCustomerId(newCustomerId);
            orderRepository.createOrder(order);
            orderResponse = new OrderResponse(
                    customerService.getCustomerById(newCustomerId),
                    orderRepository.getOrdersByCustomerId(newCustomerId)
            );
        }
        return orderResponse;
    }

    @Override
    public void deleteOrder(int id) {
        orderRepository.deleteOrder(id);
    }

    @Override
    public void updateOrderItemName(String newItemName, int orderId) {
        orderRepository.updateOrderItemName(newItemName,orderId);
    }

    @Override
    public Order getOrderById(int id) {
        return orderRepository.getOrderById(id);
    }
}