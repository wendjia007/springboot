package com.wendjia.springboot.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="wendjia")
public class WendjiaProteries {


    private String name;

    private String title;

    private String showName;
}
