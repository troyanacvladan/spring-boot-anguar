package com.example.demo.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class AppProperties {

    @Value("#{'${app.name}'}")
    private String appName;
}
