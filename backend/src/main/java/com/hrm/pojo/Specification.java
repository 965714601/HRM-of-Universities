package com.hrm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Specification {
    private int product_id;
    private int specification_id;
    private String specification_name;
    private String specification_type;
    private int price;
    private String description;
}
