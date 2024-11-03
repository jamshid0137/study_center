package com.backend.studycenter.common.dto.studycenter;





import com.backend.studycenter.common.dto.education.GroupDTO;
import com.backend.studycenter.common.model.studycenter.Filial;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class MainCenterDTO {
    private Long id;
    @NotNull
    @Size(max = 50)
    private String name;
    private String description;

    private List<GroupDTO> groupDTOs;

    @JsonProperty("filials")
    private List<FilialDTO>filialDTOs;

    public MainCenterDTO() {
    }

    public MainCenterDTO(Long id, String name, String description,List<GroupDTO> groupDTOs,List<FilialDTO>filialDTOs) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.groupDTOs=groupDTOs;
        this.filialDTOs=filialDTOs;
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

    public List<FilialDTO> getFilialDTOs() {
        return filialDTOs;
    }

    public void setFilialDTOs(List<FilialDTO> filialDTOs) {
        this.filialDTOs = filialDTOs;
    }

}
