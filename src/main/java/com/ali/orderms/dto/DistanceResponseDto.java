package com.ali.orderms.dto;

import lombok.Data;
import java.util.List;

@Data
public class DistanceResponseDto {
    private List<Row> rows;

    @Data
    public static class Row {
        private List<Element> elements;
    }

    @Data
    public static class Element {
        private Distance distance;
        private String status;
    }

    @Data
    public static class Distance {
        private String text;
        private Long value;
    }
}