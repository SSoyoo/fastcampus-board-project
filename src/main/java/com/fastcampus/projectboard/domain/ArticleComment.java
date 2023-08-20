package com.fastcampus.projectboard.domain;

public class ArticleComment {

    private Long id;
    private Article articleId; // 특정한 아티클과의 관계, 게시글id
    private String content; // 댓글 본문
    private String createdAt; // 생성일시
    private String createdBy;//생성자
    private String modifiedAt; //수정일시
    private String modifiedBy; // 수정자, 역시 필요할까에 관한 의문
}
