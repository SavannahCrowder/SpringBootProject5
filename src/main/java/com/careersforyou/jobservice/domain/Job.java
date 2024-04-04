package com.careersforyou.jobservice.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
public record Job (
        @NotNull(message = "The jobid must be defined.")
        String jobid,
        @NotBlank(message = "The job title must be defined.")
        String title,
        @NotBlank(message = "The job description must be defined.")
        String description,
        @NotBlank(message = "The jobs companyname must be defined.")
        String companyname,
        @NotBlank(message = "The job skill1 must be defined.")
        String skill1,
        @NotBlank(message = "The job skill2 must be defined.")
        String skill2

) {
}
