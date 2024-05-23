package com.bugtracker.pareshaan.mapper;

import com.bugtracker.pareshaan.model.Bug;
import com.bugtracker.pareshaan.payload.BugDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BugMapper {
    BugMapper Instance = Mappers.getMapper(BugMapper.class);

    BugDto bugToBugDto(Bug bug);
    Bug bugDtoToBug(BugDto bugDto);
}
