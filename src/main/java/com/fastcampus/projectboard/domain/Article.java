package com.fastcampus.projectboard.domain;

public class Article {

    private Long id;
    private String title; //게시글 제목
    private String content; //게시글 본문
    private String hashtag; // 게시글 해시태그
    private String createdAt; // 생성일시
    private String createdBy;//생성자
    private String modifiedAt; //수정일시
    private String modifiedBy; // 수정자에 관한 필드가 필요할까? 어차피 게시글 작성자만 글을 수정할 수 있는게 아닌지?
    // 댓글을 리스트로 받아오기 위한 필드는 필요없는지?
}
