package com.temelt.issuemanagement.service;

import com.temelt.issuemanagement.entity.Issue;
import com.temelt.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User save(User user);

    User getById(Long id);

    Page<Issue>getAllPageable (Pageable pageable);

    Boolean delete(Issue issue);
}
