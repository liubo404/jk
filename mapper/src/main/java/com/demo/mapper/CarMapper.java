package com.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper
public interface CarMapper {
    @Mappings({
            @Mapping(source = "numberOfSeats", target = "seatCount")
    })
    CarDto carToCarDto(Car car);
}
