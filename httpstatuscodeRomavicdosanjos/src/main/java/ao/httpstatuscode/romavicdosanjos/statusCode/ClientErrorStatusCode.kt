package ao.httpstatuscode.romavicdosanjos.statusCode

/**
 * Author: Romavic dos Anjos
 * Client Error Status: The request contains bad syntax or cannot be fulfilled.
 * Link about it: https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#4xx_Client_errors
 */

var clientErrorConnectionStatus: Int = 0

object ClientErrorStatusCode {

    @JvmStatic
    val BadRequest: Int
        get() {
            clientErrorConnectionStatus = 400
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val Unauthorized: Int
        get() {
            clientErrorConnectionStatus = 401
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val PaymentRequired: Int
        get() {
            clientErrorConnectionStatus = 402
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val Forbidden: Int
        get() {
            clientErrorConnectionStatus = 403
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val NotFound: Int
        get() {
            clientErrorConnectionStatus = 404
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val MethodNotAllowed: Int
        get() {
            clientErrorConnectionStatus = 405
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val NotAcceptable: Int
        get() {
            clientErrorConnectionStatus = 406
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val ProxyAuthenticationRequired: Int
        get() {
            clientErrorConnectionStatus = 407
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val RequestTimeout: Int
        get() {
            clientErrorConnectionStatus = 408
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val Conflict: Int
        get() {
            clientErrorConnectionStatus = 409
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val Gone: Int
        get() {
            clientErrorConnectionStatus = 410
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val LengthRequired: Int
        get() {
            clientErrorConnectionStatus = 411
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val PreconditionFailed: Int
        get() {
            clientErrorConnectionStatus = 412
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val PayloadTooLarge: Int
        get() {
            clientErrorConnectionStatus = 413
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val UriTooLong: Int
        get() {
            clientErrorConnectionStatus = 414
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val UnsupportedMediaType: Int
        get() {
            clientErrorConnectionStatus = 415
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val RangeNotSatisfiable: Int
        get() {
            clientErrorConnectionStatus = 416
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val ExpectationFailed: Int
        get() {
            clientErrorConnectionStatus = 417
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val ImATeapot: Int
        get() {
            clientErrorConnectionStatus = 418
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val MisdirectedRequest: Int
        get() {
            clientErrorConnectionStatus = 421
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val UnprocessableEntity: Int
        get() {
            clientErrorConnectionStatus = 422
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val Locked: Int
        get() {
            clientErrorConnectionStatus = 423
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val FailedDependency: Int
        get() {
            clientErrorConnectionStatus = 424
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val TooEarly: Int
        get() {
            clientErrorConnectionStatus = 425
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val UpgradeRequired: Int
        get() {
            clientErrorConnectionStatus = 426
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val PreconditionRequired: Int
        get() {
            clientErrorConnectionStatus = 428
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val TooManyRequest: Int
        get() {
            clientErrorConnectionStatus = 429
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val RequestHeaderFieldsTooLarge: Int
        get() {
            clientErrorConnectionStatus = 431
            return clientErrorConnectionStatus
        }

    @JvmStatic
    val UnavailableForLegalReasons: Int
        get() {
            clientErrorConnectionStatus = 451
            return clientErrorConnectionStatus
        }
}
