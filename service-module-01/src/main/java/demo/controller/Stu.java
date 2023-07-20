package demo.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author zhp
 * @date 2023/7/13 11:26
 **/

@Data
public class Stu {
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date time;
}
