package ao.httpstatuscode.romavicdosanjos.statusCode

/**
 * Author: Romavic dos Anjos
 * Redirection Status: Further action needs to be taken in order to complete the request.
 * Link about it: https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#3xx_Redirection
 */

var redirectionConnectionStatus: Int = 0

object RedirectionStatusCode {

    @JvmStatic
    val MultipleChoices: Int
        get() {
            redirectionConnectionStatus = 300
            return redirectionConnectionStatus
        }

    @JvmStatic
    val MovedPermanently: Int
        get() {
            redirectionConnectionStatus = 301
            return redirectionConnectionStatus
        }

    @JvmStatic
    val Found: Int
        get() {
            redirectionConnectionStatus = 302
            return redirectionConnectionStatus
        }

    @JvmStatic
    val SeeOther: Int
        get() {
            redirectionConnectionStatus = 303
            return redirectionConnectionStatus
        }

    @JvmStatic
    val NotModified: Int
        get() {
            redirectionConnectionStatus = 304
            return redirectionConnectionStatus
        }

    @JvmStatic
    val UseProxy: Int
        get() {
            redirectionConnectionStatus = 305
            return redirectionConnectionStatus
        }

    @JvmStatic
    val SwitchProxy: Int
        get() {
            redirectionConnectionStatus = 306
            return redirectionConnectionStatus
        }

    @JvmStatic
    val TemporaryRedirect: Int
        get() {
            redirectionConnectionStatus = 307
            return redirectionConnectionStatus
        }

    @JvmStatic
    val PermanentRedirect: Int
        get() {
            redirectionConnectionStatus = 308
            return redirectionConnectionStatus
        }
}