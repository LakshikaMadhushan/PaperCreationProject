package com.ceyrntra.spring.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonMarkSheetDTO {

    private String studentMail;
    private List<Mark_SheetDTO> markSheetDTOS;

    public String getStudentMail() {
        return studentMail;
    }

    public void setStudentMail(String studentMail) {
        this.studentMail = studentMail;
    }

    public List<Mark_SheetDTO> getMarkSheetDTOS() {
        return markSheetDTOS;
    }

    public void setMarkSheetDTOS(List<Mark_SheetDTO> markSheetDTOS) {
        this.markSheetDTOS = markSheetDTOS;
    }
}
