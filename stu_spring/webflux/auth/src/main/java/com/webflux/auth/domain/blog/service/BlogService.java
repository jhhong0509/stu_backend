package com.webflux.auth.domain.blog.service;

import com.webflux.auth.domain.blog.payload.request.CreateBlogRequest;
import com.webflux.auth.domain.blog.payload.response.BlogListResponse;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Mono;

public interface BlogService {
    Mono<Void> createBlog(CreateBlogRequest request, String email);

    Mono<BlogListResponse> getBlogList(Pageable pageable);
}
