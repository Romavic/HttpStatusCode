package ao.httpstatuscode.romavicdosanjos.statusCode

/**
 * Author: Romavic dos Anjos
 * Informational Status: The request was received, continuing process.
 * Link about it: https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#1xx_Informational_response
 */

var informationalConnectionStatus: Int = 0

object InformationalStatusCode {

    @JvmStatic
    val Continue: Int
        get() {
            informationalConnectionStatus = 100
            return informationalConnectionStatus
        }

    @JvmStatic
    val SwitchingProtocols: Int
        get() {
            informationalConnectionStatus = 101
            return informationalConnectionStatus
        }

    @JvmStatic
    val Processing: Int
        get() {
            informationalConnectionStatus = 102
            return informationalConnectionStatus
        }

    @JvmStatic
    val EarlyHints: Int
        get() {
            informationalConnectionStatus = 103
            return informationalConnectionStatus
        }
}