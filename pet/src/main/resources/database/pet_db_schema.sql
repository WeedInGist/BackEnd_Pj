create database pet_db;

CREATE TABLE board
(
    `board_Id`    BIGINT           NOT NULL    AUTO_INCREMENT COMMENT '게시글번호', 
    `title`       VARCHAR(100)     NULL        COMMENT '제목', 
    `content`     VARCHAR(1000)    NULL        COMMENT '내용', 
    `regDate`     DATE             NULL        COMMENT '등록일자', 
    `updateDate`  DATE             NULL        COMMENT '수정일자', 
    `deleteDate`  DATE             NULL        COMMENT '삭제일자', 
    `inNum`       BIGINT           NULL        COMMENT '작성자회원번호', 
    `category`    VARCHAR(45)      NULL        COMMENT '카테고리', 
    `recoCount`   INT              NULL        COMMENT '추천수', 
    `viewCount`   INT              NULL        COMMENT '조회수', 
     PRIMARY KEY (board_Id)
);

ALTER TABLE board COMMENT '게시판';

CREATE TABLE userInfo
(
    `idNum`     INT            NOT NULL    AUTO_INCREMENT COMMENT '회원번호', 
    `email`     VARCHAR(45)    NULL        COMMENT '이메일', 
    `password`  VARCHAR(45)    NULL        COMMENT '비밀번호', 
    `phone`     VARCHAR(45)    NULL        COMMENT '핸드폰번호', 
    `gender`    CHAR(1)        NULL        COMMENT '성별', 
    `birth`     DATETIME       NULL        COMMENT '생년월일', 
    `name`      VARCHAR(45)    NULL        COMMENT '이름', 
    `nickname`  VARCHAR(45)    NULL        COMMENT '닉네임', 
    `region`    VARCHAR(45)    NULL        COMMENT '지역', 
    `intro`     VARCHAR(45)    NULL        COMMENT '소개', 
    `pet`       INT            NULL        COMMENT '반려동물', 
    `role`      VARCHAR(45)    NULL        COMMENT '역할', 
    `connect`   INT            NULL        COMMENT '연동', 
     PRIMARY KEY (idNum)
);

ALTER TABLE userInfo COMMENT '유저 정보';