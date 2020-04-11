package ao.httpstatuscode.romavicdosanjos

import ao.httpstatuscode.romavicdosanjos.enumsStatesCode.*


//This class was created by: Romavic dos Anjos KC...!!!

object HttpStatusCode {
    @JvmStatic
    fun INFORMATIONAL(informational: Informational?): Int {
        var connectionStatusInformation = 0
        when (informational) {
            Informational.CONTINUE -> connectionStatusInformation = 100
            Informational.SWITCHING_PROTOCOLS -> connectionStatusInformation = 101
            Informational.PROCESSING -> connectionStatusInformation = 102
            Informational.EARLY_HINTS -> connectionStatusInformation = 103
        }
        return connectionStatusInformation
    }

    @JvmStatic
    fun SUCCESSFUL(successful: Successful?): Int {
        var connectionStatusSuccessful = 0
        when (successful) {
            Successful.OK -> connectionStatusSuccessful = 200
            Successful.CREATED -> connectionStatusSuccessful = 201
            Successful.ACCEPTED -> connectionStatusSuccessful = 202
            Successful.NON_AUTHORITATIVE_INFORMATION -> connectionStatusSuccessful = 203
            Successful.NO_CONTENT -> connectionStatusSuccessful = 204
            Successful.RESET_CONTENT -> connectionStatusSuccessful = 205
            Successful.PARTIAL_CONTENT -> connectionStatusSuccessful = 206
            Successful.MULTI_STATUS -> connectionStatusSuccessful = 207
            Successful.ALREADY_REPORTED -> connectionStatusSuccessful = 208
            Successful.IM_USED -> connectionStatusSuccessful = 226
        }
        return connectionStatusSuccessful
    }

    @JvmStatic
    fun REDIRECTION(redirection: Redirection?): Int {
        var connectionStatusRedirection = 0
        when (redirection) {
            Redirection.MULTIPLE_CHOICES -> connectionStatusRedirection = 300
            Redirection.MOVED_PERMANENTLY -> connectionStatusRedirection = 301
            Redirection.FOUND -> connectionStatusRedirection = 302
            Redirection.SEE_OTHER -> connectionStatusRedirection = 303
            Redirection.NOT_MODIFIED -> connectionStatusRedirection = 304
            Redirection.USE_PROXY -> connectionStatusRedirection = 305
            Redirection.SWITCH_PROXY -> connectionStatusRedirection = 306
            Redirection.TEMPORARY_REDIRECT -> connectionStatusRedirection = 307
            Redirection.PERMANENT_REDIRECT -> connectionStatusRedirection = 308
        }
        return connectionStatusRedirection
    }

    @JvmStatic
    fun CLIENT_ERROR(clientError: ClientError?): Int {
        var connectionStatusClientError = 0
        when (clientError) {
            ClientError.BAD_REQUEST -> connectionStatusClientError = 400
            ClientError.UNAUTHORIZED -> connectionStatusClientError = 401
            ClientError.PAYMENT_REQUIRED -> connectionStatusClientError = 402
            ClientError.FORBIDDEN -> connectionStatusClientError = 403
            ClientError.NOT_FOUND -> connectionStatusClientError = 404
            ClientError.METHOD_NOT_ALLOWED -> connectionStatusClientError = 405
            ClientError.NOT_ACCEPTABLE -> connectionStatusClientError = 406
            ClientError.PROXY_AUTHENTICATION_REQUIRED -> connectionStatusClientError = 407
            ClientError.REQUEST_TIMEOUT -> connectionStatusClientError = 408
            ClientError.CONFLICT -> connectionStatusClientError = 409
            ClientError.GONE -> connectionStatusClientError = 410
            ClientError.LENGTH_REQUIRED -> connectionStatusClientError = 411
            ClientError.PRECONDITION_FAILED -> connectionStatusClientError = 412
            ClientError.PAYLOAD_TOO_LARGE -> connectionStatusClientError = 413
            ClientError.URI_TOO_LONG -> connectionStatusClientError = 414
            ClientError.UNSUPPORTED_MEDIA_TYPE -> connectionStatusClientError = 415
            ClientError.RANGE_NOT_SATISFIABLE -> connectionStatusClientError = 416
            ClientError.EXPECTATION_FAILED -> connectionStatusClientError = 417
            ClientError.IM_A_TEAPOT -> connectionStatusClientError = 418
            ClientError.MISDIRECTED_REQUEST -> connectionStatusClientError = 421
            ClientError.UNPROCESSABLE_ENTITY -> connectionStatusClientError = 422
            ClientError.LOCKED -> connectionStatusClientError = 423
            ClientError.FAILED_DEPENDENCY -> connectionStatusClientError = 424
            ClientError.TOO_EARLY -> connectionStatusClientError = 425
            ClientError.UPGRADE_REQUIRED -> connectionStatusClientError = 426
            ClientError.PRECONDITION_REQUIRED -> connectionStatusClientError = 428
            ClientError.TOO_MANY_REQUEST -> connectionStatusClientError = 429
            ClientError.REQUEST_HEADER_FIELDS_TOO_LARGE -> connectionStatusClientError = 431
            ClientError.UNAVAILABLE_FOR_LEGAL_REASONS -> connectionStatusClientError = 451
        }
        return connectionStatusClientError
    }

    @JvmStatic
    fun SERVER_ERROR(serverError: ServerError?): Int {
        var connectionStatusServerError = 0
        when (serverError) {
            ServerError.INTERNAL_SERVER_ERROR -> connectionStatusServerError = 500
            ServerError.NOT_IMPLEMENTED -> connectionStatusServerError = 501
            ServerError.BAD_GATEWAY -> connectionStatusServerError = 502
            ServerError.SERVICE_UNAVAILABLE -> connectionStatusServerError = 503
            ServerError.GATEWAY_TIMEOUT -> connectionStatusServerError = 504
            ServerError.HTTP_VERSION_NOT_SUPPORTED -> connectionStatusServerError = 505
            ServerError.VARIANT_ALSO_NEGOTIATES -> connectionStatusServerError = 506
            ServerError.INSUFICIENT_STORAGE -> connectionStatusServerError = 507
            ServerError.LOOP_DETECTED -> connectionStatusServerError = 508
            ServerError.NOT_EXTENDED -> connectionStatusServerError = 510
            ServerError.NETWORK_AUTHENTICATION_REQUIRED -> connectionStatusServerError = 511
        }
        return connectionStatusServerError
    }
}