package com.ceyrntra.spring.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Paper_Student {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   @ManyToOne
   @JoinColumn(name = "student_id",referencedColumnName = "student_id")
   private Student student;

   @ManyToOne
   @JoinColumn(name="p_id", referencedColumnName = "p_id", nullable = false)
   private Paper paper;

   public Paper_Student(Student student, Paper paper) {
      this.student = student;
      this.paper = paper;
   }
}
