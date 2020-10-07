package ao.httpstatuscode.romavicdosanjos.statusCode

/**
 * Author: Romavic dos Anjos
 * Redirection Status: Further action needs to be taken in order to complete the request.
 * Link about it: https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#3xx_Redirection
 */

object Redirection {

    @JvmStatic
    val MultipleChoices: Int = 300

    @JvmStatic
    val MovedPermanently: Int = 301

    @JvmStatic
    val Found: Int = 302

    @JvmStatic
    val SeeOther: Int = 303

    @JvmStatic
    val NotModified: Int = 304

    @JvmStatic
    val UseProxy: Int = 305

    @JvmStatic
    val SwitchProxy: Int = 306

    @JvmStatic
    val TemporaryRedirect: Int = 307

    @JvmStatic
    val PermanentRedirect: Int = 308
}