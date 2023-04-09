package com.blogapp.service;

import com.blogapp.payload.PostDto;
import com.blogapp.payload.PostResponse;

import java.util.List;

public interface PostService {
    public PostDto createPost(PostDto postDto);
    public PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);
    public PostDto getPostById(long id);
    public PostDto updatePost(long id, PostDto postDto);
    public void deletePost(long id);
}
