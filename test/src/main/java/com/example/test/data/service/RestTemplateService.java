package com.example.test.data.service;

import com.example.test.data.dto.MemberDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface RestTemplateService {
    public String getAroundHub();

    public String getName();

    public String getName2();

    public ResponseEntity<MemberDTO> postDto();

    public ResponseEntity<MemberDTO> addHeader();
}
