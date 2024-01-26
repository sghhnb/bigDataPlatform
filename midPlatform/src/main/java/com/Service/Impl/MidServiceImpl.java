package com.Service.Impl;

import com.Service.MidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("midService")
public class MidServiceImpl implements MidService {
    @Override
    public void Service() {
        log.info("hello mid serivce");
    }
}
