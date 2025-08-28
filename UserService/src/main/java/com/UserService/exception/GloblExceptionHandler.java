package com.UserService.exception;

import com.UserService.Payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GloblExceptionHandler {
    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ApiResponse> HhandlerResourceNotFound(ResourceNotFound ex){

//        String message=ex.getMessage();
//        ApiResponse response=ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
//        return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);

        String message=ex.getMessage();
        ApiResponse response=new ApiResponse( ex.getMessage(),
                false,   // failure since resource not found
                HttpStatus.NOT_FOUND);
        return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
    }
}
