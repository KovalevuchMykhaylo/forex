package com.forex;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The type NullPointerException exception handler.
 *
 * @author Cyrax
 */
@ControllerAdvice
public class ExceptionHandlerController {

    /**
     * Handle multipart exception response transfer.
     *
     * @return the response transfer
     */
    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseTransfer handleMultipartException(){
        return new ResponseTransfer("Fail to send email");
    }
}
