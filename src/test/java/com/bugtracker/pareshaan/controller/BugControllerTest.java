package com.bugtracker.pareshaan.controller;

import com.bugtracker.pareshaan.mapper.BugMapper;
import com.bugtracker.pareshaan.payload.BugDto;
import com.bugtracker.pareshaan.service.BugService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

public class BugControllerTest {
    @InjectMocks
    private BugController bugController;

    @Mock
    private BugService bugService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void createBug() {
        BugDto.BugDtoBuilder bugDtoBuilder = BugDto.builder();
        bugDtoBuilder.summary("No response on button click on the main page.");
        bugDtoBuilder.description("Please contact the project owner for more details");
        BugDto bugDto = bugDtoBuilder.build();

        Mockito.when(bugService.saveBug(bugDto)).thenReturn(bugDto);

        ResponseEntity<BugDto> response = bugController.createBug(bugDto);

        Assertions.assertEquals(bugDto, response.getBody());
    }

    @Test
    public void updateBugTest() {
        BugDto.BugDtoBuilder bugDtoBuilder = BugDto.builder();
        bugDtoBuilder.summary("No response on button click on the main page.");
        bugDtoBuilder.description("Please contact the project owner for more details");
        BugDto bugDto = bugDtoBuilder.build();

        Mockito.when(bugService.updateBug(bugDto)).thenReturn(bugDto);

        ResponseEntity<BugDto> response = bugController.updateBug(bugDto);

        Assertions.assertEquals(bugDto, response.getBody());
    }

    @Test
    public void getAllBugs() {

    }
}
