package me.www.urlshortener.service;

import me.www.urlshortener.domain.ShortUrl;

/**
 * @author: www
 * @date: 2018/7/21 22:19
 * @description: 短地址Service
 */
public interface ShortUrlService {

    /**
     * 简化url
     *
     * @param url
     * @return
     */
    ShortUrl shortenUrl(String url);

    /**
     * 根据code查询简化结果
     *
     * @param code
     * @return
     */
    ShortUrl getShortUrl(String code);

}