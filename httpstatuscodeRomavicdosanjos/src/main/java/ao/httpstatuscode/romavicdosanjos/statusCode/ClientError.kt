package ao.httpstatuscode.romavicdosanjos.statusCode

/**
 * Author: Romavic dos Anjos
 * Client Error Status: The request contains bad syntax or cannot be fulfilled.
 * Link about it: https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#4xx_Client_errors
 */

object ClientError {

    @JvmStatic
    val BadRequest: Int = 400

    @JvmStatic
    val Unauthorized: Int = 401

    @JvmStatic
    val PaymentRequired: Int = 402

    @JvmStatic
    val Forbidden: Int = 403

    @JvmStatic
    val NotFound: Int = 404

    @JvmStatic
    val MethodNotAllowed: Int = 405

    @JvmStatic
    val NotAcceptable: Int = 406

    @JvmStatic
    val ProxyAuthenticationRequired: Int = 407

    @JvmStatic
    val RequestTimeout: Int = 408

    @JvmStatic
    val Conflict: Int = 409

    @JvmStatic
    val Gone: Int = 410

    @JvmStatic
    val LengthRequired: Int = 411

    @JvmStatic
    val PreconditionFailed: Int = 412

    @JvmStatic
    val PayloadTooLarge: Int = 413

    @JvmStatic
    val UriTooLong: Int = 414

    @JvmStatic
    val UnsupportedMediaType: Int = 415

    @JvmStatic
    val RangeNotSatisfiable: Int = 416

    @JvmStatic
    val ExpectationFailed: Int = 417

    @JvmStatic
    val ImATeapot: Int = 418

    @JvmStatic
    val MisdirectedRequest: Int = 421

    @JvmStatic
    val UnprocessableEntity: Int = 422

    @JvmStatic
    val Locked: Int = 423

    @JvmStatic
    val FailedDependency: Int = 424

    @JvmStatic
    val TooEarly: Int = 425

    @JvmStatic
    val UpgradeRequired: Int = 426

    @JvmStatic
    val PreconditionRequired: Int = 428

    @JvmStatic
    val TooManyRequest: Int = 429

    @JvmStatic
    val RequestHeaderFieldsTooLarge: Int = 431

    @JvmStatic
    val UnavailableForLegalReasons: Int = 451

}
