package ao.httpstatuscode.romavicdosanjos.statusCode

/**
 * Author: Romavic dos Anjos
 * Successful Status: The request was successfully received, understood, and accepted.
 * Link about it: https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#2xx_Success
 */

var successfulConnectionStatus: Int = 0

object SuccessfulStatusCode {

    @JvmStatic
    val Ok: Int
        get() {
            successfulConnectionStatus = 200
            return successfulConnectionStatus
        }

    @JvmStatic
    val Created: Int
        get() {
            successfulConnectionStatus = 201
            return successfulConnectionStatus
        }

    @JvmStatic
    val Accepted: Int
        get() {
            successfulConnectionStatus = 202
            return successfulConnectionStatus
        }

    @JvmStatic
    val NonAuthoritativeInformational: Int
        get() {
            successfulConnectionStatus = 203
            return successfulConnectionStatus
        }

    @JvmStatic
    val NoContent: Int
        get() {
            successfulConnectionStatus = 204
            return successfulConnectionStatus
        }

    @JvmStatic
    val ResetContent: Int
        get() {
            successfulConnectionStatus = 205
            return successfulConnectionStatus
        }

    @JvmStatic
    val PartialContent: Int
        get() {
            successfulConnectionStatus = 206
            return successfulConnectionStatus
        }

    @JvmStatic
    val MultiStatus: Int
        get() {
            successfulConnectionStatus = 207
            return successfulConnectionStatus
        }

    @JvmStatic
    val AlreadyReported: Int
        get() {
            successfulConnectionStatus = 208
            return successfulConnectionStatus
        }

    @JvmStatic
    val IMUsed: Int
        get() {
            successfulConnectionStatus = 226
            return successfulConnectionStatus
        }
}