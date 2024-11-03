package com.backend.studycenter.common.dto.studycenter;

//public class FilialDTO {




import com.backend.studycenter.common.dto.education.GroupDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class FilialDTO {
    private Long id;
    @NotNull
    @Size(max = 50)
    private String name;
    private String description;
    //@JsonProperty("groups")
    private List<GroupDTO> groupDTOs;

    public FilialDTO() {
    }

    public FilialDTO(Long id, String name, String description,List<GroupDTO> groupDTOs) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.groupDTOs=groupDTOs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<GroupDTO> getGroupDTOs() {
        return groupDTOs;
    }

    public void setGroupDTOs(List<GroupDTO> groupDTOs) {
        this.groupDTOs = groupDTOs;
    }
}
