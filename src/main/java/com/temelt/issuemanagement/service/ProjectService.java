package com.temelt.issuemanagement.service;

import com.temelt.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    Project getById(Long id);

    List<Project> getByProjectCode(String projectCode);

    List<Project>getByProjectContains(String projectCode);

    Page<Project>getAllPageable(Pageable pageable);

    Boolean delete (Project project);
}
