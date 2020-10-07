package ao.httpstatuscode.romavicdosanjos.statusCode

/**
 * Author: Romavic dos Anjos
 * Successful Status: The request was successfully received, understood, and accepted.
 * Link about it: https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#2xx_Success
 */


object Successful {

    @JvmStatic
    val Ok: Int = 200

    @JvmStatic
    val Created: Int = 201

    @JvmStatic
    val Accepted: Int = 202

    @JvmStatic
    val NonAuthoritativeInformational: Int = 203

    @JvmStatic
    val NoContent: Int = 204

    @JvmStatic
    val ResetContent: Int = 205

    @JvmStatic
    val PartialContent: Int = 206

    @JvmStatic
    val MultiStatus: Int = 207

    @JvmStatic
    val AlreadyReported: Int = 208

    @JvmStatic
    val IMUsed: Int = 226
}