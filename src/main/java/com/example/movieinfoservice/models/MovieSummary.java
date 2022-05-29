package com.example.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MovieSummary {
    private String id;
    private String title;
    private String overview;
}
