package com.temelt.issuemanagement.service;

import com.temelt.issuemanagement.dto.IssueDto;
import com.temelt.issuemanagement.entity.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto>getAllPageable (Pageable pageable);

    Boolean delete (IssueDto issue);
}
