package ao.httpstatuscode.romavicdosanjoskc

import androidx.test.ext.junit.runners.AndroidJUnit4
import ao.httpstatuscode.romavicdosanjos.statusCode.*
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun clientError() {
        assertEquals(ClientError.BadRequest, 400)
        assertEquals(ClientError.Unauthorized, 401)
        assertEquals(ClientError.PaymentRequired, 402)
        assertEquals(ClientError.Forbidden, 403)
        assertEquals(ClientError.NotFound, 404)
        assertEquals(ClientError.MethodNotAllowed, 405)
        assertEquals(ClientError.NotAcceptable, 406)
        assertEquals(ClientError.ProxyAuthenticationRequired, 407)
        assertEquals(ClientError.RequestTimeout, 408)
        assertEquals(ClientError.Conflict, 409)
        assertEquals(ClientError.Gone, 410)
        assertEquals(ClientError.LengthRequired, 411)
        assertEquals(ClientError.PreconditionFailed, 412)
        assertEquals(ClientError.PayloadTooLarge, 413)
        assertEquals(ClientError.UriTooLong, 414)
        assertEquals(ClientError.UnsupportedMediaType, 415)
        assertEquals(ClientError.RangeNotSatisfiable, 416)
        assertEquals(ClientError.ExpectationFailed, 417)
        assertEquals(ClientError.ImATeapot, 418)
        assertEquals(ClientError.MisdirectedRequest, 421)
        assertEquals(ClientError.UnprocessableEntity, 422)
        assertEquals(ClientError.Locked, 423)
        assertEquals(ClientError.FailedDependency, 424)
        assertEquals(ClientError.TooEarly, 425)
        assertEquals(ClientError.UpgradeRequired, 426)
        assertEquals(ClientError.PreconditionRequired, 428)
        assertEquals(ClientError.TooManyRequest, 429)
        assertEquals(ClientError.RequestHeaderFieldsTooLarge, 431)
        assertEquals(ClientError.UnavailableForLegalReasons, 451)
    }

    @Test
    fun informational() {
        assertEquals(Informational.Continue, 100)
        assertEquals(Informational.SwitchingProtocols, 101)
        assertEquals(Informational.Processing, 102)
        assertEquals(Informational.EarlyHints, 103)
    }

    @Test
    fun redirection() {
        assertEquals(Redirection.MultipleChoices, 300)
        assertEquals(Redirection.MovedPermanently, 301)
        assertEquals(Redirection.Found, 302)
        assertEquals(Redirection.SeeOther, 303)
        assertEquals(Redirection.NotModified, 304)
        assertEquals(Redirection.UseProxy, 305)
        assertEquals(Redirection.SwitchProxy, 306)
        assertEquals(Redirection.TemporaryRedirect, 307)
        assertEquals(Redirection.PermanentRedirect, 308)
    }

    @Test
    fun serverError() {
        assertEquals(ServerError.InternalServerError, 500)
        assertEquals(ServerError.NotImplemented, 501)
        assertEquals(ServerError.BadGateway, 502)
        assertEquals(ServerError.ServiceUnavailable, 503)
        assertEquals(ServerError.GatewayTimeout, 504)
        assertEquals(ServerError.HttpVersionNotSupported, 505)
        assertEquals(ServerError.VariantAlsoNegotiates, 506)
        assertEquals(ServerError.InsufficientStorage, 507)
        assertEquals(ServerError.LoopDetected, 508)
        assertEquals(ServerError.NotExtended, 510)
        assertEquals(ServerError.NetworkAuthenticationRequired, 511)
    }

    @Test
    fun successful() {
        assertEquals(Successful.Ok, 200)
        assertEquals(Successful.Created, 201)
        assertEquals(Successful.Accepted, 202)
        assertEquals(Successful.NonAuthoritativeInformational, 203)
        assertEquals(Successful.NoContent, 204)
        assertEquals(Successful.ResetContent, 205)
        assertEquals(Successful.PartialContent, 206)
        assertEquals(Successful.MultiStatus, 207)
        assertEquals(Successful.AlreadyReported, 208)
        assertEquals(Successful.IMUsed, 226)
    }
}