package com.projeto.dawa.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class MessageErrorException {

	private int statusCode;
	private Date time;
	private String message;
	private String desc;
	
	
}
