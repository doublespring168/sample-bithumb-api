package com.izeye.sample.bithumb.service;

import java.util.Map;

import com.izeye.sample.bithumb.Currency;

/**
 * Bithumb API service.
 *
 * @author Johnny Lim
 */
public interface BithumbApiService {

	Map<String, Object> getTicker(Currency currency);

}
