package kz.kasya.cheena.AttendMe.shared.security;


public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/api/users";
    public static final String SIGN_UP_VALIDATE_URL = "/api/users/validate";
    public static final String LOGIN_URL = "/login";
    public static final String SOCKET_URL = "/socket/**";
}
