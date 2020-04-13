package ao.httpstatuscode.romavicdosanjos.statusCode

/**
 * Author: Romavic dos Anjos
 * Server Error Status: The server failed to fulfill an apparently valid request.
 * Link about it: https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#4xx_Client_errors
 */

var serverErrorConnectionStatus: Int = 0

object ServerErrorStatusCode {

    @JvmStatic
    val InternalServerError: Int
        get() {
            serverErrorConnectionStatus = 500
            return serverErrorConnectionStatus
        }

    @JvmStatic
    val NotImplemented: Int
        get() {
            serverErrorConnectionStatus = 501
            return serverErrorConnectionStatus
        }

    @JvmStatic
    val BadGateway: Int
        get() {
            serverErrorConnectionStatus = 502
            return serverErrorConnectionStatus
        }

    @JvmStatic
    val ServiceUnavailable: Int
        get() {
            serverErrorConnectionStatus = 503
            return serverErrorConnectionStatus
        }

    @JvmStatic
    val GatewayTimeout: Int
        get() {
            serverErrorConnectionStatus = 504
            return serverErrorConnectionStatus
        }

    @JvmStatic
    val HttpVersionNotSupported: Int
        get() {
            serverErrorConnectionStatus = 505
            return serverErrorConnectionStatus
        }

    @JvmStatic
    val VariantAlsoNegotiates: Int
        get() {
            serverErrorConnectionStatus = 506
            return serverErrorConnectionStatus
        }

    @JvmStatic
    val InsufficientStorage: Int
        get() {
            serverErrorConnectionStatus = 507
            return serverErrorConnectionStatus
        }

    @JvmStatic
    val LoopDetected: Int
        get() {
            serverErrorConnectionStatus = 508
            return serverErrorConnectionStatus
        }

    @JvmStatic
    val NotExtended: Int
        get() {
            serverErrorConnectionStatus = 510
            return serverErrorConnectionStatus
        }

    @JvmStatic
    val NetworkAuthenticationRequired: Int
        get() {
            serverErrorConnectionStatus = 511
            return serverErrorConnectionStatus
        }
}