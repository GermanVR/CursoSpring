package org.certificatic.spring.mvc.practica30.controller.advice;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "restResponseError")
public class RestResponseError {

	private int status;
	private String message;
	private String exception;

	public RestResponseError(HttpStatus internalServerError, String message, String exception) {
		this.status = internalServerError.value();
		this.message = message;
		this.exception = exception;
	}

}
