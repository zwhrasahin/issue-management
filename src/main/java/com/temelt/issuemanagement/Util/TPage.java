package com.temelt.issuemanagement.Util;

import lombok.Data;
import org.springframework.data.domain.Sort;

import java.util.List;

@Data
public class TPage <I>{

    private int number;
    private int size;
    private Sort sort;
    private int totalPages;
    private Long totalElements;
    private List<I>content;

    public void setStat(Page page, List<I> list){
        this.number = page.getNumber();
        this.size = page.getSize();
        this.sort = page.getSort();
        this.totalPages = page.getTotalPage();
        this.totalElements = page.TotalElements();

    }}




