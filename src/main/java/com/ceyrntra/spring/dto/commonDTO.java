package com.ceyrntra.spring.dto;

import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class commonDTO {

    private String p_name;
    private int teacher;
    private List<QuestionDTO> questionDTOList;
}
