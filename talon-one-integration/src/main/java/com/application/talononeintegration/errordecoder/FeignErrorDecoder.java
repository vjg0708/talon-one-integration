package com.application.talononeintegration.errordecoder;

import com.application.talononeintegration.exception.InternalServerError;
import com.application.talononeintegration.exception.ResourceForbiddenException;
import com.application.talononeintegration.exception.ResourceNotFoundException;
import com.application.talononeintegration.exception.ResourceUnauthorizedException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class FeignErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {

        HttpStatus status = HttpStatus.valueOf(response.status());

        return switch (status) {
            case BAD_REQUEST -> new BadRequestException(response.reason() + ":" + response.request().url());
            case NOT_FOUND -> new ResourceNotFoundException(response.reason() + ":" + response.request().url());
            case UNAUTHORIZED -> new ResourceUnauthorizedException(response.reason() + ":" + response.request().url());
            case FORBIDDEN -> new ResourceForbiddenException(response.reason() + ":" + response.request().url());
            case INTERNAL_SERVER_ERROR -> new InternalServerError(response.reason() + ":" + response.request().url());
            default -> defaultDecoder.decode(methodKey, response);
        };
    }
}
