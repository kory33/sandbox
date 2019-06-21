/**
 * This example is minified.
 *
 * Moving `inner` outside `outer` or removing `suspend` modifier should make compilation to succeed.
 * Removing `run` also solves the issue.
 */
fun outer() {
    suspend fun inner(): Int = run { inner() }
}
