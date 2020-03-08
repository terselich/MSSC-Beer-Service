package com.springframework.msscbeerservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;


public class BeerPagedList extends PageImpl<BeerDTO> {

    /*
     *      CONSTRUCTORS
     */
    public BeerPagedList(List<BeerDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<BeerDTO> content){ super(content); }
}

