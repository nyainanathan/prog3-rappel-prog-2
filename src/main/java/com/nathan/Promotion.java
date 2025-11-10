package com.nathan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;
import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class Promotion {
    private ArrayList<String> groups;
    private Year year;
    private char groupName;
}
