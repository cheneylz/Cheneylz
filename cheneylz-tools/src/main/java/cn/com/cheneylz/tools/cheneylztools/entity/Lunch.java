package cn.com.cheneylz.tools.cheneylztools.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("model_lunch")
public class Lunch implements Serializable {

    private String id;

    private String name;

    private String picUrl;

    private String type;

}
