package com.example.BS22;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Ciudad {
    private String nombre;
    private int numeroHabitantes;

    public Ciudad(){}
}
