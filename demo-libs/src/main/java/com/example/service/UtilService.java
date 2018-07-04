package com.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Alex
 * Created by Alex on 2018/7/4.
 */
@Slf4j
@Service
public class UtilService {

	public void ping() {
		log.info("ping");
	}

}
