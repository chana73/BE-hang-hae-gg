package com.example.hanghaegg.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberErrorCode implements ErrorCode {

	INACTIVE_MEMBER(HttpStatus.FORBIDDEN, "본인만 수정/삭제할 수 있습니다"),
	DUPLICATED_MEMBER(HttpStatus.BAD_REQUEST, "이미 존재하는 nickname 입니다"),
	DUPLICATED_EMAIL(HttpStatus.BAD_REQUEST,"이미 존재하는 email 입니다"),
	MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "회원을 찾을 수 없습니다"),
	INVALID_PASSWORD(HttpStatus.NOT_FOUND, "비밀번호가 일치하지 않습니다"),
	PASSWORD_ERROR1(HttpStatus.NOT_FOUND, "비밀번호는 4자 이상 8자 이하여야 합니다"),
	EMAIL_ERROR1(HttpStatus.NOT_FOUND, "이메일 형식이 올바르지 않습니다")
	;

	private final HttpStatus httpStatus;
	private final String message;
}
