package ke.ac.ku.ledgerly.auth.domain

data class AuthState(
    val isLoading: Boolean = false,
    val isAuthenticated: Boolean = false,
    val error: String? = null,
    val isBiometricAvailable: Boolean = false
)

sealed class AuthEvent {
    data class EmailSignIn(val email: String, val password: String) : AuthEvent()
    data class EmailSignUp(val email: String, val password: String) : AuthEvent()
    object GoogleSignIn : AuthEvent()
    object BiometricSignIn : AuthEvent()
    object SignOut : AuthEvent()
    object DismissError : AuthEvent()
}