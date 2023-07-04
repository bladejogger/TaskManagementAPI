package com.group1.taskmanagement.dto;

import lombok.*;

@Getter @Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {

    private Long id;
    private String name;
}