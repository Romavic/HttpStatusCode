package ao.httpstatuscode.romavicdosanjos.statusCode

/**
 * Author: Romavic dos Anjos
 * Server Error Status: The server failed to fulfill an apparently valid request.
 * Link about it: https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#4xx_Client_errors
 */


object ServerError {

    @JvmStatic
    val InternalServerError: Int = 500

    @JvmStatic
    val NotImplemented: Int = 501

    @JvmStatic
    val BadGateway: Int = 502

    @JvmStatic
    val ServiceUnavailable: Int = 503

    @JvmStatic
    val GatewayTimeout: Int = 504

    @JvmStatic
    val HttpVersionNotSupported: Int = 505

    @JvmStatic
    val VariantAlsoNegotiates: Int = 506

    @JvmStatic
    val InsufficientStorage: Int = 507

    @JvmStatic
    val LoopDetected: Int = 508

    @JvmStatic
    val NotExtended: Int = 510

    @JvmStatic
    val NetworkAuthenticationRequired: Int = 511
}