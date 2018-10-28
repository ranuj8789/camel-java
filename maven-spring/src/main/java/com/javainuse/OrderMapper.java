package com.javainuse;


import com.javainuse.OrderItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapper {

    public Map<String, Object> getMap(OrderItem orderitem) {
        Map<String, Object> answer = new HashMap<String, Object>();
        answer.put("productId", orderitem.getProductId());
        answer.put("price", orderitem.getPrice());
        return answer;
    }


}

    
