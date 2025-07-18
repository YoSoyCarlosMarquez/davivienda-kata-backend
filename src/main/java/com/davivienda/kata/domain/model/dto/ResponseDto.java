package com.davivienda.kata.domain.model.dto;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "create")
public class ResponseDto<T> {

    @Valid
    @NonNull
    private T data;
}

