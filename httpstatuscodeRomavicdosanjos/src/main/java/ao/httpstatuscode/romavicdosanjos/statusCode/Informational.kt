package ao.httpstatuscode.romavicdosanjos.statusCode

/**
 * Author: Romavic dos Anjos
 * Informational Status: The request was received, continuing process.
 * Link about it: https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#1xx_Informational_response
 */

object Informational {

    @JvmStatic
    val Continue: Int = 100

    @JvmStatic
    val SwitchingProtocols: Int = 101

    @JvmStatic
    val Processing: Int = 102

    @JvmStatic
    val EarlyHints: Int = 103
}